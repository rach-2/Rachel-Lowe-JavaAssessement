
public class North extends Direction implements Compass
{

    //this will be asking the user how far they want they 
    
	//in the feature would intalise variables in each direction class
	public North()
	{
	  
	}
	@Override
	public String howFar() 
	{
		return "How Far North would you like to go";
	}

	

	@Override
	public int getDistence() 
	{
		//returning the method of an the inherited abstract class
		return  this.getMeters();
	}
	
	public void setDistence(int distence)
	{
		this.distance = distence;
	}
   
   
   
   
}
