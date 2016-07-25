package com.han.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-penngo-provider.xml"});
        context.start();
 
        System.in.read(); 
	}
}
