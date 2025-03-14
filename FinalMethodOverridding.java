package package1;

//methodoverridding program using final variable

class tira
{   
	final void login()
	{
		System.out.println("login to tira with your name i.e samiksha");
	}
}

class paytm extends tira
{   
	void login()  // this is showing compile time error because any method which is final we can not copy its- 
	              //-name we can not override it
	{
		System.out.println("login to paytm with your number i.e 23");
		
	}
}

public class FinalMethodOverridding 
{
	public static void main(String[] args)
	 {
		   paytm a1=new paytm();
		   a1.login();
		   
	 }
}
