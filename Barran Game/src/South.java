
public class South  extends Direction implements Compass
{
	public South()
	{
	
	}
	@Override
	public int getDistence() 
	{
		 return this.getMeters();
	}

	@Override
	public String howFar() 
	{
		 return "How Far south would you like";
	}
	
	public void setDistence(int distence)
	{
		this.distance = distence;
	}
   
}
