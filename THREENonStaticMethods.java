package package1;

public class THREENonStaticMethods   
{

	void add()
	{
		int a=300;
		int b=2;
		System.out.println(a+b);
	}
	
	void sub()
	{
		int a=300;
		int b=2;
		System.out.println(a-b);
	}
	
	void mul()

	{
		int a=300;
		int b=2;
		System.out.println(a*b);
	}
	
public static void main(String[] args)
	{
		THREENonStaticMethods n2=new THREENonStaticMethods();
		n2.add();
		n2.sub();
		n2.mul();
	}
}
