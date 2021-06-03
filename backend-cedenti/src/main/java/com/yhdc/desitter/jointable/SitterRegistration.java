package com.yhdc.desitter.jointable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.yhdc.desitter.model.Member;
import com.yhdc.desitter.model.Sitter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SitterRegistration {
	@Id
	private Long srid;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	
	@ManyToOne
	@JoinTable(name = "sitter_id")
	private Sitter sitter;
	
	private int rate;
}
