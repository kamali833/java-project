
public class PersonDetails {
	 
		int empid;
		String name,email;
			

	PersonDetails(int empid,String name, String email)
	{
		this.empid=empid;
		this.name=name;
		this.email=email;
		

	}
	
	void display() {
		System.out.println(" empid="+ this.empid);
		System.out.println(" emp name="+ this.name);
		System.out.println(" emp email="+ this.email);
	}


}
