class add
{
	add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	add(int a,int b,int c)
	{
		System.out.println(a+b+c );
	}
}
class student{
	
	public static void main(String[] args) {
    
		add a=new add(10,10,10);
		add a1=new add(10,10);
		
	}
}