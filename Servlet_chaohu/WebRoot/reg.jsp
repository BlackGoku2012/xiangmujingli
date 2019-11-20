<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">

  </head>
  <body>
  <nav class="navbar navbar-inverse" role="navigation">
      <div class="container-fluid">
          <div class="navbar-header">
              <a class="navbar-brand" href="#">学生信息管理系统</a>

          </div>

      </div>
  </nav>
  <form role="form" action="StudentControll" method="post">
      <input type="hidden" name="stuNo" value="${student.stuNo }">
      <input type="hidden" name="op" value="save">
      <div class="form-group">
          <label >姓名</label>
          <input type="text" class="form-control" name="stuName" id="login" value="${student.stuName }">
          <%--<input type="text" class="form-control" id="name" placeholder="请输入名称">--%>
      </div>
      <div class="form-group">
          <label >性别</label>
          <c:if test="${student.stuSex=='男' }">
              <input type="radio" name="stuSex" value="男" checked="checked">男
              <input type="radio" name="stuSex" value="女" >女
          </c:if>
          <c:if test="${student.stuSex=='女' }">
              <input type="radio" name="stuSex" value="男" >男
              <input type="radio" name="stuSex" value="女"  checked="checked">女
          </c:if>
      </div>
      <div class="form-group">
          <label >日期</label>

          <input type="text" class="form-control" value=" <fmt:formatDate value="${student.stuBirthday}" pattern="yyyy-MM-dd"/>" name="stuBirthday">
          <%--<input type="text" class="form-control"  placeholder="请输入名称">--%>
      </div>
      <div class="form-group">
          <label >地址</label>
          <input type="text" class="form-control" value="${student.stuAddress }" name="stuAddress">
          <%--<input type="text" class="form-control"  placeholder="请输入名称">--%>
      </div>
      <button type="submit" class="btn btn-default">提交</button>
  </form>





   
      </table>
    </form>
  </body>
</html>
