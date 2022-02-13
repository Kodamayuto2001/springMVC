package com.yk.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yk.contact.model.Contact;

import io.github.cdimascio.dotenv.Dotenv;



class ContactDAOTest {

	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@BeforeEach
	void setupBeforeEach() {
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
	}

	@Test
	void testSave() {
		Contact contact = new Contact("ダーマ", "ダーマ@ダーマ.com", "Japan", "123456789");
		int result = dao.save(contact);

		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(1, "ダーマ-test", "ダーマ-test@ダーマ.com", "Japan", "9876543210");
		int result = dao.update(contact);

		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		Integer id = 1;
		Contact contact = dao.get(id);

		if (contact != null) {
			System.out.println(contact);
		}

		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		Integer id = 4;
		int result = dao.delete(id);

		assertTrue(result > 0);
	}

	@Test
	void testList() {
		fail("まだ実装されていません");
	}

}
