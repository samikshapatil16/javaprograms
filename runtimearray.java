package package1;

import java.util.Scanner;

//THIS IS MY ASSIGNMENT 76

public class runtimearray 

{
	public static void main(String[] args)
	{
   Scanner s1=new Scanner(System.in);
   System.out.println("please enter size of your array");
   int rollno[]=new int[s1.nextInt()];
  
   
   for(int i=0;i<rollno.length;i++)
   {
	   System.out.println("please enter value at index"+i);
	   rollno[i]=s1.nextInt();
	   
   }
   
}
}