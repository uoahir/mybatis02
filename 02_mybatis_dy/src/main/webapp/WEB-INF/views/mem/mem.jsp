<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>패스워드</th>
				<th>이름</th>
				<th>성별</th>
				<th>나이</th>
				<th>이메일</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>취미</th>
				<th>가입일</th>
			</tr>
		</thead>
		<c:if test="${not empty members }">
		<tbody>
			<c:forEach items="${members }" var="m" >
				<tr>
					<td>${m.userId }</td>
					<td>${m.password }</td>
					<td>${m.userName }</td>
					<td>${m.gender }</td>
					<td>${m.age }</td>
					<td>${m.email }</td>
					<td>${m.phone }</td>
					<td>${m.address }</td>
					<td>${m.hobby }</td>
					<td><fmt:formatDate value="${m.enrollDate }" dateStyle="short"/></td>
				</tr>
			</c:forEach>
		</tbody>
		</c:if>
	</table>
</body>
</html>