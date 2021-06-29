package com.yhdc.desitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.desitter.model.Reply;

public interface SitterRepository extends JpaRepository<Reply, Long> {

}
