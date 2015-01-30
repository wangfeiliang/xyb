<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/page/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#profile").click(function() {
			profile();
		});
		$("#login").click(
		 function(){
			 login();
		 }
		);
	});
	function profile() {
		var url = 'http://localhost:8080/springwfl/person/profile/';
		var query = $('#id').val() + '/' + $('#name').val() + '/'
				+ $('#status').val();
		url += query;
		$.ajax({
			type : "get",
			url : url+"/json.do",
			dataType : "json",
			success : function(msg) {
				alert("Data Saved: " + msg.name + "--" + msg.status);
			}
		});
	}
	
	function login() {
		var url = 'http://localhost:8080/springwfl/person/login/jsonTwo.do';
		var mydata = '{"name":"' + $('#name').val() + '","id":"'
		+ $('#id').val() + '","status":"' + $('#status').val() + '","newData":"'+$('#newData').val()+'"}';
		
		
		alert(mydata);
		$.ajax({
			type : "post",
			contentType:'application/json',
			url : url,
			dataType : "json",
			data:mydata,
			success : function(msg) {
				alert("Data Saved: " + msg.name + "--" + msg.status);
			}
		});
	}
	
</script>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td><input id="id" value="100" /></td>
		</tr>
		<tr>
			<td>name</td>
			<td><input id="name" value="snowolf" /></td>
		</tr>
		<tr>
			<td>status</td>
			<td><input id="status" value="true" /></td>
		</tr>
		<tr>
		<input id="newData" value="nihao" type="hidden"/>
			<td><input type="button" id="profile" value="Profile——GET" /></td>
			<td><input type="button" id="login" value="Login——POST" /></td>
		</tr>
	</table>
</body>
</html>