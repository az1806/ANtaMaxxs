﻿<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>某某家具设计公司企业官网-模板之家</title>
    ﻿<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate icon" type="image/png" href="images/favicon.png">
<link rel='icon' href='favicon.ico' type='image/x-ico' />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/default.min.css?t=227" />
<!--[if (gte IE 9)|!(IE)]><!-->
<script type="text/javascript" src="lib/jquery/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="lib/amazeui/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script type="text/javascript" src="lib/handlebars/handlebars.min.js"></script>
<script type="text/javascript" src="lib/iscroll/iscroll-probe.js"></script>
<script type="text/javascript" src="lib/amazeui/amazeui.min.js"></script>
<script type="text/javascript" src="lib/raty/jquery.raty.js"></script>
<script type="text/javascript" src="js/main.min.js?t=1"></script>

<script type="text/javascript">
	function Tijiao(){
		var username = document.getElementById("username").value;
		var phone = document.getElementById("phone").value;
		var email = document.getElementById("email").value;
		var content = document.getElementById("content").value;
		if(username == ""){
			alert("名字不能为空!!!");
			return false;
		}
		if(phone == ""){
			alert("电话不能为空!!!");
			return false;
		}
		if(email == ""){
			alert("邮箱不能为空!!!");
			return false;
		}
		if(content == ""){
			alert("评论内容不能为空!!!");
			return false;		
		}
		alert("留言成功");
		
		return true;
	}
</script>
</head>
<body>
<jsp:include page="/header"></jsp:include>
<div>
    <header class="header-article-list">
        <h1>在线留言</h1>

    </header>
<div>
   <form class="message-form" action="message" method="post" >

       <label>姓名
           <input id="username" type="text" name="username">
           <span>*</span>
       </label>


       <label>电话
           <input id="phone" type="text" name="phone">
           <span>*</span>
       </label>


       <label>邮箱
           <input id="email" type="email" name="email">
           <span>*</span>
       </label>

       <label>内容
           <textarea id="content" name="content"></textarea>
           <span>*</span>
       </label>


       <button type="submit" class="am-btn am-btn-danger" onclick="Tijiao()">提交</button>
   </form>
</div>
</div>
﻿<jsp:include page="/foot"></jsp:include>
</body>
</html>