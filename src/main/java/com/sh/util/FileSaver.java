package com.sh.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;


public class FileSaver {
	
	//1. Spring에서 제공하는 FileCopyUtils클래스의 copy메서드 사용
	//2. 저장경로, MultipartFile
	public String saveFile(String realPath, MultipartFile multipartFile)throws Exception{
		
		File file = new File(realPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		//a. 저장할 파일명을 생성
		//	UUID 클래스를 사용
		String fileSystemName = UUID.randomUUID().toString(); //랜덤으로 문자열 생성
		String orginalName = multipartFile.getOriginalFilename();
		orginalName = orginalName.substring(orginalName.lastIndexOf("."));
		fileSystemName = fileSystemName+orginalName; //최종적으로 파일에 저장될 이름
		//fileSystemName = fileSystemName+"-"+orginalName;  orginalName은 올린 파일명 
		
		//저장
		file = new File(realPath, fileSystemName);
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		return fileSystemName;
	}
	
	//2.OutPutStream 연결
	public String fileSaver2(String realPath,  MultipartFile multipartFile)throws Exception {//저장된 이름을 돌려준다
		File file = new File(realPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		//a. 저장할 파일명을 생성
		//	UUID 클래스를 사용
		String fileSystemName = UUID.randomUUID().toString();
		String orginalName = multipartFile.getOriginalFilename();
		orginalName = orginalName.substring(orginalName.lastIndexOf("."));
		fileSystemName = fileSystemName+orginalName; //최종적으로 파일에 저장될 이름
		
		//저장하는 방법이 다름 
		//자바에서 제공하는 output이용
		file = new File(realPath, fileSystemName);
		FileOutputStream fs = new FileOutputStream(file);
		fs.write(multipartFile.getBytes());
		return fileSystemName;
	}
	
	
	
	//3.MultiPartFile클래스의 transferTo 메서드 사용
	public String saveFile3(String realPath,MultipartFile multipartFile)throws Exception{
		
		
		File file = new File(realPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
	
		//a. 저장할 파일명을 생성
		//	UUID 클래스를 사용
		String fileSystemName = UUID.randomUUID().toString();
		String orginalName = multipartFile.getOriginalFilename();
		orginalName  = orginalName.substring(orginalName.lastIndexOf("."));
		fileSystemName = fileSystemName+orginalName; //최종적으로 파일에 저장될 이름
		
		//저장
		file = new File(realPath, fileSystemName);
		multipartFile.transferTo(file);
		return fileSystemName;
	}
	
}







