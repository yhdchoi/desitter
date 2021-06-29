package com.yhdc.desitter.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
	private Long bid;
	private String title;
	private String body;
	private String writerEmail;
	private String writerUsername;
	private LocalDateTime regDate;
	private LocalDateTime modDate;
	private int replyCount;
}
