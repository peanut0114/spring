package com.rest.exam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rest.exam.mapper.RestMapper;

@RestController
public class MovieController {
	
	@Autowired 
	RestMapper mapper;
	
	@RequestMapping(value="restAPI")
	public List<DailyBoxOffice> restAPI(){
		//restTemplate 선언
		RestTemplate rest = new RestTemplate();
		
		//가져올 데이터 url과 어떻게 담을지 알면 사용할 수 있다
		//boxOffice에 url에 있는 정보 호출 (json 형태 정보)
//		BoxOffice boxOffice = rest.getForObject("http://kobis.or.kr/"
//				+ "kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?"
//				+ "key=f5eef3421c602c6cb7ea224104795888&targetDt=20221030", BoxOffice.class);
		
		BoxOffice boxOfficeExam = rest.getForObject("http://kobis.or.kr/"
				+ "kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?"
				+ "key=f5eef3421c602c6cb7ea224104795888&targetDt=20221020", BoxOffice.class);
		
//		//영화내용을 가져옴
//		ArrayList<String> list = new ArrayList<String>();		
//		System.out.println(boxOffice.boxOfficeResult.getDailyBoxOfficeList());
//		System.out.println(boxOffice.boxOfficeResult.getBoxofficeType());
//		System.out.println(boxOffice.boxOfficeResult.getShowRange());
//		//가져온 데이터 중에서 DailyBoxOfficeList만 가져옴.
//		List<DailyBoxOffice> dailyBoxOffice = boxOfficeExam.getBoxOfficeResult().getDailyBoxOfficeList();
		
		ArrayList<DailyBoxOffice> list = new ArrayList<DailyBoxOffice>();		
		List<DailyBoxOffice> dailyBoxOffice = boxOfficeExam.getBoxOfficeResult().getDailyBoxOfficeList();
		//제목 출력
		for(int i = 0; i< dailyBoxOffice.size(); i++) {
			System.out.println(dailyBoxOffice.get(i).getMovieNm());
			
			if(dailyBoxOffice.get(i).getRankOldAndNew().equals("OLD")) {
				dailyBoxOffice.get(i).setRankOldAndNew("0");
			}else {
				dailyBoxOffice.get(i).setRankOldAndNew("1");
			}
			//mapper.insertMovieNm(dailyBoxOffice.get(i).getMovieNm());
			mapper.insertBoxoffice(dailyBoxOffice.get(i));
			list.add(dailyBoxOffice.get(i));
		}		
		return list;
	}
}
