package package1;

public class callingstaticmethod 
{
              static void add ()
              { 
            	  int a=10;
            	  int b=20;
            	  System.out.println(a+b);
            	  
              }
              public static void main (String[] args)
              {
            	  add();//calling static method inside main method
              }
}
