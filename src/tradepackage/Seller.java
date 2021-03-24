package tradepackage;
import java.util.ArrayList;
import artworkpackage.Artwork;
import artworkpackage.ITradable;
public class Seller  {
	private Wallet wallet= new Wallet();// HAS-A relationship : "A Seller  has a Wallet"
	private PrivateCollection privateCollection;// HAS-A relationship : "A Seller  has a privateCollection"
	private ArrayList<ITradable> a1 = new ArrayList<ITradable>();
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
	public ArrayList<ITradable> getA1() {
		return a1;
	}
	public void setA1(ArrayList<ITradable> a1) {
		this.a1 = a1;
	}
}
