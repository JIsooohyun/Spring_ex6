package com.sh.s6;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sh.board.BoardDTO;
import com.sh.board.notice.NoticeDTO;
import com.sh.board.notice.NoticeService;
import com.sh.util.PageMaker;

@Controller
@RequestMapping("/notice/")
public class NoticeController {
	@Inject
	private NoticeService noticeService;
	
	@RequestMapping(value="noticeWrite", method = RequestMethod.GET)
	public String NoticeWrte(Model model)throws Exception {
		model.addAttribute("board", "notice");
		return "board/boardWrite";
	}
	
	@RequestMapping(value="noticeWrite", method = RequestMethod.POST)
	public String NoticeWrte(NoticeDTO noticeDTO)throws Exception {
		
		int result = noticeService.setWrtire(noticeDTO);
		
		return "redirect:./noticeList";
	}
	
	 //model이면 클래스에 맵핑된 "/notice/"+메서드에 맵핑된 "noticeList"가 합쳐져서 리턴된다. 
	@RequestMapping(value="noticeList", method = RequestMethod.GET)
	public ModelAndView getList(PageMaker pageMaker) throws Exception{
		List<BoardDTO> ar = noticeService.getList(pageMaker);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardList");
		mv.addObject("board", "notice");
		return mv;
		
		//return값이 void이면 model이면 클래스에 맵핑된 "/notice/"+메서드에 맵핑된 "noticeList"가 합쳐져서 리턴된다. 
	}
	
	@RequestMapping(value="noticeSelect", method = RequestMethod.GET)
	public ModelAndView NoticeSelect(@RequestParam(defaultValue = "0", required = false)int num)throws Exception{
		ModelAndView mv = new ModelAndView();
		BoardDTO boardDTO = noticeService.getSelect(num);
		mv.addObject("boardDTO", boardDTO); //mv.addObject(boardDTO); 키 이름을 넣지않으면 변수명이 키이름이 된다. 
		mv.setViewName("board/boardSelect");
		mv.addObject("board", "notice");
		return mv;
	}
}
