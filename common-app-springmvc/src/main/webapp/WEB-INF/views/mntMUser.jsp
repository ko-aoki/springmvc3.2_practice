<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ユーザマスタメンテ</title>
	<link href="<c:url value="/css/common-app.css" />" rel="stylesheet"  type="text/css" />
	<link href="<c:url value="/css/mntMUser.css" />" rel="stylesheet"  type="text/css" />
	<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/mntMUser/mntMUser.js" />"></script>
</head>
<body>

<h1 style="font-size:16px;">ユーザマスタメンテ</h1>
<div id="app">
<form:form modelAttribute="mntMUserForm" action="mntMUser" method="post">
	<div id="header">
        <div id="condition" class="content-wrap">
            <div id="finderDiv">
        		<table border="1">
        			<tr>
        				<th>ユーザ名
        				</th>
        				<td>
        					<form:input path="userNm" />
        				</td>
        			</tr>
        			<tr>
        				<th>組織1
        				</th>
        				<td>
        					<form:input path="deptId1" size="10" />
        					<input type="button" id="dept1Finder" value="部門検索"/>
        					<span id="lblDeptNm1">${deptNm1}</span>
        				</td>
        			</tr>
        			<tr>
        				<th>組織2
        				</th>
        				<td>
        					<form:input path="deptId2" size="20" />
        					<span id="lblDeptNm2">${deptNm2}</span>
        				</td>
        			</tr>
        			<tr>
        				<th>ロール
        				</th>
        				<td>
							<form:select path="roleId">
								<form:option value=""></form:option>
								<c:forEach var="m" varStatus="s" items="${roleItems}">
									<form:option value="${m.roleId}">${m.roleNm}</form:option>
								</c:forEach>
							</form:select>
        				</td>
        			</tr>
        		</table>
				<button type="submit" name="find">検索</button>
				<button type="submit" name="register">新規登録</button>
            </div>
        </div>
	</div>

    <div id="headerDiv">
		<table id="headerTable" border="1" style="margin-top:20px;">
			<thead>
			<tr>
				<th class="recUserId">ユーザID</th>
				<th class="recUserNm">ユーザ名</th>
				<th class="recOrg1">組織1</th>
				<th class="recOrg2">組織2</th>
				<th class="recRole">ロール</th>
				<th class="recStartDate">開始日付</th>
				<th class="recEndDate">終了日付</th>
				<th class="recCmd"></th>
			</tr>
			</thead>
		</table>
	</div>
	<div  id="recordsDiv">
		<table id="recordsTable" border="1" >
			<tbody >
			<c:forEach var="m" varStatus="s" items="${mntMUserForm.mei}">
			<tr>
				<td class="recUserId">
					<span>${m.userIdM}</span>
					<form:hidden path="mei[${s.index}].userIdM"/>
				</td>
				<td class="recUserNmM">
					<span>${m.userNmM}</span>
					<form:hidden path="mei[${s.index}].userNmM"/>
				</td>
				<td class="recOrg1">
					<span>${m.pDeptNmM}</span>
					<form:hidden path="mei[${s.index}].pDeptIdM"/>
					<form:hidden path="mei[${s.index}].pDeptNmM"/>
				</td>
				<td class="recOrg2">
					<span>${m.deptNmM}</span>
					<form:hidden path="mei[${s.index}].deptIdM"/>
					<form:hidden path="mei[${s.index}].deptNmM"/>
				</td>
				<td class="recRole">
					<span>${m.roleNmM}</span>
					<form:hidden path="mei[${s.index}].roleIdM"/>
					<form:hidden path="mei[${s.index}].roleNmM"/>
				</td>
				<td class="recStartDate">
					<span>${m.startDateM}</span>
					<form:hidden path="mei[${s.index}].startDateM"/>
				</td>
				<td class="recEndDate">
					<span>${m.endDateM}</span>
					<form:hidden path="mei[${s.index}].endDateM"/>
				</td>
				<td class="recCmd">
						<button type="submit" class="modify" id="modify_${s.index}">変更</button>
						<button type="submit" class="delete" id="delete_${s.index}">削除</button>
				</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</form:form>
</div>

</body>
</html>