<%@ page language="java"  pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

   用户名：${dbName}<br/>
   密码：${dbPass}<br/>
   路径：${pathShow}<br/>
   自己的groupId：${groupId}<br/>
   父类的artifactId：${partifactId}<br/>
   项目的根目录：${basedir}<br/>
 settings.xml里面的属性：${mirrors}<br/>
 maven内置属性：${projectDirectory}
</body>
</html>