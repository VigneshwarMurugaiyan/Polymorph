package org.overriding;

public class Student extends StudentDetails{
  public void studuentContact(long contact) {
	System.out.println(contact);
	super.studentInfo("vignesh",50906);
	}
public static void main(String[]args) {
	Student stuInfo=new Student();
	stuInfo.studuentContact(887022988l);
}
}
