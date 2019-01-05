class add
{
	void adder(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void adder(int a,int b,int c)
	{
		System.out.println(a+b+c );
	}
}
class student{
	
	public static void main(String[] args) {
    
		add a=new add();
		a.adder(10, 10);
		a.adder(10,10,10);
		 
		
	}
}