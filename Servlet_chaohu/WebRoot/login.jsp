<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
  #outer {
    margin-top: 150px;
    border: 1px solid #999;
    padding: 30px;

    /* 设置边框的圆角 */
    border-radius: 25px;

    /* width: 800px; */
    width: 70%;
  }

  @media all and (max-width: 768px) {
    #outer {
      margin-top: 150px;
      border: 1px solid #999;
      padding: 30px;

      /* 设置边框的圆角 */
      border-radius: 25px;
    }
  }
</style>
  </head>

  <body>
  <nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">学生信息管理系统</a>
      </div>
      <ul class="nav navbar-nav navbar-right">
        <li><a href=""><span class="glyphicon glyphicon-user"></span> 注册</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
      </ul>

    </div>
  </nav>

  <div class="container">
  <div id="outer">
  <form class="form-horizontal" role="form" action="UserControll" method="post">
    <div class="form-group">
      <label for="firstname" class="col-sm-2 control-label">姓名</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="firstname" placeholder="请输入名字" name="userName" value="wang" >
      </div>
    </div>
    <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">密码</label>
      <div class="col-sm-4">
        <input type="password" class="form-control" id="lastname" placeholder="请输入姓" name="userPwd" value="111" >
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">登录</button>
      </div>
    </div>
  </form>
  </div>
  </div>





    <%--<form name="f1" id="f1" action="UserControll" method="post">--%>
      <%--<table>--%>
        <%--<tr>--%>
          <%--<td>Login:</td>--%>
          <%--<td><input type="text" name="userName" value="wang" id="login"></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
          <%--<td>Password:</td>--%>
          <%--<td><input type="password" name="userPwd" value="111" id="password"></td>--%>
        <%--</tr> --%>
        <%--<tr>--%>
          <%--<td colspan="2"><input type="submit"></td>--%>
        <%--</tr>--%>
         <%--<tr>--%>
          <%--<td colspan="2">${msg}</td>--%>
        <%--</tr>--%>
        <%----%>
      <%--</table>--%>
    <%--</form>--%>
  </body>
</html>
