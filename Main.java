
//inner classes 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj=new outer();  
		  outer.Inner in=obj.new Inner();  
		  in.msg();  
	}

}
class outer{  
	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
}

	
 
