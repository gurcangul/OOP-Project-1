package artworkpackage;
public class Painting extends Artwork {// the keyword "extends" is used for "INHERITANCE" ("IS-A relationship")
	// using the access modifier private, data members are encapsulated (accessible in class scope only)
	private int dimension1;// extra data member
	private int dimension2; // extra data member
	private String artist; // // extra data member
    //A subclass inherits all the members from its superclass.

	public String toString(){  
		  return "Painting: \n  "+ "	Name: "+ super.getName()+"\n	Artist: "+getArtist()+"\n	Style:  " + getStyle()+ "\n	Dimensions: "+ dimension1+"cm x "+dimension2+"cm ";  
	 }
	public Painting(int idNumber, String name, String style,int dimension1,int dimension2,String artist) { // parameterized constructor
		super(idNumber, name, style, null,artist,null);// the parameterized constructor of the superclass is called here
		setDimension1(dimension1); // extra set method
		setDimension2(dimension2);// set method for extra data member
		setArtist(artist);
	}
	// methods are public (accessible everywhere), setter-getter	
	public int getDimension1() {// get methods return the data 
		return dimension1;
	}
	public void setDimension1(int dimension1) {// set methods modify the data 
		this.dimension1 = dimension1;
	}
	public int getDimension2() {// get methods return the data
		return dimension2;
	}
	public void setDimension2(int dimension2) {// set methods modify the data 
		this.dimension2 = dimension2;
	}
	public String getArtist() {// get methods return the data
		return artist;
	}
	public void setArtist(String artist) {// set methods modify the data 
		this.artist = artist;
	}
	@Override// @Override ANNOTATION indicates that the following method overrides a superclass method.
	public double calculateCost() { // the method is overridden here
		double a= dimension1*dimension2;
		if(super.getStyle().equals("Renaissance")) // super keyword used because getStyle() defined in parent class(superclass) but we might not use
		a*=7;
		else if(super.getStyle().equals("Baroque"))
			a*=5.5;
		else
			a*=4.5;
		return a;		
	}
	@Override // @Override ANNOTATION indicates that the following method overrides a superclass method.
	public boolean isTradable() { // the method is overridden here but we might not use. (Interface methods)
		boolean isTradable=true;
		if(getStyle().equals("Gothic")) {
			 isTradable =false;
		}
		return isTradable;
	}
	@Override // @Override ANNOTATION indicates that the following method overrides a Interface methods.
	public double tradeToBuyer() {
		if(isTradable()) {
			return calculateCost();	
		}
		else return 0;
	}  
}