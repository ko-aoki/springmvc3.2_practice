jQuery(function($){
//イベント
	$("#ok").click(
		function() {
			var checked = $("input[name='deptIds']:checked");
			var values = checked.val().split("_");
			window.opener.$("input[name='deptId1']").val(values[0]);
			window.opener.$("input[name='deptId2']").val(values[1]);
			window.opener.$("#lblDeptNm1").text( $("#" + values[0] + "Nm").text() );
			window.opener.$("#lblDeptNm2").text( $("#" + values[1] + "Nm").text() );
			window.opener.$("input[name='deptNm1']").val($("#" + values[0] + "Nm").text());
			window.opener.$("input[name='deptNm2']").val($("#" + values[1] + "Nm").text());
			window.close();
		}
	);
	$("#cancel").click(
			function() {
				window.close();
			}
	);
});