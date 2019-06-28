package com.sh.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sh.board.notice.NoticeDAO;
import com.sh.board.notice.NoticeDTO;
import com.sh.s6.AbstractTest;

public class DBConnectTest extends AbstractTest{
	
	 @Inject //같은 데이터 타입으로 찾는다. //resource는 이름으로 찾는다. private
	 DriverManagerDataSource dataSource;
	
	@Test
	public void conn()throws Exception {
		Connection conn = dataSource.getConnection();
		assertNotNull(conn);
	}
	
	
	

}
