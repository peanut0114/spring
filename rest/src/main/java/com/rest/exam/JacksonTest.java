package com.rest.exam;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
	public static void main(String[] args) {
		String movie = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20221020";
		
		URL url = null;
		try {
			url = new URL(movie);
		}catch(MalformedURLException e) {
			System.out.println("잘못된 URL 형식입니다");
			System.exit(1);
		}
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			//url 내용을 제이슨으로 파싱
			JsonNode node = mapper.readTree(url);
			//트리의 노드를 가져왓는지 확인 (키값을 알아야 한다)
			System.out.println(node);//구조
			
			//System.out.println("==="+node.path("boxOfficeResult").asText()+"===");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
