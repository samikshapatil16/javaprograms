package package1;

public class methodoverloadingstatic 
{
	
	static void add(int a)
	{
		System.out.println("1");
	}
	

	static void add(int a,int b)
	{
		System.out.println("2");
	}
	
	static void add(double a,int b)
	{
		System.out.println("3");
	}
	
	
	void add(char a)
	{
		System.out.println("k");
	}
	
	void add(String d)
	{
		
		System.out.println("samiksha");
	}
	
public static void main(String[] args)
       
    {
        
	    add(34);
	    add(23,67);
	    add(3.45,67);
	    methodoverloadingstatic m1=new methodoverloadingstatic();
	    m1.add('k');
	    m1.add("samiksha");
	    
	    
	    
    }

}
