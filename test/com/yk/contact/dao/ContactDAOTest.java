package com.yk.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yk.contact.model.Contact;

import io.github.cdimascio.dotenv.Dotenv;



class ContactDAOTest {

	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@Test
	void testSave() {
		Dotenv dotenv = Dotenv.load();
		String USER_ROLE = dotenv.get("USER_ROLE");
		String PASSWORD = dotenv.get("PASSWORD");
		String DATABASE_NAME = dotenv.get("DATABASE_NAME");

		dataSource = new DriverManagerDataSource();

		// com.mysql.cj.jdbc.Driverは非推奨らしい、自動でloadしてくれるらしい。
		//dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/"+DATABASE_NAME);
		dataSource.setUsername(USER_ROLE);
		dataSource.setPassword(PASSWORD);

		dao = new ContactDAOImpl(dataSource);

		Contact contact = new Contact("Hoge piyo", "hoge@hoge.com", "Japan", "000000000");

		int result = dao.save(contact);

		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		fail("まだ実装されていません");
	}

	@Test
	void testGet() {
		fail("まだ実装されていません");
	}

	@Test
	void testDelete() {
		fail("まだ実装されていません");
	}

	@Test
	void testList() {
		fail("まだ実装されていません");
	}

}
