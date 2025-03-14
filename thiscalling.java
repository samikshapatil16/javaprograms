package package1;

public class thiscalling 
{
     thiscalling()
     {   this("samiksha");
    	 System.out.println("this is my this calling conctructor class with samiksha");
     }
     
     thiscalling(String name)
     {   this(34);
    	 System.out.println("this is my this calling conctructor class with 34");
     }
     
     thiscalling(int a)
     {
    	 System.out.println("this is my this calling conctructor class");
     }
     
     public static void main(String[] args)
     {
    	 new thiscalling();
     }
}
