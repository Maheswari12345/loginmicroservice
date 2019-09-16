package com.devglan.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="course_name")
	private String courseName;
	@Column(name="duration")
	private int duration;
	@Column(name="completed_training")
	private int completedTraining;
	@Column(name="rating")
	private int rating;
	@Column(name="current_training")
	private int currentTtraining;
	@Column(name="fees")
	private long fees;
	@Column(name="student_name")
	private String studentName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Mentor [courseName=" + courseName + ", duration=" + duration + ", completedTraining="
				+ completedTraining + ", rating=" + rating + ", currentTtraining=" + currentTtraining + ", fees=" + fees
				+ ", studentName=" + studentName + "]";
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCompletedTraining() {
		return completedTraining;
	}
	public void setCompletedTraining(int completedTraining) {
		this.completedTraining = completedTraining;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getCurrentTtraining() {
		return currentTtraining;
	}
	public void setCurrentTtraining(int currentTtraining) {
		this.currentTtraining = currentTtraining;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	
	
	

}
