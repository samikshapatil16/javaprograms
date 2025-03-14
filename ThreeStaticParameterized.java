package package1;

public class ThreeStaticParameterized 
{
         static void add(int a, int b)
         {
        	 int sum=a+b;
        	 System.out.println(sum);
         }
         
         static void sub(int a, int b)
         {
        	 int subtract=a-b;
        	 System.out.println(subtract);
         }
         
         static void mul(int a, int b)
         {
        	 int multi=a*b;
        	 System.out.println(multi);
         }
         
 public static void main(String[] args)
{
         
	     add(50,100);
	     sub(100,50);
	     mul(10,5);
	     
}
}
