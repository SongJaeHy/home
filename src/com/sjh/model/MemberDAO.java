package com.sjh.model;

import javax.naming.*;
import javax.sql.*;

public class MemberDAO {
	private DataSource ds;
	
	private MemberDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static MemberDAO dao = new MemberDAO();
	
	public static MemberDAO getinstance() {
		if(dao == null) {
			dao = new MemberDAO();
		}
		return dao;
	}
}
