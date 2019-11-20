package tech.aistar.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManage {

	/**
	 * 
	 * @return  �õ�һ�����ݿ�����Ӷ���
	 */
	public static Connection getConn()
	{
				String url="jdbc:mysql://localhost:3306/cpf?useSSL=false&useUnicode=false&characterEncoding=utf8";
		        String driClass="com.mysql.jdbc.Driver";
		        String userName="root";
		        String userPwd="root";
		Connection conn=null;
		try {

			Class.forName(driClass);

        conn = DriverManager.getConnection(url, userName, userPwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return conn;
		
	}
	/**
	 * �ر����Ӷ���
	 * @param conn  ���� ���Ӷ���
	 */
	public static void closeConn(Connection conn)
	{
		if(conn!=null)
		{
			try {
				if(!conn.isClosed())
				{
					
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
