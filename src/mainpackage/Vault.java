package mainpackage;
import java.util.ArrayList;
import artworkpackage.Architecture;
import artworkpackage.Painting;
import artworkpackage.Sculpture;
import filepackage.CSVReader;
import package2.Architect;
import package2.Artist;
public class Vault implements ISearchable {
	  ArrayList<String> alist = CSVReader.readFromCSVFile();
      //person
      ArrayList<Architect> architectList= new ArrayList<Architect>();
      ArrayList<Artist> artistList= new ArrayList<Artist>();
      //artwork
      public ArrayList<Architecture> architectureList= new ArrayList<Architecture>();
       public ArrayList<Sculpture> sculptureList= new ArrayList<Sculpture>();
       public ArrayList<Painting> paintingList= new ArrayList<Painting>();
      public ArrayList<String> dataTranfer() {
    	  for(int i= 0; i< alist.size();i++) {
    		  String[] array = alist.get(i).split(","); 
    		  int idNo = Integer.valueOf(array[0]);
    	      	if(idNo==5) { // Architect
    	      		idNo = Integer.valueOf(array[0]); // ID
    	     	 	String name = array[1]; // Name
    	     	 	int bornYear = Integer.valueOf(array[2]); // Born
    	     	 	int diedYear = Integer.valueOf(array[3]); // Died
    	     	 	String nationality = array[4]; // Nationality

    	     	 	Architect architect=new Architect( idNo, name, bornYear,  diedYear,  nationality); //constructor type: int plateNo, String name, Region region, double altitude         
    	     	 	architectList.add(architect);
    	      	}	             
    	      	if(idNo==4) { // Artist
    	      		idNo = Integer.valueOf(array[0]); // ID
    	     	 	String name = array[1]; // Name
    	     	 	int bornYear = Integer.valueOf(array[2]); // Born
    	     	 	int diedYear = Integer.valueOf(array[3]); // Died
    	     	 	String nationality = array[4]; // Nationality
    	     	 	String periods = array[5]; // Periods

    	     	 	Artist artist=new Artist( idNo, name, bornYear,  diedYear,  nationality,periods); //constructor type: int plateNo, String name, Region region, double altitude         
    	     	 	artistList.add(artist);
    	      	}
    	      	
    	      	
    	      	if(idNo==3) { // Architecture
    	      		idNo = Integer.valueOf(array[0]); // ID
    	     	 	String name = array[1]; // Name of the Architecture
    	     	 	String style = array[2]; // Style
    	     	 	double dimension1 = Double.valueOf(array[3]); // Dimension1
    	     	 	double dimension2 = Double.valueOf(array[4]); // Dimension2
    	     	 	double dimension3 = Double.valueOf(array[5]); // Dimension3
    	     	 	String architect = array[6]; // Architect
    	     	 	
    	     	 	Architecture architecture=new Architecture( idNo, name, style,  dimension1,  dimension2,dimension3,architect);//constructor type: int plateNo, String name, Region region, double altitude         
    	     	 	architectureList.add(architecture);
    	      	}
    	      	if(idNo==2) { // Sculpture
    	      		idNo = Integer.valueOf(array[0]); // ID
    	     	 	String name = array[1]; // Name
    	     	 	String style = array[2]; // Style
    	     	 	String artist = array[3]; 
    	     	 	String material = array[4]; // Style
    	     		int weight=Integer.valueOf(array[5]); 
    	     			            	 	
    	     	 	//( int idNumber, String name, String style, int weight, String material, Artist artist
    	     	 	Sculpture sculpture=new Sculpture(idNo, name,  style,weight,material,artist);//constructor type: int plateNo, String name, Region region, double altitude         
    	     	 	sculptureList.add(sculpture);
    	      	}
    	      	if(idNo==1) { // Painting
    	      		idNo = Integer.valueOf(array[0]); // ID
    	     	 	String name = array[1]; // Name
    	     	 	String style = array[2]; // Style
    	     	 	String artist = array[3]; 
    	     	 	int dimension1 = Integer.valueOf(array[4]); // Dimension 1
    	     	 	int dimension2 = Integer.valueOf(array[5]); // Dimension 2

    	     	 	//	public Painting(int idNumber, String name, String style,int dimension1,int dimension2,Artist artist) {
    	     	 	Painting painting=new Painting( idNo,  name,  style, dimension1, dimension2,artist); //constructor type: int plateNo, String name, Region region, double altitude         
    	     	 	paintingList.add(painting);
    	      	}
    	  }
		return alist;
      }

	@Override
	public void searchInArchitect(String keyword) {
		for (Architect item : architectList) {
			 if(keyword.equals(item.getName())) {
				System.out.println(item);								
			}	
			 else if(keyword.equals(item.getBornYear())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getDiedYear())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getNationality())) {
				System.out.println(item);								
			}
		}		
	}
	@Override
	public void searchInArtist(String keyword) {
		for (Artist item : artistList) {
			 if(keyword.equals(item.getName())) {
				System.out.println(item);								
			}	
			 else if(keyword.equals(item.getBornYear())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getDiedYear())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getNationality())) {
				System.out.println(item);								
			}
		}	 
	}
	@Override
	public void searchInArchitecture(String keyword) {
		for (Architecture item : architectureList) {
			if(keyword.equals(item.getName())) {
				System.out.println(item);								
			}	
			 else if(keyword.equals(item.getStyle())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getDimension1())) {
				System.out.println(item);								
			}			 
			 else if(keyword.equals(item.getDimension2())) {
				System.out.println(item);								
			}			 
			 else if(keyword.equals(item.getDimension3())) {
				System.out.println(item);								
			}			 
			 else if(keyword.equals(item.getArchitect())) {
				System.out.println(item);								
			}
		}			
	}
	@Override
	public void searchInSculpture(String keyword) {
		for (Sculpture item : sculptureList) {
			if(keyword.equals(item.getName())) {
				System.out.println(item);								
			}	
			 else if(keyword.equals(item.getStyle())) {
				System.out.println(item);								
			}		 
			 else if(keyword.equals(item.getArtist())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getMaterial())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getWeight())) {
				System.out.println(item);								
			}
		}			
	}
	@Override
	public void searchInPaintingt(String keyword) {
		for (Painting item : paintingList) {
			if(keyword.equals(item.getName())) {
				System.out.println(item);								
			}	
			 else if(keyword.equals(item.getStyle())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getArtist())) {
				System.out.println(item);								
			}
			 else if(keyword.equals(item.getDimension1())) {
				System.out.println(item);								
			}			 
			 else if(keyword.equals(item.getDimension2())) {
				System.out.println(item);								
			}			 
		}			
	}		
}