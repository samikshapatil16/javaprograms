package package1;

import java.util.Scanner;

public class CircumferenceOfRectangle 

{
	public static void main(String[] args)
    {
 	   Scanner s1=new Scanner(System.in);
 	   System.out.println("CIRCUMFERENCE OF RECTANGLE");
 	           
 	      int l=           s1.nextInt();
 	      int b=           s1.nextInt();
 	      int area=2*(l+b);
 	      System.out.println("CIRCUMFERENCE OF RECTANGLE IS");
 	      System.out.println(area);
 	      
 	s1.close();      
    }
   
}
