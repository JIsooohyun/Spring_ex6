package com.sh.member;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


public class MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE = "MemberMapper.";
	
	
	public int setWrite(MemberDTO memberDTO)throws Exception{
		int result = sqlSession.insert(NAMESPACE+"setWrtie", memberDTO);
				
		return result;
	}
	
	public MemberDTO getSelect(MemberDTO memberDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getSelect", memberDTO);
	}
}
