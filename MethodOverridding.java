package package1;

//methodoverridding program

class nykaa
{   
	void login()
	{
		System.out.println("login to nykka with your name i.e samiksha");
	}
}

class amazon1 extends nykaa
{   
	void login()
	{
		System.out.println("login to amazon with your number i.e 23");
		
	}
}

public class MethodOverridding 
{
   public static void main(String[] args)
   {
	   amazon1 a1=new amazon1();
	   a1.login();
	   
   }
}
