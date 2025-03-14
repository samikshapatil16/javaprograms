package package1;

//supercalling parameterized program

class amazon

{
	amazon(int a,int c)
	{
		System.out.println("i want to login to amazon");
	}
}
 
public class supcalling extends amazon 
{
    supcalling()
    {
    	super(23,45);//super calling statement parametrized constructor.
    	System.out.println("this is my supercalling class which has parameter 23,45");
    }
	
  public static void main(String[] args)
  {
	  new supcalling(); //supercalling statement
  }
}