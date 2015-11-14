function append(){
	var i = 0;
	$(".hd-table").append("<ul>");
	for(i; i < 5;i++){
		$(".hd-table").children("ul").append( "<li>成都信息工程大学<span>10000元</span></li>");
	}
	$(".hd-table").append("</ul>");
}

