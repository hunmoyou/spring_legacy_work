package com.spring.basic.board.controller;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @Service @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BoardModifyRequestDTO {
	
	private int boardNo;
	private String writer;
	private String title;
	private String content;
}










