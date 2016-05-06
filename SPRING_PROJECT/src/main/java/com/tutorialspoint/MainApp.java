package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		JdbcTemplate jc = (JdbcTemplate) context.getBean("jdbcTemplate");

		String SQL = "select count(*) from TEMP_TEST";
		long rowCount = jc.queryForLong( SQL );
		
		System.out.println(rowCount);
	}
}