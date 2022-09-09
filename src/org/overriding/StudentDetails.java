package org.overriding;

public class StudentDetails {
	public void studentInfo(String name,int id) {
		System.out.println(name+"\n"+id);
		
	}
	public void studentContact(long contact) {
		System.out.println(contact);
		}
	
	public static void main(String[] args) {
		StudentDetails stdInfo=new StudentDetails();
		stdInfo.studentInfo("vignesh ", 50906);
		stdInfo.studentContact(8870228297l);
		
	}

}
