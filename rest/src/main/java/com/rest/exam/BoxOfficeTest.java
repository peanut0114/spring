package com.rest.exam;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BoxOfficeTest {
	private int seq;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date regDate;
	private int rank;
	private String newYn;
	private String movieCd;
	private String movieNm;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date openDate;
}
