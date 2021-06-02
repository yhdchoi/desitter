package com.yhdc.desitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.desitter.model.Comment;

public interface SitterRepository extends JpaRepository<Comment, Long> {

}
