package com.sh.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sh.board.BoardDTO;
import com.sh.member.MemberDTO;
import com.sh.s6.AbstractTest;
import com.sh.util.PagerMaker;
public class NoticeDAOTest extends AbstractTest{
	
	@Inject //주입을 해줘도 들어오지 않는다. -> Annotation을 사용해라! 
	private NoticeDAO noticeDAO;
	
	
	
	
	@Test
	public void getCount()throws Exception{
		PagerMaker pageMaker = new PagerMaker();
		pageMaker.setKind("1");
		pageMaker.setSearch("i");
		int result = noticeDAO.getTotalCount(pageMaker);
		System.out.println(result);
		assertEquals(1, result);
	}
	/*@Test
	public void selectList()throws Exception{
		//List<BoardDTO> ar = noticeDAO.getList();
		//assertEquals(3, ar.size());
	}
	@Test
	public void selectOne()throws Exception{
		BoardDTO boardDTO = noticeDAO.getSelect(10);
		//System.out.println(boardDTO.getTitle());
		assertNotNull(boardDTO);
		
		
	}

	@Test
	public void update()throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(12);
		noticeDTO.setTitle("ititit");
		noticeDTO.setContents("shfksfjl");
		int result = noticeDAO.setUpdate(noticeDTO);
		assertEquals(1, result);
	}
	@Test
	public void test()throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setWriter("mmm");
		noticeDTO.setTitle("ttt");
		noticeDTO.setContents("cccc");
		int result = noticeDAO.setWrtire(noticeDTO);
		assertEquals(1, result);
		
	}
	/*@Test
	public void delete()throws Exception{
		int result = noticeDAO.setDelete(13);
		assertEquals(1, result);
	}
	@Test
	public void update()throws Exception{
		NoticeDTO boardDTO = new NoticeDTO();
		boardDTO.setContents("test Contents");
		boardDTO.setWriter("test1");
		boardDTO.setNum(6);
		int result = noticeDAOImpl.setUpdate(boardDTO);
		assertEquals(1, result);
	}
	@Test
	public void delete()throws Exception{
		int result = noticeDAOImpl.setDelete(8);
		assertEquals(1, result);
	}
	@Test
	public void test() throws Exception{
		BoardDTO boardDTO = noticeDAOImpl.getSelect(8);
		assertNotNull(boardDTO);
	}

	
	@Before//테스트 메서드 각각 실행전 한번씩 실행
	public void t() {}
	
	@BeforeClass //전체테스트 하기전 딱 한번 실행
	public static void t2() {}
	
	@After//테스트 메서드 각각 실행 후 한번씩 실행
	public void t3() {} 
	
	@AfterClass//전체 테스트 후 딱 한번 실행
	public static void t4() {}*/
}
