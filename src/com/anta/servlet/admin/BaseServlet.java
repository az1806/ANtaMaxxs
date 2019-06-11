package com.anta.servlet.admin;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        //豕?﹞??每?????～?每1?3????
        String methodName = request.getParameter("method");
        Class c = this.getClass();//豕?﹞??每??※?㏑??㊣?
        Method method = null;
        try {
        	//谷??豕???????～???豕?﹞??每?‘1?o§豕‘﹞?㊣?servlet??-????每1?3?
            method = c.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
        } catch (Exception e){
            throw new RuntimeException("??“豕|?豕～??§“????每1?3????" + methodName +
                    "(HttpServletRequest,HttpServletResponse)??????????-???“???");
        }
        try{
        	//豕～??§“?每1?3??∟????豕‘﹞?㊣?
            method.invoke(this,request, response);
            //System.out.println(methodName+"?每1?3??㏑∫豕???o?");
        }catch(Exception e){
            System.out.println("??“豕～??§“????每1?3????" + methodName + ",????????＃谷?“?????o?o??????????");
            throw new RuntimeException(e);
        }
		
	}
}