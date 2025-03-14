package package1;

//THIS IS MY ASSIGNMENT NO 70

public class reversestring 
{
public static void main(String[] args)
{
	String name="dhairyasheel";
	String reverse="";
	
			for(int i=name.length()-1;i>=0;i--)
			{
				char c1= name.charAt(i);
				reverse=reverse+c1;
				
			}
			System.out.print(reverse);
}
}