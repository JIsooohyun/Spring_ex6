package com.sh.board.qna;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.sh.board.BoardDTO;
import com.sh.s6.AbstractTest;

public class QnaTest extends AbstractTest{

	@Inject
	private QnaService qnaService;
	
	@Test
	public void delete()throws Exception{
		int result = qnaService.setDelete(9);
		assertEquals(1, result);
	}
	
	@Test
	public void update()throws Exception{
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("tttt");
		boardDTO.setContents("cocococo");
		boardDTO.setNum(7);
		int result = qnaService.setUpdate(boardDTO);
		assertEquals(1, result);
	}
	@Test
	public void selectList()throws Exception{
		List<BoardDTO> ar  = qnaService.getList();
		assertEquals(3, ar.size());
	}
	
	@Test
	public void selectOne()throws Exception{
		BoardDTO boardDTO = qnaService.getSelect(4);
		assertNotNull(boardDTO);
		
	}
	@Test
	public void test() throws Exception{
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("title6");
		boardDTO.setWriter("writer");
		boardDTO.setContents("contents");
	
		int result = qnaService.setWrtire(boardDTO);
		
		assertEquals(1, result);
	}

}
