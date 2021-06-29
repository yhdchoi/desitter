package com.yhdc.desitter.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.desitter.model.Member;
import com.yhdc.desitter.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {
	private final MemberRepository memberRepository;

// LIST
	@Transactional(readOnly = true)
	public List<Member> getAllMember() {
		return memberRepository.findAll();
	}

// GET
	@Transactional(readOnly = true)
	public Member getMemberById(Long id) {
		Member memberEntity = memberRepository.findById(id).get();
		return memberEntity;
	}

// NEW
	@Transactional
	public Member postMember(Member member) {
		Member memberEntity = memberRepository.save(member);
		return memberEntity;
	}

// UPDATE USERNAME, EMAIL, ROLE
	@Transactional
	public Member putUser(Long id, Member member) {
		Member memberEntity = memberRepository.findById(id).get();
		memberEntity.setUsername(member.getUsername());
		memberEntity.setEmail(member.getEmail());
		memberEntity.setRole(member.getRole());
		return memberEntity;
	}

// UPDATE PASSWORD
	@Transactional
	public Member patchUserPassword(Long id, String newPassword) {
		Member memberEntity = memberRepository.findById(id).get();
		memberEntity.setPassword(newPassword);
		return memberEntity;
	}

// DELETE
	@Transactional
	public int deleteUser(Long id) {
		Member delMember = memberRepository.findById(id).get();

		if (delMember == null) {
			return 0;
		} else {
			memberRepository.delete(delMember);
		}
		return 1;
	}
}
