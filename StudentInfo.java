package week3.day1.assignments;

public class StudentInfo {
	public void  getStudentInfo() {
		System.out.println("Students information");
	}
public void  getStudentInfo(int id) {
	System.out.println("Students information"+id);
	}
public void  getStudentInfo(int id,String name) {
	System.out.println("Students id and name: "+id+","+name);
}
public void  getStudentInfo(String email,long phoneNumber) {
	System.out.println("Students information");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo obj=new StudentInfo();
		obj.getStudentInfo();
		
		obj.getStudentInfo(688);
		obj.getStudentInfo(34, "Hema");
		obj.getStudentInfo("Hemasara.gmail.com", 7856755645L);
	}

}
