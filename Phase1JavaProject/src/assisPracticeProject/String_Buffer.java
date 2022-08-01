package assisPracticeProject;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Started Java");
		sb.append("Phase1");
		System.out.println(sb);
		sb.delete(2,5);
		System.out.println(sb);
		sb.replace(1,5,"Java with Python");
		System.out.println(sb);
		sb.insert(7,"language after word started");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.charAt(9));

}}
