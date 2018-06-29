  import java.util.Scanner;
public class Runner 
{

	public static void main(String[] args) 
	{   
		System.out.println("Welcome to barran");
		System.out.println("you should  chose the right directions");
		
		Game  Game = new Game();
	    System.out.println("Which Direction Would You Like");
	    
		Scanner input = new Scanner(System.in);
	    
		String firstDirection  = input.next();
		
		/*this for loop for ask the user which direction they want to take 6 times and then adding to the 
	    array list in game
	    */
		int distance = 0;
		for(int i  = 0; i<6; i++)
		{
			System.out.println("Next Direction");
			String userDirection = input.next();
			if (userDirection.equals("North"))
			{	
				North north = new North();
			    Game.addDirection(north);
			    System.out.println(north.howFar());
			     distance =  distance +  input.nextInt();
			}
			else if(userDirection.equals("South"))
			{
				South south=  new South();
				System.out.println(south.howFar());
		    }
			else if(userDirection.equals("West"))
			{
				West west =  new West();
				Game.addDirection(west);
			}
		
			
			
			else if (userDirection.equals("East"))
			{
			     East east = new East();
			     Game.addDirection(east);
			}
		
		}
		//the interface was the the 
		System.out.println(Game.printDirctions());
		
		
}
}
