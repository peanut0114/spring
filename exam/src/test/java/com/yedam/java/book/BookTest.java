package com.yedam.java.book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class BookTest {

	@Autowired
	BookService service;

	@Test
	public void BookAllProcess() {
		// 등록
		BookVO info = new BookVO();

		info.setBookNo(3);
		info.setBookName("테스트 제목");
		info.setBookCoverimg("test-cover");
		info.setBookPrice(5000);
		info.setBookPublisher("test-publ");
		info.setBookInfo("test info");

		int result = service.insertBook(info);

		assertEquals(result, 1);

		// 단건조회 BoardVO findVO = service.getBoardInfo(info); assertNotNull(findVO);

		// 수정 info.setContents("수정-내용"); result = service.updateBoard(info);

		// 전체조회 
//		List<BookVO> list = service.getBookList();
//		assertNotNull(list);

		// 삭제 result = service.deleteBoard(info); assertEquals(result,1);

	}

}
