package package2;
public class Artist extends Person{// the keyword "extends" is used for "INHERITANCE" ("IS-A relationship")
	private String periods; // extra data member
	// using the access modifier private, data members are encapsulated (accessible in class scope only)
	public Artist(int idNumber, String name,int bornYear, int diedYear, String nationality,String periods) {
		super( idNumber,  name, bornYear,  diedYear,  nationality); // call the parameterized constructor of the superclass
	    setPeriods(periods);// set method for extra data member
	}
	public String getPeriods() { // extra data member
		return periods;
	}
	public void setPeriods(String periods) {// set methods modify the data 
		this.periods = periods;
	}	
	public String toString(){  
		  return "Artist: \n  "+ "	Name: "+ super.getName()+"\n	Born: "+super.getBornYear()+"\n	Died:  " + super.getDiedYear()+ "\n	Nationality: "+ super.getNationality()+"\n	Periods: "+ getPeriods();  
	 } 
}