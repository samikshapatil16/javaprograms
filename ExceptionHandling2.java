package package1;

//THIS IS ASSIGNMENT NO 62

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 
{

	    public static void main(String[] args)
	    {
	    	try {
	    	Scanner s1=new Scanner(System.in);
	    	System.out.println("please enter your age");
	    	int a=   s1.nextInt();
	    	s1.close();
	    	
	    }
	    	catch(InputMismatchException m1)
	    	{
	    		try
	    		{
	    			Scanner s1=new Scanner(System.in);
	    	    	System.out.println("please enter your age in mumber");
	    	    	int a=   s1.nextInt();
	    	    	s1.close();
	    	
	    		}
	    		
	    		catch(InputMismatchException a1)
	    		{
	    			System.out.println("your input is not matching the criteria");
	    		}
	    		
	    	}
	    	
	    }


}
