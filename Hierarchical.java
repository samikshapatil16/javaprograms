package package1;

  class holiday
  {
	  String name= "week day";
	  void myweek()
	  {
		  System.out.println("week days");
	  }
	  
  }

  class secondday extends holiday
  {
	  int a=2;
	  void monday()
	  {
		  System.out.println("monday is the second day of the week");
	  }
  }

 class thirdday extends holiday
 {
	 int b=2;
	 void tuesday()
	 {
		 System.out.println("tuseday is the third day of the week");
	 }

 }
 
 class fourthday extends holiday
 {
	 int b=2;
	 void wednesday()
	 {
		 System.out.println("wednesday is the fourth day of the week");
	 }

 }

class Hierarchical {
	
	public static void main(String[] args)
	{
		secondday w1=new secondday();
		w1.myweek();
		w1.monday();
		
		thirdday w2=new thirdday();
		w2.myweek();
		w2.tuesday();
		
		fourthday w3=new fourthday();
		w3.myweek();
		w3.wednesday();
		
	}

}
