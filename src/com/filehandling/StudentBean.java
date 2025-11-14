package com.filehandling;
import java.io.*;
public class StudentBean implements Serializable {

	private int id;
	private String name;
	private int age;
	public StudentBean(int id,String name,int age)
	{
		this.id = id;
		this.name=name;
		this.age=age;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", age=" + age + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
