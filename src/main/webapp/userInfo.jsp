<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<center>
<h1>用户列表</h1>
    用户名：<input type="text" name="userName" placeholder="请输入查询名：">
    <button>查询</button>
<table border="1">
    <caption><button>新增</button></caption>
    <thead>
    <tr>
        <th>用户id</th>
        <th>用户名称</th>
        <th>用户密码</th>
        <th>用户状态</th>
        <th>用户性别</th>
        <th>操作</th>
    </tr>
    </thead>
    <%--循环取出结果集--%>
    <c:forEach var="userinfos" items="${userinfoList}">
        <tr>
            <td>${userinfos.userid}</td>
            <td>${userinfos.username}</td>
            <td>${userinfos.userpass}</td>
            <td>${userinfos.state}</td>
            <td>${userinfos.sex}</td>
            <td>
                <button onclick="deleteByid(${userinfos.userid})">删除</button>
                <button>修改</button>
            </td>
        </tr>
    </c:forEach>

</table>
</center>
<script type="text/javascript">
    function deleteByid(id) {
    alert(id);//得到id
        //使用ajax调用后台删除

    }
</script>
</body>
</html>