package com.example.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person;

@Repository
public class PersonJDBCDao {

	@Autowired
	private JdbcTemplate jDBCTemplate;
	
	public List<Person> findAll() {
		return jDBCTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id) {
		return jDBCTemplate.queryForObject
				("select * from person where id=?",new Object[]{id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> findByName(String name) {
		return jDBCTemplate.query
				("select * from person where name=?",new Object[]{name},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> findByLocation(String location) {
		return jDBCTemplate.query
				("select * from person where location=?",new Object[]{location},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id) {
		return jDBCTemplate.update
				(
					"delete from person where id=?", new Object[]{id}
				);
	}
}
