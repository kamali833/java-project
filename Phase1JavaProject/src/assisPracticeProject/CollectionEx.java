package assisPracticeProject;
import java.util.*;

public class CollectionEx {
	public static void main(String args[]) {
		System.out.println("      Arraylist......");
	
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	list.add("AAAA");//Adding object in arraylist  
	list.add("BBBB");  
	list.add("CCCC");  
	list.add("DDDD");  
	//Traversing list through Iterator  
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	System.out.println("    Linkedlist......");
	LinkedList<String> al=new LinkedList<String>();  
	al.add("aaaaa");  
	al.add("bbbb");  
	al.add("cccc");  
	al.add("dddd");  
	Iterator<String> iter=al.iterator();  
	while(iter.hasNext()){  
	System.out.println(iter.next());  
	}  
	System.out.println("    Vector...... ");
	Vector<String> v=new Vector<String>();  
	v.add("Abcd");  
	v.add("efgh");  
	v.add("ijkl");  
	v.add("mnop");  
	Iterator<String> itera=v.iterator();  
	while(itera.hasNext()){  
	System.out.println(itera.next());  
	}  
   System.out.println("       Stack.....");
   Stack<String> stack = new Stack<String>();  
   stack.push("Mango");  
   stack.push("Apple");  
   stack.push("Orange");   
   stack.pop();  
   Iterator<String> itrat=stack.iterator();  
   while(itrat.hasNext()){  
   System.out.println(itrat.next());  
   }  
}
}
