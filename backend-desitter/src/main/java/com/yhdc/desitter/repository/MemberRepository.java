package com.yhdc.desitter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.desitter.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
	List<Member> findByEmail(String email);
	
	List<Member> findByUsername(String username);
}
