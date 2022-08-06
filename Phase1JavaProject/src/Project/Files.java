package Project;
import java .util.Scanner;
import java.io.File;
import java.io.IOException;

public class Files {
	
	void Add()throws IOException {
		String path="D:\\project\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name:");
		String filename=sc.nextLine();
		String finalpath=path+filename;
		File f=new File(finalpath);
		boolean find=f.createNewFile();
		if(find==true){
			System.out.println("file Created");
			}
		else {
			System.out.println("File not created");
		}
		sc.close();
	}
	
	void Delete()throws IOException{
		String path="D:\\project\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name:");
		String filename=sc.nextLine();
		String finalpath=path+filename;
		File f=new File(finalpath);
		boolean find=f.delete();
		if(find!=true) {
			System.out.println("file not deleted");
		}
		else {
			System.out.println("file deletd");
			
		}
		sc.close();
		
	}
	
	void Display()throws IOException {
		String path="D:\\project\\";
		File f=new File(path);
		File[] filename=f.listFiles();
		for(int i=0;i<filename.length;i++) {
			System.out.println(filename[i].getName());
		}
	}
	 void Search()throws IOException{
		 String path="D:\\project\\";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name which you want to find");
		 String name=sc.nextLine();
		 int flag=0;
		File f=new File(path);
		File[] filename=f.listFiles();
		for(int i=0;i<filename.length;i++) {
			if(filename[i].getName().equals(name)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==0) {
			System.out.println("file not found");
		}
		else {
			System.out.println("file found");
		}
		sc.close();
	}
	
	public static void main(String args[])throws IOException {
		Files file=new Files();
		
		System.out.println("Enter the operation which you need:");
		System.out.println("1.Display the files in Ascending order....2.add a file/delete a file/search a file......");
		Scanner sc=new Scanner(System.in);	
		int ch=sc.nextInt();
		switch (ch) {
		case 1: file.Display();
		        break;
		case 2: //while(true){
			System.out.println("which operation you need");
		    System.out.println("1.Add, 2.delete,3.search........");
		      int n= sc.nextInt(); 
		       switch(n) {
		       case 1: file.Add();
		               break;
		       case 2: file.Delete();
		               break;
		       case 3 : file.Search();
		               break;
		       case 4 : System.exit(0);
		       }
		//}
		case 3: break;      
		}
		}
	
}
