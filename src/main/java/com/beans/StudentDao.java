package com.beans;

import java.util.List;

public interface StudentDao {
	public Student getStuById(Integer roll);
	public Student updateStu(Student stu);
	public List<Student> getAll();
	

}
