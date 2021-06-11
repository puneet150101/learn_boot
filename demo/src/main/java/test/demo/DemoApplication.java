package test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext co =  SpringApplication.run(DemoApplication.class, args);
		System.out.println("Testing Spring boot!!");
		student ob = co.getBean(student.class);
		ob.work();
	}

}
