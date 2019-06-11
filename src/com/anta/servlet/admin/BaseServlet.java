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
        
        //��?��??�C?????��?�C1?3????
        String methodName = request.getParameter("method");
        Class c = this.getClass();//��?��??�C??��?��??��?
        Method method = null;
        try {
        	//��??��???????��???��?��??�C?��1?o��������?��?servlet??-????�C1?3?
            method = c.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
        } catch (Exception e){
            throw new RuntimeException("??����|?����??����????�C1?3????" + methodName +
                    "(HttpServletRequest,HttpServletResponse)??????????-???��???");
        }
        try{
        	//����??����?�C1?3??��????������?��?
            method.invoke(this,request, response);
            //System.out.println(methodName+"?�C1?3??��쨨???o?");
        }catch(Exception e){
            System.out.println("??������??����????�C1?3????" + methodName + ",????????����?��?????o?o??????????");
            throw new RuntimeException(e);
        }
		
	}
}