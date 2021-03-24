package tradepackage;
import java.util.Random;
import mainpackage.Vault;
public class Trade {
	Seller seller=new Seller();
	Buyer buyer1 =new Buyer();
	Buyer buyer2 =new Buyer();
	Buyer buyer3 =new Buyer();
	Buyer buyer4 =new Buyer();
	Buyer buyer5 =new Buyer();
	public void Trading(Vault  theVault) { 
		Random r=new Random();
		int a=r.nextInt(5);//
		int b=r.nextInt(5);
		int c=r.nextInt(5);

		buyer1.getWallet().addMoney(5000000);
		buyer2.getWallet().addMoney(5000000);
		buyer3.getWallet().addMoney(5000000);
		buyer4.getWallet().addMoney(5000000);
		seller.getWallet().addMoney(0);
		getMoney();
		System.out.println("Trade started: \n");
		
		if(theVault.paintingList.get(a).isTradable()) {
		buyer1.getPrivateCollection().addAttribute(theVault.paintingList.get(a));// add into collection
		buyer1.getWallet().minusMoney(theVault.paintingList.get(a).tradeToBuyer());//minus Money from buyer
		System.out.println("Buyer 1 bought: \n \n"+buyer1.getPrivateCollection().getTrade());
		seller.getWallet().addMoney(theVault.paintingList.get(a).tradeToBuyer()); //add Money from buyer
		System.out.println("");

		}
		if(theVault.architectureList.get(b).isTradable()) {
		buyer2.getPrivateCollection().addAttribute(theVault.architectureList.get(b));
		buyer2.getWallet().minusMoney(theVault.architectureList.get(b).tradeToBuyer());		
		System.out.println("Buyer 2 bought: \n\n"+buyer2.getPrivateCollection().getTrade());
		seller.getWallet().addMoney(theVault.architectureList.get(b).tradeToBuyer());		
		System.out.println("");
		}
		if(theVault.paintingList.get(b).isTradable()) {
		buyer3.getPrivateCollection().addAttribute(theVault.paintingList.get(b));
		buyer3.getWallet().minusMoney(theVault.paintingList.get(b).tradeToBuyer());		
		System.out.println("Buyer 3 bought: \n\n"+buyer3.getPrivateCollection().getTrade());
		seller.getWallet().addMoney(theVault.paintingList.get(b).tradeToBuyer());		
		System.out.println("");
		}
		if(theVault.sculptureList.get(a).isTradable()) {
		buyer4.getPrivateCollection().addAttribute(theVault.sculptureList.get(a));
		buyer4.getWallet().minusMoney(theVault.sculptureList.get(a).tradeToBuyer());		
		System.out.println("Buyer 4 bought: \n\n"+buyer4.getPrivateCollection().getTrade());		
		seller.getWallet().addMoney(theVault.sculptureList.get(a).tradeToBuyer());		
		System.out.println("");
		}
		getMoney(); 	
		System.out.println("");

	}
	public void getMoney() { // print the seller and buyers' money
		System.out.println("Seller's money: "+seller.getWallet().getMoney() +"TL");
		System.out.println("Buyer 1's money: "+buyer1.getWallet().getMoney() +"TL");
		System.out.println("Buyer 2's money: "+buyer2.getWallet().getMoney() +"TL");
		System.out.println("Buyer 3's money: "+buyer3.getWallet().getMoney() +"TL");
		System.out.println("Buyer 4's money: "+buyer4.getWallet().getMoney() +"TL");
	}
}
