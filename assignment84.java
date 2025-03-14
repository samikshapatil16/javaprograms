package package1;

//THIS IS ASSIGNMENT NO 84 THIA IS ONLY HALF PART (MATCHES AND REPEAT ARE IN THE NEXT PROGRAM)

public class assignment84 
{
public static void main(String[] args)
{
	String name1="samiksha is a good girl";
	String replace=name1.replace('o', 'u');
	System.out.println(replace);
	
	String name2="Samiksha A chaudhari";
	String all= name2.replaceAll("[A-Z]", "s");
	System.out.println(all);
	
	String name3="Samiksha A Chaudhari";
	String all1= name3.replaceAll("[a-z]", ""); //all the small letters are replace with nothing so the output is showing only capital letters
	System.out.println(all1);
	
	String name4="samiksha 16041998 birthdate";
	String num= name4.replaceAll("[0-9]", ""); // all the numbers are replaced with nothing so numbers are gone from output
	System.out.println(num);
	
	String name5="sam co nara";
	String sub=name5.substring(4);
	System.out.println(sub);
	
	String name6="sam co nara";
	String sub2=name6.substring(0, 6);
	System.out.println(sub2);
}
}
