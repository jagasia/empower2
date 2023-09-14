package com.empower.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
    	Book book=(Book) ctx.getBean("book");
    	System.out.println(book);
        System.out.println( "Hello World!" );
    }
}
