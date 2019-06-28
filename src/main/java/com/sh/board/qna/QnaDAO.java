package com.sh.board.qna;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sh.board.BoardDAO;
import com.sh.board.BoardDTO;

@Repository
public class QnaDAO implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	private String mapper = "QnaMapper.";
	
	@Override
	public int setDelete(int num) throws Exception {
		int result = sqlSession.delete(mapper+"qnaDelete", num);
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		int result = sqlSession.update(mapper+"qnaUpdate", boardDTO);
		return result;
	}

	@Override
	public int setWrtire(BoardDTO boardDTO) throws Exception {
		int result = sqlSession.insert(mapper+"qnaWrite", boardDTO);
		return result;
	}

	@Override
	public List<BoardDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapper+"qnaList");
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		BoardDTO boardDTO = sqlSession.selectOne(mapper+"qnaSelect", num);
		return boardDTO;
	}

}
