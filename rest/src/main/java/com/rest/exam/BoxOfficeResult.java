package com.rest.exam;

import java.util.List;

import lombok.Data;

@Data
public class BoxOfficeResult {
	private String boxofficeType;
	private String showRange;
	List<DailyBoxOffice> dailyBoxOfficeList;
	
}
