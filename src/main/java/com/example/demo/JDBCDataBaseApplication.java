package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.jdbc.PersonJDBCDao;

//@SpringBootApplication
public class JDBCDataBaseApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonJDBCDao personJDBCDao;
	
	public static void main(String[] args) {
		SpringApplication.run(JDBCDataBaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*logger.info("\nAll users->{}",personJDBCDao.findAll());
		
		logger.info("\nUser by id->{}",personJDBCDao.findById(100));
		
		logger.info("\nUser by name->{}",personJDBCDao.findByName("Vijay"));
		
		logger.info("\nUser by location->{}",personJDBCDao.findByLocation("Chennai"));
		
		logger.info("\nDelete by id->{}",personJDBCDao.deleteById(100));*/
	}
}
