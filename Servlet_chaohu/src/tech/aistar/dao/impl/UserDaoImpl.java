package tech.aistar.dao.impl;

import tech.aistar.common.ConnectionManage;
import tech.aistar.dao.IUserDao;
import tech.aistar.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {

	@Override
	public User getUser(String userName, String userPwd) {
		// TODO Auto-generated method stub
		User user=null;

		Connection conn = ConnectionManage.getConn();

		String sql="select userName,userPwd from user where userName=? and userPwd=? ";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);

			pre.setString(1, userName);
			pre.setString(2, userPwd);

			 ResultSet rs = pre.executeQuery();
			 if(rs.next())
			 {
				 user=new User(userName, userPwd) ;
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			ConnectionManage.closeConn(conn);
		}
		
		return user;
	}

}
