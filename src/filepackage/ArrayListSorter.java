package filepackage;

import java.util.ArrayList;

import artworkpackage.Architecture;
import artworkpackage.Artwork;
import artworkpackage.Painting;
import artworkpackage.Sculpture;
import mainpackage.Vault;
import package2.Architect;
import package2.Artist;
import package2.Person;

public class ArrayListSorter<E> {
	
	
	public void printList(ArrayList<E> list) {
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	  public void selectionSort( ArrayList<E> list, int id )
	  {
	    if(list.get(1) instanceof Person) {
	    	if(id == 1) {//name e g�re
		    for ( int j=0; j < list.size()-1; j++ )
		    {
		      int min = j;
		      for ( int k=j+1; k < list.size(); k++ )
		        if ( ((Person) list.get(k)).getName().compareTo( ((Person) list.get(min)).getName() ) < 0 ) min = k; { 

		        	Person temp = (Person) list.get(j);
		      		list.set(j, list.get(min));
		      		list.set(min,(E) temp);
		      		
		        }
		    }
	    	
	    	}
	    	
	    	else if(id == 2) {//birthdate e g�re
	    		for ( int j=0; j < list.size()-1; j++ )
			    {
			      int min = j;
			      for ( int k=j+1; k < list.size(); k++ )
			    	  if(((Person) list.get(k)).getBornYear()<((Person) list.get(min)).getBornYear())  	min = k; {
			    		  
			    	 
			       
			        	Person temp = (Person) list.get(j);
			      		list.set(j, list.get(min));
			      		list.set(min,(E) temp);
			      		
			        }
			    }
	    		
	    		
	    	}
	    	else if(id == 3) {//nationality ye g�re
	    		for ( int j=0; j < list.size()-1; j++ )
			    {
			      int min = j;
			      for ( int k=j+1; k < list.size(); k++ )
			        if ( ((Person) list.get(k)).getNationality().compareTo( ((Person) list.get(min)).getNationality() ) < 0 ) min = k; { 

			        	Person temp = (Person) list.get(j);
			      		list.set(j, list.get(min));
			      		list.set(min,(E) temp);
			      		
			        }
			    }
	    		
	    		
	    	}
	    	else {
	    		System.out.println("Entered wrong value");
	    	}
	    }
	    
	    else if(list.get(1) instanceof Artwork) {
	    	if(id==1)//name e g�re
	    	{
	    	for ( int j=0; j < list.size()-1; j++ )
	    	    {
	    		// Find min: the index of the string reference that should go into cell j.
	   	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
 		      int min = j;
 		      for ( int k=j+1; k < list.size(); k++ )
	    	     if ( ((Artwork) list.get(k)).getName().compareTo( ((Artwork) list.get(min)).getName() ) < 0 ) min = k; { 

	 	      // Swap the reference at j with the reference at min 
	    	    	 Artwork temp = (Artwork) list.get(j);
	    		     list.set(j, list.get(min));
	    		     list.set(min,(E) temp);
	    		      		
	    		  }
	    		}
	    		
	    	}
	    	else if(id==2)//style a g�re
	    	{
	    	for ( int j=0; j < list.size()-1; j++ )
	    	    {
	    		// Find min: the index of the string reference that should go into cell j.
	   	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
 		      int min = j;
 		      for ( int k=j+1; k < list.size(); k++ )
	    	     if ( ((Artwork) list.get(k)).getStyle().compareTo( ((Artwork) list.get(min)).getStyle() ) < 0 ) min = k; { 

	 	      // Swap the reference at j with the reference at min 
	    	    	 Artwork temp = (Artwork) list.get(j);
	    		     list.set(j, list.get(min));
	    		     list.set(min,(E) temp);
	    		      		
	    		  }
	    		}
	    		
	    	}
	    	else if(id==3)//material a g�re
	    	{
	    	for ( int j=0; j < list.size()-1; j++ )
	    	    {
	    		// Find min: the index of the string reference that should go into cell j.
	   	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
 		      int min = j;
 		      for ( int k=j+1; k < list.size(); k++ )
	    	     if ( ((Artwork) list.get(k)).getMaterial().compareTo( ((Artwork) list.get(min)).getMaterial() ) < 0 ) min = k; { 

	 	      // Swap the reference at j with the reference at min 
	    	    	 Artwork temp = (Artwork) list.get(j);
	    		     list.set(j, list.get(min));
	    		     list.set(min,(E) temp);
	    		      		
	    		  }
	    		}
	    		
	    	}
	    	else if(id==4)//artist e g�re
	    	{
	    	for ( int j=0; j < list.size()-1; j++ )
	    	    {
	    		// Find min: the index of the string reference that should go into cell j.
	   	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
 		      int min = j;
 		      for ( int k=j+1; k < list.size(); k++ )
	    	     if ( ((Artwork) list.get(k)).getArtist().compareTo( ((Artwork) list.get(min)).getArtist() ) < 0 ) min = k; { 

	 	      // Swap the reference at j with the reference at min 
	    	    	 Artwork temp = (Artwork) list.get(j);
	    		     list.set(j, list.get(min));
	    		     list.set(min,(E) temp);
	    		      		
	    		  }
	    		}
	    		
	    	}
	    	else if(id==5)//architect e g�re
	    	{
	    	for ( int j=0; j < list.size()-1; j++ )
	    	    {
	    		// Find min: the index of the string reference that should go into cell j.
	   	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
 		      int min = j;
 		      for ( int k=j+1; k < list.size(); k++ )
	    	     if ( ((Artwork) list.get(k)).getArchitect().compareTo( ((Artwork) list.get(min)).getArchitect() ) < 0 ) min = k; { 

	 	      // Swap the reference at j with the reference at min 
	    	    	 Artwork temp = (Artwork) list.get(j);
	    		     list.set(j, list.get(min));
	    		     list.set(min,(E) temp);
	    		      		
	    		  }
	    		}
	    		
	    	}
	    	else {
	    		System.out.println("Entered wrong value");
	    	}
	   
	    // Find the string reference that should go in each cell of
	    // the array, from cell 0 to the end
	   
	  
	  }
	
	 }

}
