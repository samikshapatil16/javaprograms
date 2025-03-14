package package1;

class grandparent
{
	static void age()
	{
		System.out.println("the age of a grandparent is 89");
	}
}

 class parent extends grandparent
 {
	 static void name()
	 {
		 System.out.println("the name of the parent is swati");
		 
	 }
 }
 class Multilevel extends parent
{ 
	   static void show()
	   {
       System.out.println("this is the program of multilevel inheritence");
       }
	 
  public static void main(String[] args)
  {
	  show();
	  name();
	  age();
  }
} 
	   
