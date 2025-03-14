package package1;

import java.util.Arrays;

//THIS IS MY ASSIGNMENT NO 78

public class copyarrayruntime 
{
public static void main(String[] args)
{
	int array1[]=new int[4];
	array1[0]=45;
	array1[1]=23;
	array1[2]=34;
	array1[3]=23;
	
	int array2[]=new int [4];
	
	for(int i=0;i<array1.length;i++)
	{
		array2[i]=array1[i];
	}

	System.out.println("input array-> " +Arrays.toString(array1));
	System.out.println("copied array-> " +Arrays.toString(array2));
	
}
}
