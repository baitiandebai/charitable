$(function(){
	
	$.ajax({
		url:"image",
		dataType:"text",
		tpye:"POST",
		success:function(data){
			alert(data);
		},
		error:function(){
			alert("读取员工月评信息失败！！");
		}
	});	
});