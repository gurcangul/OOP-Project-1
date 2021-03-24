package artworkpackage;
public class Sculpture extends Artwork { // the keyword "extends" is used for "INHERITANCE" ("IS-A relationship")
	private int weight;// extra data member
	private String material;// extra data member
	private String artist;	// extra data member
    //A subclass inherits all the members from its superclass.
	@Override
	public String toString(){  
		  return "Sculpture: \n  "+ "	Name: "+ super.getName()+"\n 	Artist: "+artist+"\n	Style:  " + getStyle()+ "\n	Material: "+ material+"\n	Weight: "+weight+"cm ";  
	 }
	public Sculpture(int idNumber, String name, String style, int weight, String material, String artist) { // parameterized constructor
		super(idNumber, name, style, material,artist,null);
		setWeight(weight);// set method for extra data member
		setMaterial(material);// set method for extra data member
		setArtist(artist);// set method for extra data member
	}
	// methods are public (accessible everywhere), setter-getter	
	public int getWeight() {// get methods return the data
		return weight;
	}
	public void setWeight(int weight) {// set methods modify the data 
		this.weight = weight;
	}
	public String getMaterial() {// get methods return the data
		return material;
	}
	public void setMaterial(String material) {// set methods modify the data 
		this.material = material;
	}
	public String getArtist() {// get methods return the data
		return artist;
	}
	public void setArtist(String artist) {// set methods modify the data 
		this.artist = artist;
	}
	@Override// @Override ANNOTATION indicates that the following method overrides a superclass method.
	public double calculateCost() {
		double a=0;
		if(getMaterial().equals("Marble"))
		a=weight*15;
		else if(getMaterial().equals("Bronze"))
			a=weight*180;
		return a;		
	}
	
	@Override // @Override ANNOTATION indicates that the following method overrides a superclass method. 
	public boolean isTradable() {
		boolean isTradable=true;
		if(getMaterial().equals("Baruq")) {
			 isTradable =false;
		}
		return isTradable;
	}
	@Override
	public double tradeToBuyer() { // @Override ANNOTATION indicates that the following method overrides a superclass method.
		if(isTradable()) {
			return calculateCost();	
		}
		else return 0;
	}  	
}