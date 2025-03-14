package package1;

//THIA IS PART OF MY ASSIGNMENT NO 84

public class matches 
{
	public static void main(String[] args)
	{
		String sam="samiksha";
		boolean b1=sam.matches("........");
		System.out.println(b1);
		
		//String ending with a
		boolean b2=sam.matches("(.)*a");//(.)* represent the multicharacter
		System.out.println(b2);
		
		//String starting with s
		boolean b3=sam.matches("s(.)*");
		System.out.println(b3);
		
		// check this string has man in it or not 
		
		String name2="salman";
		boolean b4=name2.matches("(.)*man(.)*");
		System.out.println(b4);
		
		  String rep=name2.repeat(2); //REPEAT 
		  System.out.println(rep);
		  
		
		
	}
	

}
