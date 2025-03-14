package package1;

import java.util.Arrays;

//THIS IS MY ASSIGNMENT NO 82

public class anagramarray 
{
public static void main(String[] args)
{
	String name1="sam";
	String name2="act";		
	
	if(name1.length()!=name2.length())
	{
		System.out.println("they are not anagram");
	}
	else
	{
		System.out.println("let's find out if they are anagram");
		char c1[]=name1.toCharArray();
		char c2[]=name2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean b1= Arrays.equals(c1,c2);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("they are anagram");
		}
		else
		{
			System.out.println(" they are not anagram");
		}
		
	}
       
}
}

