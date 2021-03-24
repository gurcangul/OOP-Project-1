package artworkpackage;
import filepackage.IComparable;
/* Abstract classes cannot be used to instantiate objects; because abstract classes are incomplete.
   Concrete classes can be used to instantiate objects; because concrete classes are complete.
   A subclass of an abstract superclass should complete the missing parts in order to become a concrete class, otherwise the subclass would be abstract too.
*/
//abstract superclass Artwork and it implement two interfaces 
public abstract class Artwork implements IComparable, ITradable{
	private int idNumber;// extra data member
	private String name;// extra data member
	private String style;// extra data member
	private String material;// extra data member
	private String artist;// extra data member
	private String architect;// extra data member
	// using the access modifier private, data members are encapsulated (accessible in class scope only)
	public Artwork(int idNumber, String name, String style, String material,String artist,String architect) {// parameterized constructor
		setIdNumber(idNumber);// set method for extra data member
		setName(name);// set method for extra data member
		setStyle(style);// set method for extra data member
		setMaterial(material);// set method for extra data member
		setArtist(artist);// set method for extra data member
		setArchitect(architect);// set method for extra data member
	}
	public int getIdNumber() {// get methods return the data
		return idNumber;
	}
	public void setIdNumber(int idNumber) {// set methods modify the data 
		this.idNumber = idNumber;
	}
	public String getName() {// get methods return the data
		return name;
	}
	public void setName(String name) {// set methods modify the data 
		this.name = name;
	}
	public String getStyle() {// get methods return the data
		return style;
	}
	public void setStyle(String style) {// set methods modify the data 
		this.style = style;
	}
	public abstract double calculateCost(); //abstract method
	public int compareTo(Object object,Object object1) throws Exception{
		if(object instanceof String) {
			String objectString = (String) object;
			String object2String = (String) object1;
			for (int i = 0; i < object2String.length() &&  i < objectString.length(); i++) { 
	        if ((int)object2String.charAt(i) ==  
	            (int)objectString.charAt(i)) { 
	            continue; }  
	        else { 
	            if((object2String.charAt(i)-objectString.charAt(i))>0)
	            	return -1;
	            else
	            	return 1;}} 
	    if (object2String.length() < objectString.length()) { 
	        return -1;}  
	    else if (object2String.length() > objectString.length()) { 
	        return 1;} 
	    else { 
	        return 0;} }
		else {
			throw new Exception("They have not same type.");}}
	@Override
	public String toString(){  
		  return name +" " + style+" ";  
	 } 
	public String getArtist() {// get methods return the data
		return artist;
	}
	public void setArtist(String artist) {// set methods modify the data 
		this.artist = artist;
	}
	public String getMaterial() {// get methods return the data
		return material;
	}
	public void setMaterial(String material) {// set methods modify the data 
		this.material = material;
	}
	public String getArchitect() {// get methods return the data
		return architect;
	}
	public void setArchitect(String architect) {// set methods modify the data 
		this.architect = architect;
	}
}