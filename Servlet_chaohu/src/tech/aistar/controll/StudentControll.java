package tech.aistar.controll;

import tech.aistar.common.Tools;
import tech.aistar.dao.IStudentDao;
import tech.aistar.dao.impl.StudentDaoImpl;
import tech.aistar.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class StudentControll extends HttpServlet {
          private IStudentDao studentDao=new StudentDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   doPost(request, response);
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	    String path="main.jsp";
		String op=request.getParameter("op");
		if(op!=null&&op.equals("del"))
		{
			int stuNo=Integer.parseInt(request.getParameter("stuNo"));
			delete(stuNo);

		}else if(op!=null&&op.equals("update"))
		{
			System.out.println("udpate");

			int stuNo=Integer.parseInt(request.getParameter("stuNo"));

			System.out.println(stuNo);
			Student student = this.studentDao.getStudentByStuNo(stuNo);
			System.out.println(student);

			request.setAttribute("student", student);
			path="reg.jsp";
		}else if(op!=null&&op.equals("insert"))
		{
			System.out.println("insert");
//			String
			insert(request,response);
			path="main.jsp";

		}else if (op!=null&&op.equals("dels")){
			String[] ids = request.getParameterValues("id");
			for (String s : ids) {
				studentDao.deleteStudent(Integer.valueOf(s));
			}
		}
		if(op!=null&&op.equals("save"))
		{
			System.out.println("save");
			save(request,response);
		}

		//下面这段话是我们在执行了增删改之后重新查询数据库
					IStudentDao studentDao=new StudentDaoImpl();
					ArrayList<Student> list = studentDao.getAllStudent();
					request.setAttribute("list", list);
		            request.getRequestDispatcher(path).forward(request, response);
	}

	public void insert(HttpServletRequest request, HttpServletResponse response) {
		//获取到页面的form表单中的值
		int stuNo = Integer.valueOf(request.getParameter("stuNo"));
		String name = request.getParameter("stuName");
		String date = request.getParameter("stuBirthday");
		String address = request.getParameter("stuAddress");
		String stuSex = request.getParameter("stuSex");
		Date d = Tools.fmtDateTojavaUtilDate(date);
		Student student = new Student();
		student.setStuNo(stuNo);
		student.setStuName(name);
		student.setStuAddress(address);
		student.setStuSex(stuSex);
		student.setStuBirthday(d);
		studentDao.insertStudent(student);
	}


	public void delete(int stuNo)
	{
		
		studentDao.deleteStudent(stuNo);
		
	}
	public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int stuNo=Integer.parseInt(request.getParameter("stuNo"));
		String strDate=request.getParameter("stuBirthday");
		String stuName=request.getParameter("stuName");
		String stuSex=request.getParameter("stuSex");
		String stuAddress=request.getParameter("stuAddress");
	    java.util.Date stuBirthday=	Tools.fmtDateTojavaUtilDate(strDate);
		Student stu=new Student(stuNo, stuName, stuBirthday, stuSex, stuAddress);
		this.studentDao.updateStudent(stu);
		
	}
}
