package package1;

//this keyword prorgam

public class thiskeyword 

{
    String name;
    String surname;
    int rollnumber;
    int marks;
    boolean ans;
    
    void student_details(String name,String surname,int rollnumber,int marks,boolean ans)
    {
    	this.name=name;             // this keyword used
    	this.surname=surname;       //this keyword used
    	this.rollnumber=rollnumber; //this keyword used
    	this.marks=marks;           //this keyword used
    	this.ans=ans;               //this keyword used
    	System.out.println("student name is samiksha");
    	System.out.println("student surname is patil");
    	System.out.println("student rollnumber is 7");
    	System.out.println("student marks are 18");
    	System.out.println("true");
    }
    
    public static void main(String[] args)
    {
    	thiskeyword t1=new thiskeyword();
    	t1.student_details("samiksha","patil",7,18,true);
    	System.out.println(t1.name);
    	System.out.println(t1.surname);
    	System.out.println(t1.rollnumber);
    	System.out.println(t1.marks);
    	System.out.println(t1.ans);
    }
    

}
