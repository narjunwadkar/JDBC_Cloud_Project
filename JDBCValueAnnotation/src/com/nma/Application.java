package com.nma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCConn conn = context.getBean("jdbccon", JDBCConn.class);
		conn.dsiplay();
		conn.jdbcConnection();
		
			
		
	}

}
