package assisPracticeProject;

class Student{
	String name,Dept,Collgname;
	int Regno;
	//Default constructor
	Student(){
		name="xxx";
		System.out.println("Student Name:"+name);
	}
	
	// Parameter constructor
	
	Student(int stuRegno,String stuDept,String stuCollgname){
		Regno=stuRegno;
		Dept=stuDept;
		Collgname=stuCollgname;
		}
	
	void display() {
		System.out.println("Student Reg no:"+Regno);
		System.out.println("Student Department :"+Dept);
		System.out.println("Student Collegage name :"+Collgname);
		
	}
	
}
public class Constructor {
	public static void main(String args[]) {
		Student S1 =new Student();
		Student S2= new Student(123,"cse","abcd");
		S2.display();
		
	
		
	}

}


