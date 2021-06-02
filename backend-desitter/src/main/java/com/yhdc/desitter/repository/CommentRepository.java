package com.yhdc.desitter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.desitter.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	List<Comment> findByUser_id(Long user_id);
	
	List<Comment> findByUsername(String username);

}
