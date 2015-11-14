<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<!--[if lte IE 9 ]><div class="am-alert am-alert-danger ie-warning" data-am-alert>
  <div class="am-container am-text-center">
    网页提醒：你的浏览器太古董啦，<a
    href="http://browsehappy.com/" target="_blank">速速点击换一个吧</a>！</div></div><![endif]-->
   <jsp:include page="client/header.jsp"></jsp:include>
    <jsp:include page="client/main.jsp"></jsp:include>
    <jsp:include page="client/bottom.jsp"></jsp:include>
    <script type="text/javascript">
       /*构造滚动对象方法*/
       var roll = new MessageRoll({
        container : document.getElementById("a2"), // 滚动的容器
        height :200 , // 滚动信息条的高度,算上底边框1px,如果没有底边框则不加1
        rollElements : "li" // 滚动元素的html标记名称
       });
       roll.start(500); //开始滚动,每三秒滚动一次
      
    </script>
</body>
</html>