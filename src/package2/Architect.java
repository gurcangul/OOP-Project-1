package package2;
public class Architect extends Person {// the keyword "extends" is used for "INHERITANCE" ("IS-A relationship")
	// no extra data member
	public Architect(int idNumber, String name,int bornYear, int diedYear, String nationality) {//parameterized constructor
		super(idNumber,  name, bornYear,  diedYear,  nationality); // call the parameterized constructor of the superclass
		// no extra data member so no extra setter
}
	public String toString(){  
		  return "Architect: \n  "+ "	Name: "+ super.getName()+"\n	Born: "+super.getBornYear()+"\n	Died:  " + super.getDiedYear()+ "\n	Nationality: "+ super.getNationality();  
	 }	
}
