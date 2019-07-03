package com.sh.file;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import com.sh.s6.AbstractTest;

public class FileDAOTest extends AbstractTest{

	@Inject
	private FileDAO fileDAO;
	private FileDTO fileDTO;
	
	@Before
	public void ready() {
		fileDTO = new FileDTO();
		fileDTO.setNum(1);
		fileDTO.setFname("fname");
		fileDTO.setOname("oname");
	}
	
	@Test
	public void setWriteTest()throws Exception{
		int result = fileDAO.setWrite(fileDTO);
		assertEquals(1, result);
	}
	
	@Test
	public void setUpdate()throws Exception{
		int result = fileDAO.setUpdate(fileDTO);
		assertEquals(0, result);
	}
	
	@Test
	public void setDelete()throws Exception{
		int result = fileDAO.setDelete(0);
		
	}
	
	

}













