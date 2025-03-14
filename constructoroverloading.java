package package1;

public class constructoroverloading 
{
	constructoroverloading ()
	{
		System.out.println("this is a constructor");
	}
	
	constructoroverloading (int a)
	
	{
		System.out.println("this is my second constructor");
		
	}
	
	constructoroverloading (char a,int c,double d)
	
	{
		System.out.println("this is my third constructor");
	}
	
public static void main(String[] args)

    {
	
	new constructoroverloading();
	new constructoroverloading(2);
	new constructoroverloading('v',3,5.67);
	
    }
}
