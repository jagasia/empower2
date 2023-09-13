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
    	System.out.println(book.getAuthor().getName());
    	Mathematics m= (Mathematics) ctx.getBean("maths");
//    	System.out.println(m.getNo1());
//    	System.out.println(m.getNo2());
//    	m.setNo1(2000);
//    	m.setNo2(5000);
    	m.updateSum();
    	System.out.println(m.getResult());
//
//    	Mathematics m2= (Mathematics) ctx.getBean("maths");
//    	m2.updateSum();
//    	System.out.println(m2.getResult());
//    	
//    	Mathematics m3= (Mathematics) ctx.getBean("maths");
//    	System.out.println(m==m2);
    }
}
