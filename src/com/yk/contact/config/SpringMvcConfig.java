package com.yk.contact.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.yk.contact.dao.ContactDAO;
import com.yk.contact.dao.ContactDAOImpl;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.yk.contact")
public class SpringMvcConfig implements WebMvcConfigurer {

	@Bean
	public DataSource getDataSource() {
		Dotenv dotenv = Dotenv.load();
		String USER_ROLE = dotenv.get("USER_ROLE");
		String PASSWORD = dotenv.get("PASSWORD");
		String DATABASE_NAME = dotenv.get("DATABASE_NAME");

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/"+DATABASE_NAME);
		dataSource.setUsername(USER_ROLE);
		dataSource.setPassword(PASSWORD);

		return dataSource;
	}

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}

	@Bean
	public ContactDAO getContactDAO() {
		return new ContactDAOImpl(getDataSource());
	}
}
