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
	
	<c:if test="${not empty mapEmployee }">
		<table>
		<tbody>
			<c:forEach var="employee" items="${mapEmployee}">
				<tr>
					<td>${employee.EMP_ID }</td>
					<td>${employee.EMP_NAME }</td>
					<td>${employee.EMP_NO }</td>
					<td>${employee.EMAIL }</td>
					<td>${employee.PHONE }</td>
					<td>${employee.DEPT_CODE }</td>
					<td>${employee.JOB_CODE }</td>
					<td>${employee.SEL_LEVEL }</td>
					<td>${employee.SALARY }</td>
					<td>${employee.BONUS }</td>
					<td>${employee.MANAGER_ID }</td>
					<td>${employee.HIRE_DATE }</td>
					<td>${employee.ENT_DATE }</td>
					<td>${employee.ENT_YN }</td>		
				</tr>
			</c:forEach>
		</tbody>
		</table>
	</c:if>
	
</body>
</html>