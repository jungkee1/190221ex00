<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="sample/ex01?name=AAA&age=10">ex01</a>
<a href="sample/ex02?name=BBB&age=20">ex02</a>
<a href="sample/ex021?name=CCC&age=30">ex021</a>
<a href="sample/ex02List?ids=111&ids=222&ids=333">ex02List</a>
<a href="sample/ex04?name=DDD&age=40&page=1">ex4</a>
<a href="sample/ex041?name=EEE&age=50&page=2">ex41</a>
<a href="sample/ex06">ex06(json)</a>
<a href="sample/ex07">ex07(responseEntity)</a>
</body>
</html>
