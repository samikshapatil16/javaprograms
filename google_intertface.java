package package1;
// this is interface program with abstract methods

interface amazon21
{
	void show(); //abstract methods
	void hide(); //abstract methods
	
}

public class google_intertface implements amazon21
{
public static void main(String[] args)
{ 
	google_intertface g1=new google_intertface();
	g1.show();
	g1.hide();
	
}


public void show() 
{
	System.out.println("show the data");
}

public void hide() 
{
	
	System.out.println("hide the data");
}
}
