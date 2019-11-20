package tech.aistar.controll;

import tech.aistar.dao.IStudentDao;
import tech.aistar.dao.IUserDao;
import tech.aistar.dao.impl.StudentDaoImpl;
import tech.aistar.dao.impl.UserDaoImpl;
import tech.aistar.pojo.Student;
import tech.aistar.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;


public class UserControll extends HttpServlet {
	
	
	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
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

		 //��������������3�仰
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");

		  IUserDao userDao=new UserDaoImpl();
		 User user= userDao.getUser(userName, userPwd);
		 if(user!=null)
		 {

			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			IStudentDao studentDao=new StudentDaoImpl();
			ArrayList<Student> list = studentDao.getAllStudent();
			request.setAttribute("list", list);

			request.getRequestDispatcher("main.jsp").forward(request, response);
		 }
		 else
		 {
			 

			request.setAttribute("msg", "用户不存在");
			request.getRequestDispatcher("login.jsp").forward(request, response); 
			 
		 }
	}

}
