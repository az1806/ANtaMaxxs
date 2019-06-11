<%@page import="com.jiaju.entity.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Newsin list = (Newsin) request.getAttribute("list");
%>

<!DOCTYPE html>
<html>

<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>欢迎页面-X-admin2.0</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="./css/font.css">
<link rel="stylesheet" href="./css/xadmin.css">
<script type="text/javascript" src="./lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript" src="./js/xadmin.js"></script>

<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
</head>
<script type="text/javascript">
  function update(){
    	var zixun =document.getElementById("zixun").value;
  		var xiangqing =document.getElementById("xiangqing").value;
  		var date =document.getElementById("date").value;
    		if(zixun != ""){
    			window.location.href ="/admin/ZiXunServlet?method=newsinupdate&zixun="+zixun+"&xiangqing="+xiangqing+"&date="+date+"&id=<%=list.getId()%>";
		}
	}
</script>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-input-inline">
				<input type="text" id="zixun" name="zixun" required=""
					lay-verify="phone" autocomplete="off" class="layui-input"
					value="<%=list.getZixun()%>">
			</div>
			<div class="layui-form-mid layui-word-aux">
				<span class="x-red"></span>资讯名称
			</div>
	</div>
	<div class="layui-input-inline">
		<input type="text" id="xiangqing" name="xiangqing" required=""
			lay-verify="phone" autocomplete="off" class="layui-input"
			value="<%=list.getXiangqing()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>资讯详情
	</div>
	</div>
	<br>
	<div class="layui-input-inline">
		<input type="text" id="date" name="date" required=""
			lay-verify="phone" autocomplete="off" class="layui-input"
			value="<%=list.getDate()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>日期
	</div>
	</div>
	
	<div class="layui-form-item">
		<label for="L_repass" class="layui-form-label"> </label>
		<button class="layui-btn" lay-filter="add" lay-submit=""
			onclick="update()">编辑</button>
	</div>
	</form>
	</div>
	<script>
		layui.use([ 'form', 'layer' ], function() {
			$ = layui.jquery;
			var form = layui.form, layer = layui.layer;

			//监听提交
			form.on('submit(add)', function(data) {
				console.log(data);
				//发异步，把数据提交给php
				layer.alert("增加成功", {
					icon : 6
				}, function() {
					// 获得frame索引
					var index = parent.layer.getFrameIndex(window.name);
					//关闭当前frame
					parent.layer.close(index);
				});
				return false;
			});

		});
	</script>

</body>

</html>