package package1;

//THIS IS ASSIGNMENT NO 68

public class concatandcontains 
{
 public static void main(String[] args)
 {
	 String name="samiksha ";
	 String surname="anand chaudhari";
	 System.out.println(name.concat(surname));
	  
	 String a1="you";
	 String a2="are";
	 String a3="so";
	 String a4="beautiful";
	 
	 System.out.println(a1.concat(" ").concat(a2).concat(" ").concat(a3).concat(" ").concat(a4));
	 
	 String city="nashik is a beautiful city";
	 boolean b1=city.contains("nashik");
	 System.out.println(b1);
 }
}
