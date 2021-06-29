package com.yhdc.desitter.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yhdc.desitter.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	List<Board> findByTitle(String title);

	@Query("SELECT b, w FROM Board b LEFT JOIN b.writer w WHERE b.bid = :bid'")
	Object getBoardWithWriter(@Param("bid") Long bid);

	@Query("SELECT b, r FROM Board b LEFT JOIN Reply r ON r.board = b HWERE b.bid = :bid")
	List<Object[]> getBoardWithComment(@Param("bid") Long bid);

	@Query(value = "SELECT b, w, count(r) FROM Board b LEFT JOIN b.writer w LEFT JOIN Reply r ON r.board = b GROUP BY b", 
			countQuery = "SELECT count(b) FROM Board b")
	Page<Object[]> getBoardWithReplyCount(Pageable pageable);
}
