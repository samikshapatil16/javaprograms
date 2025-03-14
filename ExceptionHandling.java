package package1;

//EXCEPTION HANDLING PROGRAM ASSIGNMENT NO 61

public class ExceptionHandling 
{
    public static void main(String[] args)
    {
    	try {
    	int a=5/0;
    	}
    	catch(ArithmeticException a1)
    	{
    		System.out.println("exception is handled");
    	}
    }
}
