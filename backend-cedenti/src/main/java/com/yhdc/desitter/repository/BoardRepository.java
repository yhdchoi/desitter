package com.yhdc.desitter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.desitter.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
	
	List<Board> findByTitle(String title);
	
	List<Board> findByUser_id(Long user_id);

}
