package package2;

/* Abstract classes cannot be used to instantiate objects; because abstract classes are incomplete.
   Concrete classes can be used to instantiate objects; because concrete classes are complete.
   A subclass of an abstract superclass should complete the missing parts in order to become a concrete class, otherwise the subclass would be abstract too.
*/
//abstract superclass Person 
public abstract  class Person {
	private int idNumber;// extra data member
	private String name;// extra data member
	private int bornYear;
	private int diedYear;
	private String nationality;
	// using the access modifier private, data members are encapsulated (accessible in class scope only)

	public Person(int idNumber, String name, int bornYear, int diedYear, String nationality) {// parameterized constructor
		setBornYear(bornYear);setDiedYear(diedYear);// set method for extra data members
		setIdNumber(idNumber);setName(name);setNationality(nationality);/// set method for extra data members
	}	
	// methods are public (accessible everywhere), setter-getter	

	public int getIdNumber() {// get methods return the data
		return idNumber;
	}
	public void setIdNumber(int idNumber) {// set methods modify the data 
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBornYear() {
		return bornYear;
	}
	public void setBornYear(int bornYear) {
		this.bornYear = bornYear;
	}
	public int getDiedYear() {
		return diedYear;
	}
	public void setDiedYear(int diedYear) {
		this.diedYear = diedYear;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String toString(){  
		  return ""+ name +""+ bornYear+""+ diedYear+""+idNumber+""+nationality;  
	 } 
}