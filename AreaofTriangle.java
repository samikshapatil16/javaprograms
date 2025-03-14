package package1;

import java.util.Scanner;

public class AreaofTriangle 
{
	public static void main(String[] args)
    {
 	   Scanner s1=new Scanner(System.in);
 	   System.out.println("area of triangle");
 	           
 	      int b=           s1.nextInt();
 	      int h=           s1.nextInt();
 	      double area=0.5*(b*h);  
 	      System.out.println("area of triangle is");
 	      System.out.println(area);
 	      
 	s1.close();      
    }
   
}
