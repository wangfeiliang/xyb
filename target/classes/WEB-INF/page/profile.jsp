<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset><legend>用户信息</legend>  
<ul>  
    <li><label>用户名:</label><c:out value="${account.username}" /></li>  
    <li><label>生日:</label><fmt:formatDate value="${account.birthday}"  
        pattern="yyyy年MM月dd日" /></li>  
    <li><label>Email:</label><c:out value="${account.email}" /></li>  
</ul>  
</fieldset>
</body>
</html>