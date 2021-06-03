package com.yhdc.desitter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Member extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mid;

	@Column(length = 20, nullable = false)
	private String username;
	@Column(length = 20, nullable = false)
	private String password;
	@Column(length = 20, nullable = false)
	private String email;
	@Column(length = 20, nullable = false)
	private String firstname;
	@Column(length = 20, nullable = false)
	private String lastname;
	@Column(length = 20, nullable = false)
	private Long phone;
	@Column(length = 100, nullable = false)
	private String address;
	@Column(nullable = false)
	private String role;
	@Column(nullable = false)
	private String authority;
	@Column(nullable = false)
	private int active;

}
