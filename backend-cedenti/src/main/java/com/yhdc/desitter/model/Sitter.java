package com.yhdc.desitter.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.yhdc.desitter.jointable.BoardRegistration;
import com.yhdc.desitter.jointable.CommentRegistration;
import com.yhdc.desitter.jointable.SitterRegistration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sitter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastname;
	private Long phone;
	private String address;
	private String role;
	private String authority;
	private String active;

	@OneToMany(mappedBy = "member")
	private List<SitterRegistration> members;
	
	@OneToMany(mappedBy = "pet")
	private List<SitterRegistration> pets;
	
	@OneToMany(mappedBy = "board")
	private List<BoardRegistration> boards;
	
	@OneToMany(mappedBy = "comment")
	private List<CommentRegistration> comments;
	
	@CreationTimestamp
	private Timestamp createDate;
	@UpdateTimestamp
	private Timestamp updateDate;

}
