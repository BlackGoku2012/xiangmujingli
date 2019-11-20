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
    
    <title>My JSP 'main.jsp' starting page</title>
    
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

  <table class="table table-bordered">
      <%--<caption>学生信息管理系统</caption>--%>
      <thead>
      <tr>
          <th></th>
          <th>序号</th>
          <th>学号</th>
          <th>姓名</th>
          <th>性别</th>
          <th>出生日期</th>
          <th>地址</th>
          <th>操作</th>

      </tr>

      <c:forEach items="${list }" var="stu" varStatus="no">
          <tr>
              <td><input type="checkbox" name="chk" value="${stu.stuNo}"></td>
              <td>${no.index+1 }</td>
              <td>${stu.stuNo}</td>
              <td>${stu.stuName}</td>
              <td>${stu.stuSex}</td>
              <td>
                  <fmt:formatDate value="${stu.stuBirthday}" pattern="yyyy年MM月dd"/>
              </td>
              <td>${stu.stuAddress}</td>
              <td>
                  <a href="StudentControll?stuNo=${stu.stuNo}&op=del">删除</a>
                  <a href="StudentControll?stuNo=${stu.stuNo}&op=update">修改</a>
              </td>
          </tr>
      </c:forEach>
      </thead>
      <tbody>
  </table>
  <div style="margin-left: 700px;">
  <button  type="button" class="btn btn-info" onclick="add()">添加</button>
  <button  type="button" class="btn btn-danger" onclick="fun()">删除</button>
 </div>
 
  <%--<a href="javascript:fun()">删除</a>--%>
  </body>
<script type="text/javascript">
 function fun() {

     var cks = document.getElementsByName("chk");
//       alert(cks);

     var count = 0;
     for (var i = 0; i < cks.length; i++) {

         if (cks[i].checked) {
             count++;
         }
     }
//       alert(count);

     if (count == 0) {
         alert("对不起，请先勾选！");
         return;
     } else {


         var yes = window.confirm("要删除吗？");
         if (yes) {
             //如果勾选了，那么就可以获取到了
             var pids = "";//用来拼接参数
             for (var i = 0; i < cks.length; i++) {
                 if (cks[i].checked) {
                     pids += "id=" + cks[i].value + "&";
                 }
             }
//
//       //定义url地址来将上面的地址拼接
             var url = 'http://localhost:8888/Servlet_chaohu/StudentControll?op=dels&' + pids;
//
//       //取出最后的&号
             window.location = url.substring(0, url.length - 1);

//      window.location.href="http://localhost:8888/Servlet_chaohu/StudentControll?stuNo="+o+"&op=del";
         }
     }
 }

 function add() {

     window.location="http://localhost:8888/Servlet_chaohu/add.jsp"

 }
</script>
</html>
