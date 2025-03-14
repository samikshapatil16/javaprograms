package package1;

public class BothStaticAndNotnStatic 
{
        static void add()
        {
        	int a=100;
        	int b=200;
        	System.out.println(a+b);
        }
        
        void sub()
        {
        	int a=30;
        	int b=20;
        	System.out.println(a-b);
        }
  public static void main(String[] args)
        {
	        add(); //static method inside main
	        BothStaticAndNotnStatic n1=new BothStaticAndNotnStatic(); //non static method inside main
	        n1.sub();
	        
	        		 
	    }
}
