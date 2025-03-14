package package1;

 class A// parent class
{    
     void parent()
     {
	System.out.println("this is parent class");
	 }
}

 class B extends A // child class inherits parent class 
 
{    void child()
	 {
	 System.out.println("this is child class");
	 }     

 
 public static void main(String[] args)
 {
	 B m1=new B();
	 m1.parent();
	 m1.child();
	 System.out.println("here is my inheotence concept");
	 
 }
}
