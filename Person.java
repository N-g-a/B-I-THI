/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_THI;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Person implements Comparable<Student> {
	String name;
	 Date birthday;
	 byte gender;
	 
	 public Person() {
		 super();
	 }

	/**
	 * @param name
	 * @param birthday
	 * @param gender
	 */
	public Person(String name, Date birthday, byte gender) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
