package com.sh.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.sh.board.BoardDTO;
import com.sh.s6.AbstractTest;
import com.sh.util.PageMaker;

public class NoticeServiceTest extends AbstractTest{
	@Inject
	private NoticeService noticeService;
	@Test
	public void test() throws Exception{
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCurPage(1);
		
		List<BoardDTO> ar =noticeService.getList(pageMaker);
		assertEquals(10, ar.size());
	}

}
