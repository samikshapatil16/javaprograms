package package1;

//THIS IS MY ASSIGNMENT NO 64

public class Finallyex 
{
public static void main(String[] args)
{
	try
	{
		int b=2/2;
	}
	catch(ArithmeticException a1)
	{
		System.out.println("this is a catch block");
	}
	finally
	{
		System.out.println("this is a finally block and this program don't have any exception");
	}
}
}
