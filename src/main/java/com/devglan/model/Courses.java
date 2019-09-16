package com.devglan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	@Id
	private int id;
	@Column(name="courses_name")
	private String coursesName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursesName() {
		return coursesName;
	}
	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}
	public String getMentorName() {
		return mentorName;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", coursesName=" + coursesName + ", mentorName=" + mentorName + ", studentName="
				+ studentName + "]";
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Column(name="mentor_name")
	private String mentorName;
	@Column(name="student_name")
	private String studentName;

}
