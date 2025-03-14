package package1;

public class globalstaticandnonstatic 

{
         static int a=10;
         static int b=20;
          
           void add()
           {
        	   System.out.println(a+b);
           }
           
           static void sub()
           {
        	   System.out.println(a-b);
           }
           
  public static void main(String[] args)
           {
	              sub();
	              globalstaticandnonstatic m1=new globalstaticandnonstatic ();
	              m1.add();
	       }
          
}
