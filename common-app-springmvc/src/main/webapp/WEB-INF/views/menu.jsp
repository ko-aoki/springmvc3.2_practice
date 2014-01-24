<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>メニュー</title>
<link href="<c:url value="/js/jquery.treeview.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
<h1>メニュー</h1>

<ul id="menu" class="treeview"></ul>

<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery.treeview.js" />"></script>

<script type="text/javascript">

$(document).ready(function() {
	var menuList = ${menuJson};

	function writeMenuList(data, elm) {
		for (var i in data) {
			if (data[i].childMenu.length > 0) {
				var ul = $("<ul></ul>");
				var li = $("<li>" + data[i].menuId + "</li>");
				writeMenuList(data[i].childMenu, ul);
				li.append(ul);
				elm.append(li);
				console.log("ul:" + data[i].path);
			} else {
				elm.append('<li><a href="' + data[i].url + '" target="_blank" "width=1024,height=800">' + data[i].menuId + '</a></li>');
				console.log("li:" + data[i].path);
			}
		}
	};

	writeMenuList(menuList, $("#menu"));
	$("#menu").treeview();
});

</script>

</body>
</html>