package com.yhdc.desitter.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.desitter.model.Reply;
import com.yhdc.desitter.response.Message;
import com.yhdc.desitter.response.ResponseMsg;
import com.yhdc.desitter.response.StatusEnum;
import com.yhdc.desitter.service.ReplyService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ReplyController {

	private final ReplyService replyService;
	private final ResponseMsg responseMsg;

// GET
	@CrossOrigin
	@GetMapping("/comments")
	public ResponseEntity<Message> getAllComment() {

		// TODO: Check Permit

		List<Reply> reply = replyService.getAllComment();
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(reply, StatusEnum.NOT_FOUND,
				StatusEnum.FOUND);

		return reponseMessage;
	}

	@CrossOrigin
	@GetMapping("/comment/{id}")
	public ResponseEntity<Message> getBoardById(@PathVariable Long id) {

		// TODO: Security Check Permit

		Reply reply = replyService.getCommentById(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(reply, StatusEnum.NOT_FOUND,
				StatusEnum.FOUND);

		return reponseMessage;
	}

// POST
	@CrossOrigin
	@PostMapping("/newcomment")
	public ResponseEntity<Message> postBoard(@RequestBody Reply newcomment) {

		// TODO: Check Permit

		Reply reply = replyService.postComment(newcomment);		
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(reply, StatusEnum.BAD_REQUEST,
				StatusEnum.CREATED);

		return reponseMessage;
	}

// PUT
	@CrossOrigin
	@PutMapping("/comment/{id}")
	public ResponseEntity<Message> putUser(@PathVariable Long id, @RequestBody Reply reply) {

		// TODO: Check Permit

		Reply updatedComment = replyService.putComment(id, reply);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(updatedComment, StatusEnum.BAD_REQUEST,
				StatusEnum.OK);

		return reponseMessage;
	}

// DELETE
	@CrossOrigin
	@DeleteMapping("/comment/{id}")
	public ResponseEntity<Message> deleteBoard(@PathVariable Long id) {

		// TODO: Check Permit

		int returnCode = replyService.deleteComment(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageDelTemplate(returnCode,
				StatusEnum.INTERNAL_SERVER_ERROR, StatusEnum.OK);

		return reponseMessage;
	}
}
