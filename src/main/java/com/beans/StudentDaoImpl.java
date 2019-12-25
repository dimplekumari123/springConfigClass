package com.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDaoImpl implements StudentDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Student getStuById(Integer roll) {
	String sql="select * from Student where  Roll_no=?";
	 Student s=jdbcTemplate.queryForObject(sql,new Object[] {roll},new StudentRowMapper());
		return s;
	}

	public Student updateStu(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
