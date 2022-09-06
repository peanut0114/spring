package com.yedam.java.board.service;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int bno;
	private String title;
	private String contents;
	private String writer;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedate;
	private String image;	//이미지 파일명 등록, 단건조회시 볼 수 있게 함
}
