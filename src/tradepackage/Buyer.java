package tradepackage;
import java.util.ArrayList;
import artworkpackage.ITradable;
public class Buyer {
	private Wallet wallet = new Wallet(); // HAS-A relationship : "A Buyer  has a Wallet"
	private ArrayList<ITradable> a1 = new ArrayList<ITradable>();
	private PrivateCollection privateCollection=new PrivateCollection();// HAS-A relationship : "A Buyer  has a PrivateCollection"
	public Wallet getWallet() {// get methods return the data
		return wallet;
	}
	public void setWallet(Wallet wallet) {// set methods modify the data 
		this.wallet = wallet;
	}
	public PrivateCollection getPrivateCollection() {
		return privateCollection;
	}
	public void setPrivateCollection(PrivateCollection privateCollection) {
		this.privateCollection = privateCollection;
	}
	public ArrayList<ITradable> getA1() {// get methods return the data
		return a1;
	}
	public void setA1(ArrayList<ITradable> a1) {// set methods modify the data
		this.a1 = a1;
	}
	public String toString(){  
		  return  ""+getPrivateCollection();  
	 } 

}
