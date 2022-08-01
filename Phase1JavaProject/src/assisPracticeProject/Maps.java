package assisPracticeProject;
import java.util.*;

public class Maps {
	public static void  main(String args[]) {
	HashMap<Integer,String> hash=new HashMap<Integer,String>();      
    hash.put(1,"AAA");    
    hash.put(2,"BBB");    
    System.out.println("\nThe elements of Hashmap are:");  
    for(Map.Entry m:hash.entrySet()){    
     System.out.println(m.getKey()+" "+m.getValue());    
    }
    
   //HashTable
     
    Hashtable<Integer,String> hash1=new Hashtable<Integer,String>();  
    
    hash1.put(3,"CCC");  
    hash1.put(4,"DDD");  
    System.out.println("\nThe elements of HashTable are:");  
    for(Map.Entry n:hash1.entrySet()){    
     System.out.println(n.getKey()+" "+n.getValue());    
    }
    
    
    //TreeMap
    
    TreeMap<Integer,String> tree=new TreeMap<Integer,String>();    
    tree.put(5,"EEE");    
    tree.put(6,"FFF");    
          
    
    System.out.println("\nThe elements of TreeMap are:");  
    for(Map.Entry l:tree.entrySet()){    
     System.out.println(l.getKey()+" "+l.getValue());    
    }    
    
 }  
}

