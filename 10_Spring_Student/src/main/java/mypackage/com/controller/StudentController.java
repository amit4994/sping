package mypackage.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mypackage.com.model.Student;
import mypackage.com.repostiory.StudentRepostiory;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepostiory studentController;
	
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		
		return studentController.findAll();

	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable(value="id") int id) {
		
		Student student = studentController.findById((long) id).get();
		
		return student;
	}
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		
		return studentController.save(student);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudentId(@PathVariable int id) {
		
		studentController.deleteById((long) id);
	
	}
	
	@PutMapping("/student/{id}")
	public Student UpdtaeStudentId(@PathVariable int id, @RequestBody Student updatedStudent) {
		
		Student student = studentController.findById((long) id).get();
		student.setStudentId(updatedStudent.getStudentId());
		student.setStudentName(updatedStudent.getStudentName());
		student.setStudentContactNumber(updatedStudent.getStudentContactNumber());
		student.setStudentEmailId(updatedStudent.getStudentEmailId());
		student.setStudentAge(updatedStudent.getStudentAge());
		student.setStudentRollNumber(updatedStudent.getStudentRollNumber());
		
		return studentController.save(student);
		
	}
	
}
