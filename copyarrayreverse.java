package package1;

import java.util.Arrays;

//THIS IS MY ASSIGNMENT NO 79

public class copyarrayreverse 
{
public static void main(String[] args)
{
	int array1[]=new int[3];
	array1[0]=21;
	array1[1]=22;
	array1[2]=23;
	
	int reverse[]=new int[array1.length];
	for(int i=0,j=2;i<array1.length;i++,j--)
	{
		reverse[j]=array1[i];
	}

	System.out.println("input array-> "+Arrays.toString(array1));
	System.out.println("reverse array-> " +Arrays.toString(reverse));

}
}
