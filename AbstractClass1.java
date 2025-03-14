package package1;

//abstract class and abstarct method program


abstract class ppv   //abstract class
{
	 abstract void add(); // 2 abstarct methods present
     abstract void sub();
    
}

public class AbstractClass1 extends ppv
{

	public static void main(String[] args)
	{
		 AbstractClass1 a1=new  AbstractClass1();
		 a1.add();
		 a1.sub();
			 
	}
	
void add()     // method overridding
{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
}

void sub()    //method overridding
{
	int a=50;
	int b=20;
	int minus=a-b;
	System.out.println(minus);
}
}
