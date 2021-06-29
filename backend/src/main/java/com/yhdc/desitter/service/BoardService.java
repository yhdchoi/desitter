package com.yhdc.desitter.service;

import com.yhdc.desitter.dto.BoardDTO;
import com.yhdc.desitter.model.Board;
import com.yhdc.desitter.model.Member;

public interface BoardService {

	Long register(BoardDTO dto);

	default Board dtoToEntity(BoardDTO dto) {

		Member member = Member.builder().email(dto.getWriterEmail()).build();

		Board board = Board.builder().bid(dto.getBid()).title(dto.getTitle()).body(dto.getBody()).writer(member)
				.build();

		return board;
	}

}
