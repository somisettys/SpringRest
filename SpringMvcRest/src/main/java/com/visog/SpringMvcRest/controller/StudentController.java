package com.visog.SpringMvcRest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.visog.SpringMvcRest.model.Student;

@RestController
public class StudentController {

	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getStudents() {
		List<Student> studentList = new ArrayList<>();
		studentList = createStudentList();

		return studentList;

	}
	 @RequestMapping(value = "/student/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudentById(@PathVariable int id) {

		List<Student> studentList = new ArrayList<>();
		studentList = createStudentList();

		for (Student student : studentList) {
			if (student.getId() == id)
				return student;
		}

		return null;
	}
	 @RequestMapping(value = "/students", method = RequestMethod.POST)
	public List<Student> createStudentList() {

		Student indiaStudent = new Student(1, "India");
		Student chinaStudent = new Student(4, "China");
		Student nepalStudent = new Student(3, "Nepal");
		Student bhutanStudent = new Student(2, "Bhutan");

		List<Student> listOfCountries = new ArrayList<Student>();
		listOfCountries.add(indiaStudent);
		listOfCountries.add(chinaStudent);
		listOfCountries.add(nepalStudent);
		listOfCountries.add(bhutanStudent);
		return listOfCountries;

	}
}
