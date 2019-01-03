import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
			ArrayList<String> list=new ArrayList<String>();  
			list.add("rahul");  
			list.add("jai");  
			  
			String s=list.get(1);//type casting is not required  
			System.out.println("element is: "+s);  

			}
	}
