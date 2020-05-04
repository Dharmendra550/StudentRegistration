package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student
{
	@Id
private Integer studentid;
private String studentname;
@Column(name="studentmarks")
private Double marks;
@Column(name="studentstream")
private String streamname;
public Integer getStudentid() {
	return studentid;
}
public void setStudentid(Integer studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public Double getMarks() {
	return marks;
}
public void setMarks(Double marks) {
	this.marks = marks;
}
public String getStreamname() {
	return streamname;
}
public void setStreamname(String streamname) {
	this.streamname = streamname;
}

}
