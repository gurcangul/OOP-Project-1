package artworkpackage;
public class Architecture extends Artwork {// the keyword "extends" is used for "INHERITANCE" ("IS-A relationship")
	private double dimension1;// extra data member
	private double dimension2;// extra data member
	private double dimension3;// extra data member
	private String architect;// extra data member
	// using the access modifier private, data members are encapsulated (accessible in class scope only)
    //A subclass inherits all the members from its superclass.
	
	public Architecture(int idNumber, String name, String style, double dimension1, double dimension2, double dimension3, String architect) { // parameterized constructor
		super(idNumber, name, style, null,null,architect);// the parameterized constructor of the superclass is called here
		setDimension1(dimension1);// set method for extra data member
		setDimension2(dimension2);// set method for extra data member
		setDimension3(dimension3);// set method for extra data member
		setArchitect(architect);// set method for extra data member
	}
	public String toString(){  
		  return "Architecture: \n  "+ "	Name: "+ super.getName()+"\n 	Artist: "+getArchitect()+"\n	Style:  " + super.getStyle()+ "\n	Dimensions: "+ dimension1+"cm x "+dimension2+"cm x "+dimension3+"cm ";  
	 }
	// methods are public (accessible everywhere), setter-getter	
	public double getDimension1() {// get methods return the data
		return dimension1;
	}
	public void setDimension1(double dimension1) {// set methods modify the data 
		this.dimension1 = dimension1;
	}
	public double getDimension2() {// get methods return the data
		return dimension2;
	}
	public void setDimension2(double dimension2) {// set methods modify the data 
		this.dimension2 = dimension2;
	}
	public double getDimension3() {// get methods return the data
		return dimension3;
	}
	public void setDimension3(double dimension3) {// set methods modify the data 
		this.dimension3 = dimension3;
	}
	public String getArchitect() {// get methods return the data
		return architect;
	}
	public void setArchitect(String architect) {// set methods modify the data 
		this.architect = architect;
	}
	@Override
	public double calculateCost() {// @Override ANNOTATION indicates that the following method overrides a superclass method.
		double a= dimension1*dimension2*dimension3;
		if(super.getStyle().equals("Gothic"))  // super keyword used because getStyle() defined in parent class(superclass)
		a*=1;
		else if(super.getStyle().equals("Baroque"))
			a*=0.8;
		else
			a*=0.6;
		return a;		
	}		
	@Override// @Override ANNOTATION indicates that the following method overrides a superclass method.
	public boolean isTradable() {
		boolean isTradable=true;
		if(getStyle().equals("Renaissance")) {
			 isTradable =false;
		}
		return isTradable;
	}
	@Override// @Override ANNOTATION indicates that the following method overrides a superclass method.
	public double tradeToBuyer() {
		if(isTradable()) {
			return calculateCost();	
		}
		else return 0;
	} 
}