package package1;

//this is the program with abstract class with abstract methods and concrete methods..... 

abstract class imp  //abstract class
{
	 abstract void name(); // abstarct methods present
     abstract void data(); // abstract method  present
     void show()           // concrete method
     {
    	 System.out.println("show the data");
     }
     
     void dont()           // concrete method
     {
    	 System.out.println("do not show the data");
     }
}
public class AbstractPlusConcreteMethods extends imp
{
    public static void main(String[] args)
    {
    	AbstractPlusConcreteMethods a1= new AbstractPlusConcreteMethods();
    	a1.name();
    	a1.data();
    	a1.show();
    	a1.dont();
    }
    
    void name()     // method overridding
{
	System.out.println("my name is samiksha");
}

    void data()    //method overridding
{
	System.out.println("Here is my all data");
}
}
