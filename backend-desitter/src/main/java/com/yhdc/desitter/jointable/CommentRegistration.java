package com.yhdc.desitter.jointable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.yhdc.desitter.model.Comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentRegistration {
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "comment_id")
	private Comment comment;
}
