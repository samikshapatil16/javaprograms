package package1;
//THIS IS ASSIGNMENT NO 85

import java.util.Date;

public class datefuture 
{
public static void main(String[] args)
{
	Date d1=new Date();
	System.out.println(d1);  //CURRENT TIME
	Date d2=new Date(d1.getTime()+1000*60*60*24*1);
	System.out.println(d2);  //FUTURE TIME
	Date d3=new Date(d1.getTime()-1000*60*60*24*1);
	System.out.println(d3);  //PAST TIME
	
	
	String s1=d1.toString();
	//dd-mmm-yyyy
	//dd/mm/yyyy
	
	String Month=s1.substring(4,7);
	System.out.println(Month);
	
	String date=s1.substring(8,10);
	System.out.println(date);
	
	String year=s1.substring(s1.length()-4);
	System.out.println(year);
	
	String s2=date.concat("-").concat(Month).concat("-").concat(year);
	System.out.println(s2);
	
	String s3=date.concat("/").concat(Month).concat("/").concat(year);
	System.out.println(s3);
	
	
	
	
}
}
