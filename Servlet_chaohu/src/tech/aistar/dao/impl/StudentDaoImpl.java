package tech.aistar.dao.impl;

import tech.aistar.common.ConnectionManage;
import tech.aistar.common.Tools;
import tech.aistar.dao.IStudentDao;
import tech.aistar.pojo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


@SuppressWarnings("all")
public class StudentDaoImpl implements IStudentDao {
        
	@Override
	public boolean insertStudent(Student stu) {
		boolean b=false;

         Connection conn= ConnectionManage.getConn();
          String sql="insert into student(stuNo,stuName,stuBirthday,stuAddress,stuSex) values(?,?,?,?,?)";
        try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setInt(1,stu.getStuNo()); 
//        stuName,
			pre.setString(2, stu.getStuName());
//        stuBirthday,
			pre.setDate(3, Tools.fmtDateTosqlDate(stu.getStuBirthday()));
//        stuAddress,
			pre.setString(4, stu.getStuAddress());
//        stuSex
			pre.setString(5, stu.getStuSex()); 
            b= pre.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

	         ConnectionManage.closeConn(conn);
		}
      
		return b;
	}

	@Override
	public boolean updateStudent(Student stu) {
		boolean b=false;
		//�õ����Ӷ���
		System.out.println("dao update stu:"+stu);
         Connection conn=ConnectionManage.getConn();
          String sql=" update student  set stuAddress=?,stuName=?,stuBirthday=?,stuSex=? WHERE stuno=?"; 
        try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, stu.getStuAddress());
			pre.setString(2, stu.getStuName());
			pre.setDate(3, Tools.fmtDateTosqlDate(stu.getStuBirthday()));
			pre.setString(4, stu.getStuSex());
			pre.setInt(5, stu.getStuNo());
      b= pre.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			   ////�ر����Ӷ���
	         ConnectionManage.closeConn(conn);
		}
      
		return b;
	}

	@Override
	public boolean deleteStudent(int stuNo) {
		boolean b=false;
         Connection conn=ConnectionManage.getConn();
          String sql="delete from  student where stuNo=?";
        try {
			PreparedStatement pre = conn.prepareStatement(sql);
       pre.setInt(1, stuNo);
      b= pre.executeUpdate()>0?true:false;
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

	         ConnectionManage.closeConn(conn);
		}
      
		return b;
	}

	@Override
	public ArrayList<Student> getAllStudent() {
 
		 ArrayList<Student> list=new ArrayList<Student>();
		 
		//�õ����Ӷ���
         Connection conn=ConnectionManage.getConn();
          String sql="select * from student"; 
      
			try {
				PreparedStatement pre = conn.prepareStatement(sql);
				ResultSet rs = pre.executeQuery();
				while(rs.next())
				{
					Student stu=new Student();
					
					  //stuNo number primary key,
					  int stuNo= rs.getInt("stuNo"); 
					  stu.setStuNo(stuNo);
//	        	    stuName nvarchar2(10) not null,
					  String stuName= rs.getString("stuName"); 
					  stu.setStuName(stuName);
//	        	    stuBirthday date,
					java.sql.Date  stuBirthday= rs.getDate("stuBirthday");
				stu.setStuBirthday(Tools.fmtDateToUtilDate(stuBirthday));
					//    stuSex Nchar(1) default '��',
					String  stuSex=rs.getString("stuSex");
					stu.setStuSex(stuSex);
//	        	    stuAddress nvarchar2(50)
					String  stuAddress=rs.getString("stuAddress"); 
				stu.setStuAddress(stuAddress);
					
					list.add(stu);
				}
//    
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				
				ConnectionManage.closeConn(conn);
			}
		 
		return list;
	}

	@Override
	public Student getStudentByStuNo(int stuNo) {
		Student stu=null;
		
		//�õ����Ӷ���
         Connection conn=ConnectionManage.getConn();
          String sql="select * from student where stuNo=?"; 
      
			try {
				PreparedStatement pre = conn.prepareStatement(sql);
				pre.setInt(1, stuNo);
				ResultSet rs = pre.executeQuery();
				if(rs.next())
				{
					 stu=new Student();
					
					  //stuNo number primary key,
					  int stuNo1= rs.getInt("stuNo"); 
					  stu.setStuNo(stuNo1);
//	        	    stuName nvarchar2(10) not null,
					  String stuName= rs.getString("stuName"); 
					  stu.setStuName(stuName);
//	        	    stuBirthday date,
					java.sql.Date  stuBirthday= rs.getDate("stuBirthday");
				stu.setStuBirthday(Tools.fmtDateToUtilDate(stuBirthday));
					//    stuSex Nchar(1) default '��',
					String  stuSex=rs.getString("stuSex");
					stu.setStuSex(stuSex);
//	        	    stuAddress nvarchar2(50)
					String  stuAddress=rs.getString("stuAddress"); 
				stu.setStuAddress(stuAddress);
					
				
				}
//    
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				
				ConnectionManage.closeConn(conn);
			}
		 
		return stu;
	}

	@Override
	public ArrayList<Student> getStudentBySql(String sql) {

		 ArrayList<Student> list=new ArrayList<Student>();
		 
		//�õ����Ӷ���
        Connection conn=ConnectionManage.getConn();
       
     
			try {
				PreparedStatement pre = conn.prepareStatement(sql);
				ResultSet rs = pre.executeQuery();
				while(rs.next())
				{
					Student stu=new Student();
					
					  //stuNo number primary key,
					  int stuNo= rs.getInt("stuNo"); 
					  stu.setStuNo(stuNo);
//	        	    stuName nvarchar2(10) not null,
					  String stuName= rs.getString("stuName"); 
					  stu.setStuName(stuName);
//	        	    stuBirthday date,
					java.sql.Date  stuBirthday= rs.getDate("stuBirthday");
				stu.setStuBirthday(Tools.fmtDateToUtilDate(stuBirthday));
					//    stuSex Nchar(1) default '��',
					String  stuSex=rs.getString("stuSex");
					stu.setStuSex(stuSex);
//	        	    stuAddress nvarchar2(50)
					String  stuAddress=rs.getString("stuAddress"); 
				stu.setStuAddress(stuAddress);
					
					list.add(stu);
				}
//   
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				
				ConnectionManage.closeConn(conn);
			}
		 
		return list;
	}

}
