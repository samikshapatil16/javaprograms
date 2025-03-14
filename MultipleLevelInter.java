package package1;  // this is a multiple level prorgam 
interface parent1
{
	void udaipur();
	void jaipur();
}
interface parent2
 {
	 void delhi();
	 void nainital();
 }

public class MultipleLevelInter implements parent1,parent2
{
	public static void main(String[] args)
	{
		MultipleLevelInter y1=new MultipleLevelInter();
		y1.delhi();
		y1.jaipur();
		y1.nainital();
		y1.udaipur();
	}

	public void delhi()
	{
		System.out.println("delhi is capital of india");
	}

	public void nainital() 
	{
		System.out.println("jim corbet situated in nainital");
	}

	public void udaipur() 
	{
		System.out.println("udaipur has beautiful lakes");
	}

	public void jaipur() 
	{
		System.out.println("jaipur is a pink city");
	}

}
