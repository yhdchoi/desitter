package com.yhdc.desitter.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.desitter.model.Reply;
import com.yhdc.desitter.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ReplyService {

	private final ReplyRepository replyRepository;

	// LIST
	@Transactional(readOnly = true)
	public List<Reply> getAllComment() {
		return replyRepository.findAll();
	}

	// GET
	@Transactional(readOnly = true)
	public Reply getCommentById(Long id) {
		Reply commentEntity = replyRepository.findById(id).get();
		return commentEntity;
	}

	// NEW
	@Transactional
	public Reply postComment(Reply reply) {
		Reply newCommentEntity = replyRepository.save(reply);
		return newCommentEntity;
	}

	// UPDATE TITLE, BODY
	@Transactional
	public Reply putComment(Long id, Reply reply) {
		Reply commentEntity = replyRepository.findById(id).get();
		commentEntity.setBody(reply.getBody());
		return commentEntity;
	}

	// DELETE
	@Transactional
	public int deleteComment(Long id) {
		Reply delComment = replyRepository.findById(id).get();

		if (delComment == null) {
			return 0;
		} else {
			replyRepository.delete(delComment);
		}
		return 1;
	}
}
