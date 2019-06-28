package com.sh.board.notice;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sh.board.BoardDAO;
import com.sh.board.BoardDTO;
import com.sh.util.PageMaker;

@Repository
public class NoticeDAO implements BoardDAO{

	
	@Inject
	private SqlSession sqlSession;
	private String mapper = "NoticeMapper.";
	
	@Override
	public int setDelete(int num) throws Exception {
		int result = sqlSession.delete(mapper+"noticeDelete", num);
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		int result = sqlSession.update(mapper+"noticeUpdate", boardDTO);
		return result;
	}

	@Override
	public int setWrtire(BoardDTO boardDTO) throws Exception {
		int result = sqlSession.insert(mapper+"noticeWrite", boardDTO);
		return result;
	}

	@Override
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception {
		
		return sqlSession.selectList(mapper+"noticeList", pageMaker);
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		return sqlSession.selectOne(mapper+"noticeSelect", num);
	}

	@Override
	public int getTotalCount(PageMaker pageMaker) throws Exception {
		int result = sqlSession.selectOne(mapper+"totalCount", pageMaker);
		return result;
	}
	
	
	
}
