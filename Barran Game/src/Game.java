import java.util.ArrayList;
import java.util.Scanner;
public class Game 
{
      private ArrayList<Direction> directionList = new ArrayList<Direction>();
      
      public boolean addDirection(Direction d)
      {
    	  return directionList.add(d);
      }
      
      public boolean removeDirection(Direction d)
      {
    	  return  directionList.remove(d);
      }
      
       //the reason is this method is void is becasue the method that i want to call it is void
      public void   clearDirections()
      {
    	   directionList.clear();
      }
      
      public String printDirctions() 
      {
    	  //here and and asiigninh a string a intail value and then adding it each time 
    	   String directionsFollowed ="The Directions you have took ";
    	  for(Direction d: directionList)
    	  {
    		  if (d.getClass().getName() == "North")
    		  {
    			  directionsFollowed = directionsFollowed + " North " ;
    		  }
    		  else  if(d.getClass().getName() == "East")
    		  {
    			  directionsFollowed =  directionsFollowed +  " East ";
    			    
    		  }
    		  else if(d.getClass().getName() == "South")
    		  {
    			  directionsFollowed = directionsFollowed  + " South ";
    		  }
    		  
    		  else if(d.getClass().getName() == "West")
    		  {
    			  directionsFollowed  = directionsFollowed  + " West ";
    		  }
    	  }
    	  
    	  return directionsFollowed;
      }
}
