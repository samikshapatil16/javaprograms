package package1;
 // this is an interface multilevel program

interface ad
{
	void add();
	void sub();
	
}
interface mu extends ad
{
	void mul();
	void div();
}

interface C extends mu
{
	void ascending();
	void descending();
}

public class MultilevelPlusInterface implements C
{
public static void main(String[] args)
{
	MultilevelPlusInterface m1=new MultilevelPlusInterface();
	m1.add();
	m1.sub();
	m1.mul();
	m1.div();
	m1.ascending();
	m1.descending();
}


public void mul() 
{
	System.out.println("please do multiplication");
	
}
public void div() 
{
	System.out.println("please do division");
	
}
public void add() 
{
	System.out.println("please do addition");
}
public void sub() {
	
	System.out.println("please do subtraction");
}
public void ascending() 
{
	System.out.println("please do ascending order");
	
}
public void descending() 
{
	System.out.println("please do descending order ");
}
}
