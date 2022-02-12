package com.yk.contact.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yk.contact.model.Contact;

public class ContactDAOImpl implements ContactDAO {

	private JdbcTemplate jdbcTemplate;

	public ContactDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Contact c) {
		String sql = "INSERT INTO contact (name, email, address, phone) VALUES (?, ?, ?, ?)";
		return jdbcTemplate.update(sql, c.getName(), c.getEmail(), c.getAddress(), c.getPhone());
	}

	@Override
	public int update(Contact contact) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public Contact get(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public List<Contact> list() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
