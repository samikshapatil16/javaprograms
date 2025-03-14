package package1;

// THIS IS ASSIGNMENT 54 

public class accessspecifier1 {
	public static void add()
	 {
		 System.out.println("this is addition method");
	 }
	 
	 private static void sub()
	 {
		 System.out.println("this is subtrction method");
	 }
	 
	protected static void mul()
	 {
		System.out.println("this is multiplication method");
	 }
	 
	 static void div()
	 {
		 System.out.println("this is division method");
	 }
	
	
	public static void main(String[] args)
	{
	      add();
	      sub();
	      mul();
	      div();
	}

}
