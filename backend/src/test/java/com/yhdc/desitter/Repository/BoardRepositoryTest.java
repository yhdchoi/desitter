package com.yhdc.desitter.Repository;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.yhdc.desitter.repository.BoardRepository;

@SpringBootTest
public class BoardRepositoryTest {
	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	public void testReadWithWriter() {
		Object result = boardRepository.getBoardWithWriter(100L);
		
		Object[] arr = (Object[])result;
		
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void testWithReplyCount() {
		Pageable pageable = PageRequest.of(0,10, Sort.by("bid").descending());
		
		Page<Object[]>result = boardRepository.getBoardWithReplyCount(pageable);
		
		result.get().forEach(row -> {Object[] arr = (Object[])row;
		System.out.println(Arrays.toString(arr));
		});
	}
}
