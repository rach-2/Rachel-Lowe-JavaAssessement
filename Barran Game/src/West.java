
public class West extends Direction  implements Compass
{
	public West()
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
		return "How far wasr  would you like to go";
	}
	
	public void setDistence(int distence)
	{
		this.distance = distence;
	}
   
}
