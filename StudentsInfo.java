package students;

public class StudentsInfo {

	public void getStudentsInfo(long id)
	{
		System.out.println("Student ID - 204884");
	}
	public void getStudentsInfo(String name, int id)
	{
	
		System.out.println("Student Name = " + name + ", " + "Student ID =" + id);
	}
	public void getStudentsInfo(long phNumber, String mailId)
	{
	
		System.out.println("MobileNumber = " + phNumber + ", " + "Mail id = " + mailId);
	}
	public static void main(String[] args) {
		
		StudentsInfo n = new StudentsInfo();
		n.getStudentsInfo(204884);
		n.getStudentsInfo("Balaji", 204884);
		n.getStudentsInfo(8508494031L, "ibalaji.padmanaban@gmail.com");
	}
}
