package com.yhdc.desitter.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.yhdc.desitter.jointable.SitterRegistration;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String petname;
	private int petage;
	
	@ManyToOne
	private Member member;
	
	@OneToMany(mappedBy = "sitter")
	private List<SitterRegistration> sitters;
	
	@CreationTimestamp
	private Timestamp createDate;
	@UpdateTimestamp
	private Timestamp updateDate;
}
