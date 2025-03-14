package package1;

// single inheritence program

class animal// parent class
{    
     void wild()
     {
	System.out.println("lion is a wild animal");
	 }
}

 class pet extends animal // child class inherits parent class 
 
{    void petani()
	 {
	 System.out.println("dog is a pet animal");
	 }     

 
 public static void main(String[] args)
 {
	 pet m1=new pet();
	 m1.petani();
	 m1.wild();
	 
	 
 }
}


