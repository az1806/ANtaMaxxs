﻿<%@ page language="java" import="java.util.*,com.jiaju.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      		
      		 List <Newsin> list = ( List <Newsin>)request.getAttribute("nsn");
    
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<base href="<%=basePath%>">
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
</head>
<body>
<jsp:include page="/header"></jsp:include>
       <header class="header-article-list">
        <div class="article-position">新闻资讯</div>
      <%List<Newsintype> listss =(List<Newsintype>) request.getAttribute("listss");%>
     
  		<ul>
  		 <%for(int i=0;i<listss.size();i++){ %>
            	<li class="article-on"><a href="article_list?typeid=<%=listss.get(i).getId() %>"><%=listss.get(i).getLeibie() %></a></li>
       <%} %>
        </ul>
      
       
        <div class="article-more-btn">
            <a href="article_list_more.html">MORE &#62; &#62;</a>
        </div>
    </header>
              
    <section class="article-content">
       <ul>
        <%for(int i=0;i<list.size();i++){ %>
            <li>
                <div class="article-date">
                    <strong><%=list.get(i).getId() %></strong>
                  <p><%=list.get(i).getDate() %></p>
                </div>
                <div class="article-info">
                    <a href="article_list_content?id=<%=list.get(i).getId() %>">
                        <h3><%=list.get(i).getZixun() %></h3>
                        <p><%=list.get(i).getXiangqing() %></p>
                    </a>
                    <%} %>
                </div>
            </li>

           
        </ul>

    </section>
</div>
<jsp:include page="/foot"></jsp:include>
</body>
</html>