package com.school.manage.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "School")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentId")
	private Integer studentId;

	@Column(name = "StudentName")
	private String studentName;

	@Column(name = "StudentDOB")
	private String studentDOB;

	@Column(name = "StudentClass")
	private String studentClass;

	@Column(name = "MarksObtained")
	private Integer marksObtained;

	@Column(name = "TotalMarks")
	private Integer totalMarks;

	@Column(name = "Percentage")
	private Double percentage;

	@Column(name = "StudentRank")
	private Integer rank;

	@Column(name = "Result")
	private String result;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Integer getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(Integer marksObtained) {
		this.marksObtained = marksObtained;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

//	public School(String studentName, String studentDOB, String studentClass, int marksObtained, int totalMarks,
//			double percentage, int rank, String result) {
//		this.studentName = studentName;
//		this.studentDOB = studentDOB;
//		this.studentClass = studentClass;
//		this.marksObtained = marksObtained;
//		this.totalMarks = totalMarks;
//		this.percentage = percentage;
//		this.rank = rank;
//		this.result = result;
//	}
}
