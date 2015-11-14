<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<link rel="stylesheet" type="text/css" href="../css/home.css">
<link href="../css/scroller_roll.css" rel="stylesheet" type="text/css"></link>
<script type="text/javascript" src="../js/srcoll.js"></script>
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="../js/myfocus-2.0.1.min.js"></script>
<script type="text/javascript" src="../js/scroller_roll.js"></script>
<script src="../js/layer.min.js"></script>
<script type="text/javascript" src="../js/home.js"></script>
<script type="text/javascript">
    $(function(){
        $("#scroller_roll3").scroller_roll({
            title_show: 'disable',//enable  disable，是否晓得title
            time_interval: '30',//轮播的速度
            window_background_color: "none",//可有可无,不晓得干啥的
            window_padding: '1',//与上边边框的间距
            border_size: '0',//边框的大小
            border_color: '#0099CC',//边框颜色
            images_width: '200',//图片的大小
            images_height: '150',
            images_margin: '5',//外填充
            title_size: '12',
            title_color: 'black',
            show_count: '5'
        });
        /*使用ext框架*/
       layer.use('extend/layer.ext.js', function(){
        //初始加载即调用，所以需放在ext回调里
        layer.ext = function(){
            layer.photosPage({
                html:'<div style="padding:20px;">这里传入自定义的html<p>相册支持左右方向键，支持Esc关闭</p><p>另外还可以通过异步返回json实现相册。更多用法详见官网。</p><p>'+ unescape("%u7D20%u6750%u5BB6%u56ED%20-%20sc.admin5.com") +'</p><p id="change"></p></div>',
                title: '快捷模式-获取页面元素包含的所有图片',
                id: 100, 
                parent:'#scroller_roll3'
                });
            };
    });
    append();
    });
    myFocus.set({
        id:'myFocus',//ID
        pattern:'mF_classicHB'//风格
    });
</script>