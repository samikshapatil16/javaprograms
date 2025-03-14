package package1;

//super keywordnprogram

class supermost 
{   
	void data()
	{
		System.out.println("my age is 26");
	}
}

class superlike extends supermost 
{   
	void data()
	{
		System.out.println("i live in nashik");
		super.data();
	}
}

class superlost extends superlike
{   
	void data()
	{
		System.out.println("my name is samiksha");
		super.data();
	}
} 
public class superkeyword 

{
	public static void main(String[] args)
	 {
		   superlost s1=new superlost();
		   s1.data();
		   
	 }
}

