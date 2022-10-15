package org.example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);

		/* Using Application context with a Bean */
		Testean x = context.getBean("testBean", Testean.class);
		System.out.println(x.getName());
		context.close();

		/* Using old java way to create objects */
		Testean y = new Testean("my");
		System.out.println(y.getName());
	}
}
