package package1;

//THIS IS MY ASSIGNMENT NO 77

import java.util.Arrays;
import java.util.Scanner;

public class equalarray 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter size of your array1");
	int ageM[]=new int[s1.nextInt()];
	Scanner s2=new Scanner(System.in);
	System.out.println("please enter size of your array2");
    int ageF[]=new int[s2.nextInt()];
	
	for(int i=0,j=0;i<ageM.length && j<ageF.length;i++,j++)	
	{
		System.out.println("please enter value for first array at index i");
		ageM[i]=s1.nextInt();
		System.out.println("pleae enter value for second array at index j");
		ageF[j]=s2.nextInt();
	
    }
	
    boolean b1=Arrays.equals(ageM, ageF);
    
    if(b1==true)
    {
    	System.out.println("given arrays are equal");
    	
    }
    else
    {
    	System.out.println("given arrays arrays are not equal");
    }
    
}
}
