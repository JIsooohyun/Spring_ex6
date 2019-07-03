package com.sh.board;

import java.util.List;

import com.sh.util.PagerMaker;

public interface BoardDAO {
	
	//글 삭제
	public int setDelete(int num)throws Exception;
	//글 수정
	public int setUpdate(BoardDTO boardDTO)throws Exception;
	
	//글을 등록
	public int setWrtire(BoardDTO boardDTO)throws Exception;
	
	//글 리스트
	public List<BoardDTO> getList(PagerMaker pageMaker)throws Exception;
	
	//글 하나
	public BoardDTO getSelect(int num)throws Exception;
	
	public int getTotalCount(PagerMaker pageMaker)throws Exception;
}
