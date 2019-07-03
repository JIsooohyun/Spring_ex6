package com.sh.member;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sh.file.MemberFileDAO;
import com.sh.file.MemberFileDTO;
import com.sh.util.FileSaver;


public class MemberSerivce {

	@Inject
	private MemberDAO memberDAO;
	//@Inject
	private FileSaver fileSaver;
	@Inject
	private MemberFileDAO memberFileDAO;
	
	public int setWrite(MemberDTO memberDTO, MultipartFile photo, HttpSession session)throws Exception{
		//1. 저장경로
		fileSaver = new FileSaver();
		String realPath = session.getServletContext().getRealPath("/resources/member");
		System.out.println(realPath);
		String fname = fileSaver.fileSaver2(realPath, photo);
		MemberFileDTO memberFileDTO =new MemberFileDTO();
		memberFileDTO.setId(memberDTO.getId());
		memberFileDTO.setFname(fname);
		memberFileDTO.setOname(photo.getOriginalFilename());
		
		
		int result = memberDAO.setWrite(memberDTO);
		result = memberFileDAO.setWrite(memberFileDTO);
		
		
		return result;
	}
	
	
	public MemberDTO getSelect(MemberDTO memberDTO)throws Exception{ //로그인할 때 사진도 가져오기
		
		memberDTO = memberDAO.getSelect(memberDTO);
	
		return memberDTO;
	}
}
