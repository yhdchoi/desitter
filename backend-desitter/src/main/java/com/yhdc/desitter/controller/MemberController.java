package com.yhdc.desitter.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.desitter.model.Member;
import com.yhdc.desitter.response.Message;
import com.yhdc.desitter.response.ResponseMsg;
import com.yhdc.desitter.response.StatusEnum;
import com.yhdc.desitter.service.MemberService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MemberController {

	private final MemberService memberService;
	private final ResponseMsg responseMsg;

// GET
	@CrossOrigin
	@GetMapping("/members")
	public ResponseEntity<Message> getAllMember() {

		// TODO: Check Permit

		List<Member> member = memberService.getAllMember();
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(member, StatusEnum.NOT_FOUND,
				StatusEnum.OK);

		return reponseMessage;
	}

	@CrossOrigin
	@GetMapping("/user/{id}")
	public ResponseEntity<Message> getUserById(@PathVariable Long id) {

		// TODO: Security Check Permit

		Member member = memberService.getMemberById(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(member, StatusEnum.NOT_FOUND,
				StatusEnum.OK);

		return reponseMessage;
	}

// POST
	@CrossOrigin
	@PostMapping("/newuser")
	public ResponseEntity<Message> postUser(@RequestBody Member newmember) {

		// TODO: Check Permit

		Member member = memberService.postMember(newmember);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(member, StatusEnum.BAD_REQUEST,
				StatusEnum.CREATED);

		return reponseMessage;
	}

// PUT PERSONAL INFO
	@CrossOrigin
	@PutMapping("/user/{id}")
	public ResponseEntity<Message> putUser(@PathVariable Long id, @RequestBody Member member) {

		// TODO: Check Permit

		Member updatedUser = memberService.putUser(id, member);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(updatedUser, StatusEnum.BAD_REQUEST,
				StatusEnum.OK);

		return reponseMessage;
	}

// PATCH PASSWORD
	@CrossOrigin
	@PatchMapping("/user/{id}")
	public ResponseEntity<Message> patchUser(@PathVariable Long id, @RequestBody String password) {

		// TODO: Check Permit

		Member member = memberService.patchUserPassword(id, password);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(member, StatusEnum.BAD_REQUEST,
				StatusEnum.OK);

		return reponseMessage;
	}

// DELETE
	@CrossOrigin
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Message> deleteMember(@PathVariable Long id) {

		// TODO: Check Permit

		int returnCode = memberService.deleteUser(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageDelTemplate(returnCode,
				StatusEnum.INTERNAL_SERVER_ERROR, StatusEnum.OK);

		return reponseMessage;
	}

}