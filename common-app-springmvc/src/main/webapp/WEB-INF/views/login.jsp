<%@page pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ログイン</title>
</head>
<body>

<%-- Spring のカスタムタグの定義 --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="MessageBox erorr">
	<spring:hasBindErrors name="loginForm">
		<%-- グローバルエラーメッセージの出力 --%>
		<c:if test="${errors.globalErrorCount > 0}">
			<ul>
				<c:forEach items="${errors.globalErrors}" var="error">
					<li><span class="error">
					<spring:message message="${error}"/>
					</span></li>
				</c:forEach>
			</ul>
		</c:if>
		<c:if test="${errors.fieldErrorCount > 0}">
			<c:forEach items="${errors.fieldErrors}" var="error">
				<li>
					<span class="error">
						<spring:message code="${error.field}"/>は、
						<spring:message message="${error}"/>
					</span>
				</li>
			</c:forEach>
		</c:if>
	</spring:hasBindErrors>
</div>

<form:form modelAttribute="loginForm" action="login" method="post">
	<form:label path="userId">ユーザID</form:label>
	<form:input path="userId" />
	<br/>
	<form:label path="pwd">パスワード</form:label>
	<form:input path="pwd" />
	<br/>
	<input type="submit"/>
</form:form>
</body>
</html>