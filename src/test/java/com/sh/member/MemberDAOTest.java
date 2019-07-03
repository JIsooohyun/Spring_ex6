package com.sh.member;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.sh.file.MemberFileDAO;
import com.sh.file.MemberFileDTO;
import com.sh.s6.AbstractTest;

public class MemberDAOTest extends AbstractTest{

	@Inject
	private MemberDAO memberDAO;
	
	@Inject
	private MemberFileDAO memberFileDAO;
	
	/*@Test
	public void writeTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id");
		memberDTO.setPw("pw");
		memberDTO.setName("name");
		memberDTO.setEmail("id@a.com");
		
		int result = memberDAO.setWrite(memberDTO);
		assertEquals(1, result);
		
	}*/
	@Test
	public void loginTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("aaa");
		memberDTO.setPw("aaa");
		memberDTO = memberDAO.getSelect(memberDTO);
		System.out.println(memberDTO.getEmail());
		System.out.println(memberDTO.getMemberFileDTO().getFname());
	}
	@Test
	public void test()throws Exception{
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId("ID");
		memberFileDTO.setFname("fname");
		memberFileDTO.setOname("oname");
		
		int result = memberFileDAO.setWrite(memberFileDTO);
		assertEquals(1, result);
	}
}
