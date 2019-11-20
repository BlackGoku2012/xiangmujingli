<%--
  Created by IntelliJ IDEA.
  User: wubin
  Date: 2019/11/15
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<style>
    #add{

       
        border: 1px solid #999999;
        border-radius: 50px;
        margin-top: 100px;
        margin:center;
    }
    #forms{
    padding:30px;
    }
    
    #center{
    margin-left:220px;
    }
</style>
<html>
<head>
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">学生信息管理系统</a>
        </div>

    </div>
</nav>

<div id="add">
<form class="form-horizontal" role="form" action="StudentControll?&op=insert" method="post" id="forms">
    <div id="center">
    <div class="form-group">
        <label  class="col-sm-2 control-label">学号</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="stuNo" placeholder="请输入学号">
        </div>
    </div>
    <div class="form-group">
        <label  class="col-sm-2 control-label">姓名</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="stuName" placeholder="请输入姓名">
        </div>
    </div>
    <div class="form-group">
        <label  class="col-sm-2 control-label">日期</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="stuBirthday" id="lastname" placeholder="请输入日期">
        </div>
    </div>
    <div class="form-group">
        <label  class="col-sm-2 control-label">地址</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="stuAddress"  placeholder="请输入地址">
        </div>
    </div>
    <div class="form-group">
        <label  class="col-sm-2 control-label">性别</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="stuSex" placeholder="请输入性别">
        </div>
    </div>
    </div>
    <div style="margin-left:500px" >
        <input type="submit" value="添加" class="btn btn-info" style="width:150px">
    </div>

</form>
</div>
</body>

</html>
