package com.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rsnum) throws SQLException {
		Student s=new Student();
		s.setRoll(rs.getInt("Roll_no"));
		s.setName(rs.getString("Stu_name"));
		s.setAge(rs.getInt("age"));
		return s;
	}

}
