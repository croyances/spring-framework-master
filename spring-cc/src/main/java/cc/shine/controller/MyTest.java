package cc.shine.controller;

import cc.shine.config.Config;
import cc.shine.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: croyances
 * @Date: 2020/11/11 21:13
 * @version: 1.0
 */

public class MyTest {




	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.say();
	}

	@Test
	public void s(){
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.say();
	}

}
