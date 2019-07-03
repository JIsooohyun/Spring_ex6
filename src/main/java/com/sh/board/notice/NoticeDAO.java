package com.sh.board.notice;


import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sh.board.BoardDAO;
import com.sh.board.BoardDTO;
import com.sh.util.PagerMaker;

@Repository
public class NoticeDAO implements BoardDAO{

	
	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE = "NoticeMapper.";
	
	@Override
	public int setDelete(int num) throws Exception {
		int result = sqlSession.delete(NAMESPACE+"noticeDelete", num);
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		int result = sqlSession.update(NAMESPACE+"noticeUpdate", boardDTO);
		return result;
	}

	@Override
	public int setWrtire(BoardDTO boardDTO) throws Exception {
		
		int result = sqlSession.insert(NAMESPACE+"noticeWrite", boardDTO);
		
		return result;
	}

	@Override
	public List<BoardDTO> getList(PagerMaker pageMaker) throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"noticeList", pageMaker);
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"noticeSelect", num);
	}

	@Override
	public int getTotalCount(PagerMaker pageMaker) throws Exception {
		int result = sqlSession.selectOne(NAMESPACE+"totalCount", pageMaker);
		return result;
	}
	
}
