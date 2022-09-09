package org.poly;
//method overloading
public class StudentDetail {
	private void studentInfo(String name) {
		System.out.println("name:"+name);
	}
	private void studentInfo(long contact,String address) {
		System.out.println("address:"+address);
		System.out.println("contact:"+contact);
	}
	private void studentInfo(int id,boolean present) {
		System.out.println("id:"+id);
		System.out.println("present:"+present);
	}
	public static void main (String[]args) {
		StudentDetail details = new StudentDetail();
		details.studentInfo("vignesh");
		details.studentInfo(8870228297l,"omr");
		details.studentInfo(1345,true);
		
		
		
	}

}
