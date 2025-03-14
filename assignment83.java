package package1;

//THIS IS MY ASSIGNMENT NO 84

import java.util.Arrays;

public class assignment83 
{
public static void main(String[] args)
{
	int count_of_alpha=0;
	int count_of_numbers=0;
	int count_of_spaces=0;
	
	String s1="samiksha  123#";
	char c1[]=s1.toCharArray();
	System.out.println(Arrays.toString(c1));
	
	for(int i=0;i<=c1.length-1;i++)
	{
		boolean b1=Character.isAlphabetic(c1[i]);
		boolean b2=Character.isDigit(c1[i]);
		boolean b3=Character.isWhitespace(c1[i]);
		if(b1==true)
		{
			count_of_alpha++;
		}
		if(b2==true)
		{
			count_of_numbers++;
		}
		if(b3==true)
		{
			count_of_spaces++;
		}
	}	
		int count_of_specialchar=s1.length()-(count_of_alpha+count_of_numbers+count_of_spaces);
		System.out.println(count_of_specialchar);
		System.out.println(count_of_alpha);
		System.out.println(count_of_numbers);
		System.out.println(count_of_spaces);
		
		
	}
}

