package cc.shine.config;

import cc.shine.service.UserService;
import cc.shine.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: croyances
 * @Date: 2020/11/11 21:15
 * @version: 1.0
 */
@Configuration
public class Config {
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
}
