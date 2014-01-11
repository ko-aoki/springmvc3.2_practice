<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="page" type="jp.gr.java_conf.ko_aoki.common.base.bean.PageBean" required="true"%>
<%
StringBuffer url = request.getRequestURL();
request.setAttribute("url", url.toString());
%>

<div class="page">
<c:if test="${page != null}" >
	<span>${page.startNum}-${page.endNum}/${page.totalNum}</span>
	<c:if test="${page.curPage > 1}">
		<span>
			<a href="${url}?page=${1}">&lt;&lt;</a>
		</span>
		<span>
			<a href="${url}?page=${page.curPage-1}">&lt;</a>
		</span>
	</c:if>
	<c:forEach var="i" begin="${page.dispStartPage}" end="${page.dispEndPage}" step="1">
		<span>
			<a href="${url}?page=${i}">${i}</a>
		</span>
	</c:forEach>
	<c:if test="${page.curPage < page.totalPage}">
		<span>
			<a href="${url}?page=${page.curPage+1}">&gt;</a>
		</span>
		<span>
			<a href="${url}?page=${page.totalPage}">&gt;&gt;</a>
		</span>
	</c:if>
</c:if>
</div>
