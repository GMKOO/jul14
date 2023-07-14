<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1> 게시판 : ${name}</h1>
 
 
 <table>
 	<tr>
 		<th>번호 </th>
 		<th>제목 </th>
 		<th>글쓴이 </th>
 		<th>쓴날짜 </th>
 		<th>좋아요 </th>
	</tr>
	<c:forEach items="${list }" var="row">
	<tr>
		<td>${row.bno }</td>
		<td>
	<a href="./detail?bno=${row.bno }">	${row.btitle } </a>
		</td>
		<td>${row.bwrite}</td>
		<td>${row.bdate }</td>
		<td>${row.blike }</td>
	</tr>
	</c:forEach>
 </table>
 
<!--  <a href="./board">게시판</a>
 <a href="./main">main</a> -->
 
</body>
</html>