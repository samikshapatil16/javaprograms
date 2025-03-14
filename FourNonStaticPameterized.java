package package1;

public class FourNonStaticPameterized 
{

	void add(int a,int b)
	{
		int addition=a+b;
		System.out.println(addition);
	}
	
	void sub(int a,int b)
	{
		int subtraction=a-b;
		System.out.println(subtraction);
	}
	
	void mul(int a,int b)
	{
		int multiply=a*b;
		System.out.println(multiply);
	}
	
	void student(char a,boolean b)
	{
     
		System.out.println("name");
	}
	
public static void main(String[] args)
	{
	 FourNonStaticPameterized  n2=new  FourNonStaticPameterized ();
		n2.add(50,100);
		n2.sub(50,30);
		n2.mul(300,5);
		n2.student('s',false);
	}
	
}
