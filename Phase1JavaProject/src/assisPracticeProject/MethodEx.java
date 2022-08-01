package assisPracticeProject;

 class MethodEx1 {
	int a=30;
	int b=30;
	public int display;
	
	public void display(MethodEx a) {
		System.out.println("Method Print a integer Value : " + a);
	}
    public void display(int a,int b) {
		System.out.println("Method Overloading" );
	}
}

public class MethodEx {
	
	
	public static void main(String[] args) {
		
		MethodEx1 method=new MethodEx1();
		
		method.display=10;
		method.display(5,5);
		
	}


}
