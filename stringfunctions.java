package package1;
//THIS IS ASSIGNMENT NO 84
public class stringfunctions 
{
public static void main(String[] args)
{
	String s1="MY Name Is Samiksha";
	 String s2= s1.substring(4);
	   System.out.println(s2);
	   
	       String s3= s1.substring(3, 7);   
	       System.out.println(s3);
	   
	        String s4= s1.replace('m', 'w');	  //charchar
	        System.out.println(s4);
	   
	        String s5= s1.replace("my","your" );   //string string
	 	    System.out.println(s5);
	 	    
	 	   String s6= s1.replaceAll("[A-Z]","X" );  //all
		   System.out.println(s6);
		   
		   boolean b1= s1.matches(s6);
		   System.out.println(b1);
		   
		  //string ends with a
		   boolean b2= s1.matches("(.)*.a"); //this represent multicharacters
		   System.out.println(b2);
		   
		  String s8= s1.repeat(2 );
		   System.out.println(s8);
	 	   
}
}
