package com.yhdc.desitter.service;

import org.springframework.stereotype.Service;

import com.yhdc.desitter.dto.BoardDTO;
import com.yhdc.desitter.model.Board;
import com.yhdc.desitter.repository.BoardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class BoardServiceImpl implements BoardService {

	private final BoardRepository boardRepository;

	@Override
	public Long register(BoardDTO dto) {
		log.info(dto);
		Board board = dtoToEntity(dto);
		boardRepository.save(board);
		return board.getBid();
	}
}
