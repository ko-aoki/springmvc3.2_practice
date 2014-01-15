<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="pageId" required="true"%>
<%@ attribute name="pageInfo" type="jp.gr.java_conf.ko_aoki.common.base.bean.PageBean" required="true"%>
<div class="page">
<c:if test="${pageInfo != null}" >
	<span>${pageInfo.startNum}-${pageInfo.endNum}/${pageInfo.totalNum}</span>
	<c:if test="${pageInfo.curPage > 1}">
		<span>
			<s:url value="/${pageId}" var="firstPageUrl">
				<s:param name="pageJump"/>
				<s:param name="page">1</s:param>
			</s:url>
			<a href="javascript:void(0)" id="firstPage">&lt;&lt;</a>
		</span>
		<span>
			<s:url value="/${pageId}"  var="prePageUrl">
				<s:param name="pageJump"/>
				<s:param name="page">${pageInfo.curPage-1}</s:param>
			</s:url>
			<a href="javascript:void(0)" id="prePage">&lt;</a>
		</span>
	</c:if>
	<c:forEach var="i" begin="${pageInfo.dispStartPage}" end="${pageInfo.dispEndPage}" step="1">
		<span>
			<s:url value="/${pageId}" var="pageUrl">
				<s:param name="pageJump"/>
				<s:param name="page">${i}</s:param>
			</s:url>
			<a href="javascript:void(0)" class="numPage" id="numPage_${i}">${i}</a>
		</span>
	</c:forEach>
	<c:if test="${pageInfo.curPage < pageInfo.totalPage}">
		<span>
			<s:url value="/${pageId}" var="nextPageUrl">
				<s:param name="pageJump"/>
				<s:param name="page">${pageInfo.curPage+1}</s:param>
			</s:url>
			<a href="javascript:void(0)" id="nextPage">&gt;</a>
		</span>
		<span>
			<s:url value="/${pageId}" var="lastPageUrl">
				<s:param name="page">${pageInfo.totalPage}</s:param>
			</s:url>
			<a href="javascript:void(0)" id="lastPage">&gt;&gt;</a>
		</span>
	</c:if>
    <input type="text" id="curPageTemp" size="2" />ページ
    <form:hidden path="page.curPage"/>
	<button type="button" id="pageJump">ページ指定</button>

</c:if>
<script type="text/javascript">
	$(document).ready(function() {
		$("#curPageTemp").val($("#page\\.curPage").val());
		function submitPage(cur) {
			$("#page\\.curPage").val(cur);
//			document.getElementById("page.curPage").value = cur;
			$("form").append("<input type='hidden' name='pageJump'>");
			$("form").submit();
		};

		$("#pageJump").click(function() {
			submitPage($("#curPageTemp").val());
		});

		if ($("#firstPage")) {
			$("#firstPage").click(function() {
				submitPage(1);
			});
		}

		if ($("#prePage")) {
			$("#prePage").click(function() {
				submitPage("${pageInfo.curPage-1}");
			});
		}

		$(".numPage").click(function() {
			var thisId = $(this).attr("id");
			var pageNumber = thisId.match(/\d+/);
			submitPage(pageNumber[0]);
		});

		if ($("#nextPage")) {
			$("#nextPage").click(function() {
				submitPage("${pageInfo.curPage+1}");
			});
		}

		if ($("#lastPage")) {
			$("#lastPage").click(function() {
				submitPage("${pageInfo.totalPage}");
			});
		}

	});
	</script>
</div>
