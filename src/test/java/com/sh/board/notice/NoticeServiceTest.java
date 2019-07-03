package com.sh.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.junit.Test;

import com.sh.board.BoardDTO;
import com.sh.file.FileDTO;
import com.sh.s6.AbstractTest;
import com.sh.util.FileSaver;
import com.sh.util.PagerMaker;

public class NoticeServiceTest extends AbstractTest{
	@Inject
	private NoticeService noticeService;
	
	@Inject
	private FileSaver fileSaver;
	
	
	@Test
	public void test() throws Exception{
		PagerMaker pageMaker = new PagerMaker();
		pageMaker.setCurPage(1);
		
		List<BoardDTO> ar =noticeService.getList(pageMaker);
		assertEquals(10, ar.size());
	}
	/*@Test
	public void TestNotice(HttpSession session)throws Exception{
		
		String realPath = session.getServletContext().getRealPath("/resources/upload");
		
		fileSaver.saveFile3(realPath, multipartFiles);
		
	}*/
}
