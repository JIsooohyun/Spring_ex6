package com.sh.board.qna;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sh.board.BoardDTO;
import com.sh.board.BoardService;
import com.sh.util.PagerMaker;

@Service
public class QnaService implements BoardService{

	@Inject
	private QnaDAO qnaDAO;
	
	@Override
	public int setDelete(int num) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setDelete(num);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setUpdate(boardDTO);
	}

	@Override
	public int setWrtire(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setWrtire(boardDTO);
	}

	@Override
	public List<BoardDTO> getList(PagerMaker pageMaker) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getList();
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		return qnaDAO.getSelect(num);
	}

}
