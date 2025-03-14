package package1;

public class callingnonstaticmethod 
{
	   void substraction()	//substraction
	        
	   {
		 
	          int a=200;
	          int b=100;
	          System.out.println(a-b);
	          
	          
	   }       
	          
	   public static void main(String[] args)  //calling non static method into main method
       
	   {
    	callingnonstaticmethod n1=new callingnonstaticmethod() ;
    	n1.substraction();       
       }
}
