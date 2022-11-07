package com.rest.exam.mapper;

import org.springframework.stereotype.Repository;

import com.rest.exam.DailyBoxOffice;

@Repository
public interface RestMapper {

	//영화 제목 삽입
	public int insertMovieNm(String movieName);
	//박스오피스 정보 등록
	public int insertBoxoffice(DailyBoxOffice dailyBoxOffice);
}
