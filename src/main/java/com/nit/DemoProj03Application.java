package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbean.Palindrome;

@SpringBootApplication
public class DemoProj03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DemoProj03Application.class, args);
		Palindrome p=ctx.getBean("p",Palindrome.class);
		p.isPalindrome(121);
	}

}
