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
		var url = 'http://localhost:8080/springwfl/menu';
		var mydata = '{"name":"' + $('#name').val() + '","id":"'
		+ $('#id').val() + '","status":"' + $('#status').val() + '","newData":"'+$('#newData').val()+'"}';
		
		$.ajax({
			type : "post",
			url : url+"/menu.json?name='wagnfeilagn'",
			dataType : "json",
			//data:{name:"wagnfeiliang",psd:"11111"},
			success : function(msg) {
				alert("Data Saved: " + msg.id + "--" + msg.text);
			}
		});
	}
	
	function login() {
		var url = 'http://localhost:8080/springwfl/menu/menu.json';
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
				alert("Data Saved: " + msg.id + "--" + msg.text);
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