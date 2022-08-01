package assisPracticeProject;

class OuterCls {
	  int x = 30;

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}

//anonymous class
abstract class dog{
	abstract void name();
}
public class InnerclsEx {

	public static void main(String[] args) {
		OuterCls myOuter = new OuterCls();
	    OuterCls.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.myInnerMethod());
	    
	    dog Dog=new dog() { //anonymous class
	    	void name() {
	    		System.out.println("jacky");
	    	}
	    };
	    
	Dog.name();	
	}
}
