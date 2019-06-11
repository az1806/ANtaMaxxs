<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.jiaju.entity.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	Company gs=(Company)request.getAttribute("gs");
%>
<!DOCTYPE html>
<html>
  
  <head>
	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript">
  	function update(){
  	var Corporation =document.getElementById("Corporation").value;
  	var Address =document.getElementById("Address").value;
  	var jieshao =document.getElementById("jieshao").value;
  	var Zipcode =document.getElementById("Zipcode").value;
  	var email =document.getElementById("email").value;
  	var city =document.getElementById("city").value;
  	var img =document.getElementById("img").value;
  	var jianjie =document.getElementById("jianjie").value;
  	var wenhua =document.getElementById("wenhua").value;
  	if(Corporation!=""){
  	window.location.href="/admin/CompanyServlet?method=updatecompany&Corporation="+Corporation+"&Address="+Address+"&jieshao="+jieshao+"&Zipcode="+Zipcode+"&email="+email+"&city="+city+"&img="+img+"&jianjie="+jianjie+"&wenhua="+wenhua+"&id=<%=gs.getId()%>";
  	
  	}
  	
  	}
  </script>
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>公司名称</th>
            <th>网址</th>
            <th>介绍</th>
            <th>邮编</th>
            <th>邮箱</th>
            <th>地址</th>
            <th>图片</th>
            <th>简介</th>
            <th>文化</th>
            <th>操作</th>
        </thead>
        <tbody>
          <tr>
        		<tr>
		            <td>
		              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
		            </td>
		            <td><input type="text" id="Corporation" name="Corporation" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getCorporation() %>"></td>
		            <td><input type="text" id="Address" name="Address" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getAddress()%>"></td>
		            <td><input type="text" id="jieshao" name="jieshao" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getJieshao()%>"></td>
		            <td><input type="text" id="Zipcode" name="Zipcode" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getZipcode()%>"></td>
		            <td><input type="text" id="email" name="email" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getEmail()%>"></td>
		            <td><input type="text" id="city" name="city" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getCity()%>"></td>
		            <td><input type="text" id="img" name="img" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getImg()%>"></td>
		            <td><input type="text" id="jianjie" name="jianjie" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getJianjie()%>"></td>
		            <td><input type="text" id="wenhua" name="wenhua" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="<%=gs.getWenhua()%>"></td>
		            <td class="td-manage">
		              <a title="编辑"  onclick="update()">
		                <i class="layui-icon">&#xe642;</i>
		              </a>
		            </td>
		          </tr>
        </tbody>
      </table>
      <div class="page">
        <div>
          <a class="prev" href="">&lt;&lt;</a>
          <a class="num" href="">1</a>
          <span class="current">2</span>
          <a class="num" href="">3</a>
          <a class="num" href="">489</a>
          <a class="next" href="">&gt;&gt;</a>
        </div>
      </div>

    </div>
    <script>
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>

  </body>

</html>