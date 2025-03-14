package package1;

import java.util.Scanner;

public class areaofcircle 

{
           public static void main(String[] args)
           {
        	   Scanner s1=new Scanner(System.in);
        	   System.out.println("area of circle");
        	           
        	      double pi=           s1.nextDouble();
        	      int r=               s1.nextInt();
        	      double area=pi*r*r;
        	      System.out.println("area of circle is");
        	      System.out.println(area);
        	      
        	s1.close();      
           }
          
}
