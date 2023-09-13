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
    	Mathematics m= (Mathematics) ctx.getBean("maths");
//    	System.out.println(m.getNo1());
//    	System.out.println(m.getNo2());
    	m.updateSum();
    	System.out.println(m.getResult());
        System.out.println( "Hello World!" );
    }
}
