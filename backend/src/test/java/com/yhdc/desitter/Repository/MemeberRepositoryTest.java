package com.yhdc.desitter.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.desitter.repository.MemberRepository;

@SpringBootTest
public class MemeberRepositoryTest {
	@Autowired
	MemberRepository memberRepository;
	
	@Test
	public void testClass() {
		System.out.println(memberRepository.getClass().getName());
		
	}
	
	
	
}
