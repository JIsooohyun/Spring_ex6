package com.sh.file;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import com.sh.s6.AbstractTest;

public class FileDAOTest extends AbstractTest{

	@Inject
	private FileDAO fileDAO;
	private FileDTO fileDTO;
	
	/*@Before
	public void ready() {
		fileDTO = new FileDTO();
		fileDTO.setNum(1);
		fileDTO.setFname("fname");
		fileDTO.setOname("oname");
	}
	
	@Test
	public void setWriteTest()throws Exception{
		FileDTO fileDTO = new FileDTO();
		fileDTO.setNum(100);
		fileDTO.setFname("fname");
		fileDTO.setOname("oname");
		
		FileDTO fileDTO2= new FileDTO();
		fileDTO2.setNum(100);
		fileDTO2.setFname("fname2");
		fileDTO2.setOname("oname2");
		
		ArrayList<FileDTO> fies = new ArrayList<FileDTO>();
		fies.add(fileDTO);
		fies.add(fileDTO2);
		
		int result = fileDAO.setWrite(fies);
		System.out.println("Test Done");
	}
	
	/*@Test
	public void setUpdate()throws Exception{
		int result = fileDAO.setUpdate(fileDTO);
		assertEquals(0, result);
	}
	
	@Test
	public void setDelete()throws Exception{
		int result = fileDAO.setDelete(0);
		
	}
	*/
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}













