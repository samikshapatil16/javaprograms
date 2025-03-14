package package1;

import java.util.InputMismatchException;
import java.util.Scanner;

// THIS IS MY ASSIGNMENT NO 66

public class exceptionhandling3 
{
public static void main(String[] args)
{
	try
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the size of the array");
		int rollno[]=new int[s1.nextInt()];
	}
	catch(InputMismatchException a1)
	{
		System.out.println("your input is wrong");

	}
	catch(NegativeArraySizeException m1)
	{
		System.out.println("array size is wrong");

	}
}
}
