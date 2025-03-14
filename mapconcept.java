package package1;
//THIS IS ASSIGNMENT NO 99
import java.util.HashMap;
import java.util.Map;

public class mapconcept 
{
public static void main(String[] args)
{
	Map<Integer,String> m1=new HashMap<Integer,String>();
	m1.put(2345, "samiksha");
	m1.put(2346, "siddhant");
	m1.put(2347, "kiran");
	m1.put(2348, "shubhangi");
	m1.put(2349, "bharati");
	 System.out.println(m1);
	 
	 Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(2445, "rajesh");
		m2.put(2446, "anand");
		m2.put(2447, "rehman");
		m2.put(2448, "santosh");
		m2.put(2449, "rashmi");
		m2.putAll(m1);   //adding the map1 into 2
		System.out.println(m2);
		m2.remove(2445);    //removing  one key
		m2.remove(2349, "bharati");
			System.out.println(m2);
		m2.replace(2446, "roshan");
		m2.replace(2448, "santosh", "momo");
		System.out.println(m2);
		m2.clear();
		System.out.println(m2);
		boolean b1= m2.isEmpty();
		System.out.println(b1);
		
}}
