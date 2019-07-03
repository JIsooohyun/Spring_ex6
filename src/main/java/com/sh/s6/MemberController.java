package com.sh.s6;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.sh.member.MemberDTO;
import com.sh.member.MemberSerivce;

@Controller
@RequestMapping("/member/")
public class MemberController {

	
	@Inject
	private MemberSerivce memberService;
	
	//myPage
	@RequestMapping(value="memberPage", method = RequestMethod.GET)
	public void memberPage() throws Exception{
		
	}
	
	//로그인 처리
	@RequestMapping(value="memberLogin", method = RequestMethod.POST)
	public String getSelect(MemberDTO memberDTO, Model model, HttpSession session)throws Exception{
		String view = "common/messageMove";
		
		memberDTO= memberService.getSelect(memberDTO);
		
		if(memberDTO!=null) {
			session.setAttribute("member", memberDTO);
			model.addAttribute("path", "../");
			model.addAttribute("message", "login Success");
		}else {
			model.addAttribute("path", "../");
			model.addAttribute("message", "login Fail");
		}
		return view;
	}
	//로그인
	@RequestMapping(value="memberLogin", method = RequestMethod.GET)
	public void getSelect()throws Exception{}
	
	//회원가입 처리
	@RequestMapping(value="memberWrite", method =RequestMethod.POST)
	public String setWrite(MemberDTO memberDTO, MultipartFile photo, Model model, HttpSession session) throws Exception{
		int result = memberService.setWrite(memberDTO, photo, session);
		String view = "common/messageMove";
		if(result>0) {
			model.addAttribute("path", "../");
			model.addAttribute("message", "Join success");
		}else{
			model.addAttribute("path", "../");
			model.addAttribute("message", "Join Fail");
		}
		return view;
	}
	
	//회원가입
	@RequestMapping(value="memberWrite", method = RequestMethod.GET)
	public String getWrite()throws Exception{
		return "member/memberJoin";
	}
	//로그아웃
	@RequestMapping(value="memberLogout")
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
}








