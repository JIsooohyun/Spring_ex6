package com.sh.board.notice;

import java.util.List;

import com.sh.board.BoardDTO;
import com.sh.file.FileDTO;

public class NoticeDTO extends BoardDTO{
	private List<FileDTO> files;

	public List<FileDTO> getFiles() {
		return files;
	}

	public void setFiles(List<FileDTO> files) {
		this.files = files;
	}
	
	
}
