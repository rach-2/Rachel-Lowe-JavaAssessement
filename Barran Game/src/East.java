
public class East extends Direction implements Compass
{
	
	public East()
	{
	   
	}
	

	@Override
	public String howFar() 
	{
		return "How Far East would you like to ";
	}

	@Override
	public int getDistence() 
	{
		return this.getMeters();
	}
	
	public void setDistence(int distence)
	{
		this.distance = distence;
	}
   
}
