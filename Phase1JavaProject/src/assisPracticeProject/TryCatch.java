package assisPracticeProject;

public class TryCatch {

		public static void main(String[] args) {
			int a;
				try {
					
					a= 80/0;
					System.out.println(a);
				}
				catch(Exception e) {
					System.out.println("error occured");
					
				}
				
			}
		}


