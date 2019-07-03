package com.sh.s6;

import java.io.File;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sh.board.BoardDTO;
import com.sh.board.notice.NoticeDTO;
import com.sh.board.notice.NoticeService;
import com.sh.util.FileSaver;
import com.sh.util.PagerMaker;

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
	 
	public String NoticeWrite(NoticeDTO noticeDTO, Model model, List<MultipartFile> f1,HttpSession session)throws Exception {

		int result = noticeService.setWrtire(noticeDTO, f1, session);
		String view = "common/messageMove";
		if(result>0) {
			view="redirect:./noticeList";
		}else {
			model.addAttribute("path", "./noticeList");
			model.addAttribute("message", "write Fail"	);
		}
		return view;
	}
	 //model이면 클래스에 맵핑된 "/notice/"+메서드에 맵핑된 "noticeList"가 합쳐져서 리턴된다. 
	@RequestMapping(value="noticeList", method = RequestMethod.GET)
	public ModelAndView getList(PagerMaker pageMaker, ModelAndView mv) throws Exception{
		List<BoardDTO> ar = noticeService.getList(pageMaker);
		
		mv.addObject("list", ar);
		mv.addObject("pager", pageMaker);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		return mv;
		
		//return값이 void이면 model이면 클래스에 맵핑된 "/notice/"+메서드에 맵핑된 "noticeList"가 합쳐져서 리턴된다. 
	}
	
	@RequestMapping(value="noticeSelect", method = RequestMethod.GET)
	public String NoticeSelect(Model model, @RequestParam(defaultValue = "0", required = false)int num)throws Exception{
		ModelAndView mv = new ModelAndView();
		BoardDTO boardDTO = noticeService.getSelect(num);
		String view = "common/messageMove";
		if(boardDTO!=null) {
			view = "board/boardSelect";
			model.addAttribute("board", "notice");
			model.addAttribute("boardDTO", boardDTO);
		}else {
			model.addAttribute("message", "No Contents");
			model.addAttribute("path", "./noticeList");
		}
		
		return view;
	}
	
	@RequestMapping(value="noticeDelete", method = RequestMethod.GET)
	public String NoticeDelete(int num, Model model )throws Exception{
		
		int result = noticeService.setDelete(num);
		String view = "common/messageMove";
		if(result>0){
			model.addAttribute("message", "delete success");
			model.addAttribute("path", "./noticeList");
		}else {
			model.addAttribute("message", "delete fail");
			model.addAttribute("path", "./noticeList");
		}
		return view;
	}
	
	@RequestMapping(value="noticeUpdate", method = RequestMethod.GET)
	public String NoticeUpdate(int num, Model model)throws Exception{
		BoardDTO boardDTO = noticeService.getSelect(num);
		model.addAttribute("board", "notice");
		model.addAttribute("boardDTO", boardDTO);
		return "./board/boardUpdate";
	}
	
	@RequestMapping(value="noticeUpdate", method=RequestMethod.POST)
	public String NoticeUpdate(NoticeDTO noticeDTO, Model model)throws Exception{
		
		String view = "common/messageMove";
		int result = noticeService.setUpdate(noticeDTO);
		if(result>0) {
			model.addAttribute("message", "update success");
			model.addAttribute("path", "./noticeList");
		}else {
			model.addAttribute("message", "update fail");
			model.addAttribute("path", "./noticeList");
		}
		return view;
		
	}
}
