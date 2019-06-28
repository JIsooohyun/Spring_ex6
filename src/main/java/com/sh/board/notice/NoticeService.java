package com.sh.board.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sh.board.BoardDTO;
import com.sh.board.BoardService;
import com.sh.util.PageMaker;

@Service
public class NoticeService implements BoardService{

	@Inject
	private NoticeDAO noticeDAO;
	
	@Override
	public int setDelete(int num) throws Exception {
		int result = noticeDAO.setDelete(num);
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		int result = noticeDAO.setUpdate(boardDTO);
		return result;
	}

	@Override
	public int setWrtire(BoardDTO boardDTO) throws Exception {
		int result = noticeDAO.setWrtire(boardDTO);
		return result;
	}

	@Override
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception {
		pageMaker.makeRow();
		int totalCount = noticeDAO.getTotalCount(pageMaker);
		//page처리 계산
		pageMaker.makePage(totalCount);
		List<BoardDTO> ar = noticeDAO.getList(pageMaker);
		return ar;
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		BoardDTO boardDTO = noticeDAO.getSelect(num);
		return boardDTO;
	}

	
}
