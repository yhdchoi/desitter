package com.yhdc.desitter.jointable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.yhdc.desitter.model.Board;

@Entity
public class BoardRegistration {
	@Id
	private Long id;
	
	@ManyToOne
	private Board board;	
	
	@OneToMany(mappedBy = "comment")
	private List<CommentRegistration> comments;
}
