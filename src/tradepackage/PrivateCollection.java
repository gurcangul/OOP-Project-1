package tradepackage;
import java.util.ArrayList;
import artworkpackage.Artwork;
import artworkpackage.ITradable;
public class PrivateCollection {
    private ArrayList<ITradable> trade = new ArrayList<ITradable>();
    public ArrayList<ITradable> getTrade() {
        return trade;
    }
    public void setTrade(ArrayList<ITradable> trade) {
        this.trade = trade;
    }      
    public void addAttribute(Artwork a1) {
        this.trade.add(a1);
    }
    public void deleteAttribute(Artwork a1) {
        trade.remove(a1);
    }    

	public String toString(){  
		  return  ""+getTrade();  
	 } 
}