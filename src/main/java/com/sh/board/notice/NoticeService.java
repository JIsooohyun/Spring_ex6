package com.sh.board.notice;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sh.board.BoardDTO;
import com.sh.board.BoardService;
import com.sh.file.FileDAO;
import com.sh.file.FileDTO;
import com.sh.util.FileSaver;
import com.sh.util.PagerMaker;

@Service
public class NoticeService implements BoardService{

	@Inject
	private NoticeDAO noticeDAO;
	
	@Inject
	private FileSaver fileSaver; //클래스에 객체를 한번 만든다.필요할 때는 메서드 호출 
	
	@Inject
	private FileDAO fileDAO;
	
	@Override
	public int setDelete(int num) throws Exception {
		int result = noticeDAO.setDelete(num);
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		int result = noticeDAO.setUpdate(boardDTO);
		return result;
	}

	@Override
	public int setWrtire(BoardDTO boardDTO, List<MultipartFile> multipartFiles, HttpSession session) throws Exception{
		
		String realPath = session.getServletContext().getRealPath("/resources/upload");
		
		//파일을 HDD(하드디스크)에 저장
		//Notice 테이블에 저장
		int result = noticeDAO.setWrtire(boardDTO);
		ArrayList<FileDTO> files = new ArrayList<FileDTO>();
		for(MultipartFile multipartFile : multipartFiles) {
			String fname = fileSaver.fileSaver2(realPath, multipartFile); //fname
			FileDTO fileDTO = new FileDTO();
			fileDTO.setNum(boardDTO.getNum());
			fileDTO.setFname(fname);
			fileDTO.setOname(multipartFile.getOriginalFilename());
			//fileDAO.setWrite(fileDTO);
			files.add(fileDTO);
		}
		
		fileDAO.setWrite(files);
		//num을 받아와서
		//files 테이블에 저장
		return result;
	}
	

	@Override
	public List<BoardDTO> getList(PagerMaker pageMaker) throws Exception {
		pageMaker.makeRow();
		int totalCount = noticeDAO.getTotalCount(pageMaker);
		//page처리 계산
		pageMaker.makePage(totalCount);
		List<BoardDTO> ar = noticeDAO.getList(pageMaker);
		return ar;
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		BoardDTO boardDTO = noticeDAO.getSelect(num);
		return boardDTO;
	}

	
}
