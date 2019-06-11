<%@page import="com.jiaju.entity.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Productlist list = (Productlist) request.getAttribute("list");
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
    	var name =document.getElementById("name").value;
  		var size =document.getElementById("size").value;
  		var color =document.getElementById("color").value;
  		var sum =document.getElementById("sum").value;
  		var jiaqian =document.getElementById("jiaqian").value;
  		var fenlei =document.getElementById("fenlei").value;
  		var xilie =document.getElementById("xilie").value;
  		var img =document.getElementById("img").value;
    		if(Name != ""){
    			window.location.href ="/admin/Productlistservlet?method=Updatelist&name="+name+"&size="+size+
    			"&color="+color+"&sum="+sum+"&jiaqian="+jiaqian+"&fenlei="+fenlei+"&xilie="+xilie+"&img="+img+"&id=<%=list.getId()%>";
		}
	}
</script>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-input-inline">
				<input type="text" id="name" name="name" required=""
					lay-verify="phone" autocomplete="off" class="layui-input"
					value="<%=list.getName()%>">
			</div>
			<div class="layui-form-mid layui-word-aux">
				<span class="x-red"></span>产品名
			</div>
	</div>
	<div class="layui-input-inline">
		<input type="text" id="size" name="size" required=""
			lay-verify="phone" autocomplete="off" class="layui-input"
			value="<%=list.getSize()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>尺寸
	</div>
	</div>
	<br>
	<div class="layui-input-inline">
		<input type="text" id="color" name="color" required=""
			lay-verify="phone" autocomplete="off" class="layui-input"
			value="<%=list.getColor()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>颜色
	</div>
	</div>
	<br>
	<div class="layui-input-inline">
		<input type="text" id="sum" name="sum" required="" lay-verify="phone"
			autocomplete="off" class="layui-input" value="<%=list.getSum()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>总和
	</div>
	</div>
	<br>
	<div class="layui-input-inline">
		<input type="text" id="jiaqian" name="jiaqian" required=""
			lay-verify="phone" autocomplete="off" class="layui-input"
			value="<%=list.getJiaqian()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>价格
	</div>
	</div>
	<br>
	<div class="layui-input-inline">
		<input type="text" id="fenlei" name="fenlei" required=""
			lay-verify="phone" autocomplete="off" class="layui-input"
			value="<%=list.getFenlei()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>分类名
	</div>
	</div>
	<br>
	<div class="layui-input-inline">
		<input type="text" id="xilie" name="xilie" required=""
			lay-verify="phone" autocomplete="off" class="layui-input"
			value="<%=list.getXilie()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>系列
	</div>
	</div>
	<br>
	<div class="layui-input-inline">
		<input type="text" id="img" name="img" required="" lay-verify="phone"
			autocomplete="off" class="layui-input" value="<%=list.getImg()%>">
	</div>
	<div class="layui-form-mid layui-word-aux">
		<span class="x-red"></span>图片
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