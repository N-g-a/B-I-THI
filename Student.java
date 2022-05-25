/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_THI;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Student extends Person implements Serializable{
	 
	String studentId;
	 String major;
	 Date enrolledDate;
	 
	 public Student() {
		 super ();
	 }

	/**
	 * @param name
	 * @param birthday
	 * @param gender
	 * @param studentId
	 * @param major
	 * @param enrolledDate
	 */
	public Student(String name, Date birthday, byte gender, String studentId, String major, Date enrolledDate) {
		super(name, birthday, gender);
		this.studentId = studentId;
		this.major = major;
		this.enrolledDate = enrolledDate;
	}

    
    

        public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", major=" + major + ", enrolledDate=" + enrolledDate + ", name="
				+ name + ", birthday=" + birthday + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
				if (getName().compareTo(o.getName())==0) {
					return getBirthday().compareTo(o.getBirthday());
				}
				else {
					return getName().compareTo(o.getName());
					}
	}

}
	

