package mypackage.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudnetBio")
public class Student {

	@Id
	private Long studentId;
	private String studentName;
	private String studentRollNumber;
	private String studentEmailId;
	private int studentAge;
	private String studentContactNumber;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long studentId, String studentName, String studentRollNumber, String studentEmailId, int studentAge,
			String studentContactNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.studentEmailId = studentEmailId;
		this.studentAge = studentAge;
		this.studentContactNumber = studentContactNumber;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentEmailId() {
		return studentEmailId;
	}
	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentContactNumber() {
		return studentContactNumber;
	}
	public void setStudentContactNumber(String studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollNumber="
				+ studentRollNumber + ", studentEmailId=" + studentEmailId + ", studentAge=" + studentAge
				+ ", studentContactNumber=" + studentContactNumber + "]";
	}
}
