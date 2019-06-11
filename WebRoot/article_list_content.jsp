<%@ page language="java" import="java.util.*,com.jiaju.entity.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
				List<Newsin> nsn = (List<Newsin>) request.getAttribute("nsn");
			%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<base href="<%=basePath%>">
<title>某某家具设计公司企业官网-模板之家</title> ﻿
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
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
</head>
<body>
	<jsp:include page="/header"></jsp:include>
	<div class="am-slider am-slider-default"
		data-am-flexslider="{playAfterPaused: 8000}"></div>
	<div>
		<header class="header-article-list">
			<div class="article-position">
			<%for(int i=0;i<nsn.size();i++){ %>
			
				<a href="article_list_content?typeid=<%=nsn.get(i).getId() %>"> <span>上一篇</span> <span><%=nsn.get(i).getXiangqing() %></span>
				</a>
				<%} %>
			</div>
			<ul>
				<%
					List<Newsintype> list = (List<Newsintype>) request
							.getAttribute("list");
					for (int i = 0; i < list.size(); i++) {
				%>
				<li class="article-on"><a href="article_list?typeid=<%=list.get(i).getId() %>"><%=list.get(i).getLeibie()%></a>
				</li>
				<%
					}
				%>
			</ul>
			<div class="article-more-btn">
				<%for(int i=0;i<nsn.size();i++){ %>
			
				<a href="article_list_content?typeid=<%=nsn.get(i).getId() %>"> <span>下一篇</span> <span><%=nsn.get(i).getXiangqing() %></span>
				</a>
				<%} %>
			</div>
		</header>
	
		<section class="article-content">
		<%for(int i=0;i<nsn.size();i++){ %>
			
			<h4><%=nsn.get(i).getZixun() %></h4>
			<main>
			<p><%=nsn.get(i).getXiangqing() %></p>

			</main>
      <%} %>
		</section>

	</div>
	<jsp:include page="/foot"></jsp:include>
</body>
</html>