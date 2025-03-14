package package1;

//RHIS IS MY ASSIGNMENT NO 75

public class AverageArray 
{
	public static void main(String[] args)
	{
		int ageM[]=new int[5];
		ageM[0]=20;
		ageM[1]=10;
		ageM[2]=10;
		ageM[3]=20;
		ageM[4]=30;
		int sum=0;
		double average=0;
		
		for(int i=0;i<=4;i++)
		{
			sum=sum+ ageM[i];
		}
		System.out.println(sum);
		average=sum/ageM.length;
		System.out.println(average);
		
			
}
}