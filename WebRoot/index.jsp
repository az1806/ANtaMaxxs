<%@ page language="java" import="java.util.*,com.jiaju.entity.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Company pdy = (Company) request.getAttribute("cpdy");
	List<Productlist> llist = (List<Productlist>) request
			.getAttribute("ldlist");
	List<Producttype> list = (List<Producttype>) request
			.getAttribute("lblist");
			List<Productlist> prolist =(List<Productlist>) request.getAttribute("getpro");
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


	<section class="index-section">
		<div>
			<span></span> <span></span>
		</div>
		<div class="index-content">
			<section class="index-content-section-first">
				<div>
					<img src="images/sectionbanner.png" alt="">
				</div>
			</section>
			<section class="index-content-section-second">
				<div>
					<div class="index-auto">
						<article>公司介绍</article>
						<h6>COMPANY INTRODUCTION</h6>
						<!-- 公司介绍 -->
						<main><%=pdy.getJianjie()%></main>
						<a class="index-button" href="#">查看详情</a>
					</div>
				</div>
			</section>
		</div>
	</section>

	<section class="index-product">
		<main>
		<ul>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<li><a href="Productlist?id=<%=list.get(i).getId()%>"></a>
			</li>
			<%
				}
			%>
		</ul>
		</main>
		<main></main>
		<main></main>
	</section>
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/">网页模板</a>
	</div>
	<section class="index-margin-bottom">
		<div class="index-morecase">
			<span></span> <a href="#">MORE &#62; &#62;</a>
		</div>
		<div class="index-content">
			<div class="product-list">

				<div class="am-u-sm-6 am-u-md-6 am-u-lg-4">
					
					
 	

  
  <table>
  
  <tr>
   <a href="product_info.html"> <!--随机亮出6张照片  -->
					
 	 <%for (int i = 0; i < 3; i++) { %>
 	 
  <td>
  
       <img href="productdetail?cpid=<%=llist.get(i).getId() %>" src="<%=llist.get(i).getImg()%>" />
  </td>
  <%}%>
  
    </a>
  </tr>
   <tr>
   <a href="product_info.html"> <!--随机亮出6张照片  -->
					
 	 <%for (int i = 3; i <6; i++) {%>
  <td>
       <img href="productdetail?cpid=<%=llist.get(i).getId() %>" src="<%=llist.get(i).getImg()%>" />
  </td>
  <%}%>
  
    </a>
  </tr>
  </table>
        
  
  
  
				</div>
			</div>
			
		</div>
		






		
	</section>

	<jsp:include page="/foot"></jsp:include>
</body>
</html>