package com.empower.spring;

import java.util.List;

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
    	Book book = ctx.getBean(Book.class);
    	List<Author> authors = book.getAuthors();
    	for(Author a : authors)
    		System.out.println(a);
    }
}
