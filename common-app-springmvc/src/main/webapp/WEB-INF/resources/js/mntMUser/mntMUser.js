jQuery(function($){
//イベント
	$("#dept1Finder").click(
		function() { window.open(location.protocol + "//" + location.host + "/common-app-springmvc/code/codeDept","popup","width=600, height=400"); }
	);
	$("#deptFinder").click(
			function() { window.open(location.protocol + "//" + location.host + "/common-app-springmvc/code/codeDept","popup","width=600, height=400"); }
		);
	$(".modify").click(
			function() {
				var values = $(this).attr("id").split("_");
				var formObj = $('#mntMUserForm');
				// jQuery によるタグの組み立て
				formObj.append($('<input/>').attr({type:'hidden', name:'modify'}));
				formObj.append($('<input/>').attr({type:'hidden', name:'meiCount', value:values[1]}));
				//文字列によるタグの記述
				//$(formObj).append('<input type="hidden" name="meicount"/>');
				formObj.submit();			}
		);

});