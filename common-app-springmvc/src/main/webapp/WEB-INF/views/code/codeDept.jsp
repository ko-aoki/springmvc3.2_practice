<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>組織検索</title>
	<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/code/codeDept/codeDept.js" />"></script>
	<link href="<c:url value="/css/common-app.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
<c:set var="pageId" value="code/codeDept" />
<h1 style="font-size:14px;">組織検索</h1>
<form:form modelAttribute="codeDeptForm" action="codeDept" method="post">
<div id="app">
	<div id="header">
        <div id="condition" class="content-wrap">
            <div id="finderDiv">
        		<table border="1">
        			<tr>
        				<th>組織1コード
        				</th>
        				<td>
        					<form:input path="pDeptId" />
        				</td>
        			</tr>
        			<tr>
        				<th>組織1名称
        				</th>
        				<td>
        					<form:input path="pDeptNm" />
        				</td>
        			</tr>
        			<tr>
        				<th>組織2コード
        				</th>
        				<td>
        					<form:input path="deptId" />
        				</td>
        			</tr>
        			<tr>
        				<th>組織2名称
        				</th>
        				<td>
        					<form:input path="deptNm" />
        				</td>
        			</tr>
        		</table>
				<button type="submit" name="find">検索</button>

				<tags:page pageId="${pageId}" pageInfo="${codeDeptForm.page}" />
        		<table border="1">
					<thead>
						<tr>
		        			<th>選択</th>
		        			<th>親部門ID</th>
		        			<th>親部門名</th>
		        			<th>部門ID</th>
		        			<th>部門名</th>
						</tr>
					</thead>
					<c:forEach var="m" varStatus="s" items="${codeDeptForm.mei}">
	        			<tr>
	        				<td>
<!--
	        					<html:radio property="mei[${s.index}].pDeptId" value="${m.pDeptId}"/>
-->
	        					<input type="radio" name="deptIds" value="${m.pDeptId}_${m.deptId}"/>
	        				</td>
	        				<td>
	        					<label for="deptIds"><span id="${m.pDeptId}">${m.pDeptId}</span></label>
	        				</td>
	        				<td>
	        					<label for="deptIds"><span id="${m.pDeptId}Nm" >${m.pDeptNm}</span></label>
	        				</td>
	        				<td>
	        					<label for="deptIds"><span id="${m.deptId}">${m.deptId}</span></label>
	        				</td>
	        				<td>
	        					<label for="deptIds"><span id="${m.deptId}Nm" >${m.deptNm}</span></label>
	        				</td>
	        			</tr>
        			</c:forEach>
        		</table>
				<input type="button" id="ok" value="OK"/>
				<input type="button" id="cancel" value="キャンセル">
            </div>
        </div>
	</div>
</div>

</form:form>
</body>
</html>