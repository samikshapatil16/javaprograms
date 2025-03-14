package package1;

import java.util.Scanner;

public class AreaOfRectangle 

{

    public static void main(String[] args)
    {
 	   Scanner s1=new Scanner(System.in);
 	   System.out.println("area of rectangle");
 	           
 	      int l=           s1.nextInt();
 	      int b=           s1.nextInt();
 	      int area=(l*b);
 	      System.out.println("area of rectangle is");
 	      System.out.println(area);
 	      
 	s1.close();      
    }
   
}
