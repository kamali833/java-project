package assisPracticeProject;

public class ClassandObject {
		 int sid;
		 String sname;
		 String scollege;
		public ClassandObject(int sid, String sname, String scollege) {
			
			this.sid = sid;
			this.sname = sname;
			this.scollege = scollege;
			System.out.println("Roll Number: "+sid+"\n"+"Student Name: "+sname+"\n"+"College Name: "+scollege);
		}
		  public static void main(String[] args) {
			ClassandObject we=new ClassandObject(12,"Rani","CEG");
			
			
		}
		}

