package tradepackage;
public class Wallet {
	private double money=0;
	// using the access modifier private, data members are encapsulated (accessible in class scope only)
	public double getMoney() {
		return money;
	}	// methods are public (accessible everywhere), setter-getter	
	public void setMoney(double money) { //void method has no return type.
		this.money=money;
	}
	
	public void addMoney(double money) {
        this.money += money;
    } 
    public void minusMoney(double money) {
        this.money-=money;
    } 
    public double writetheMoney() {
    return money;
    
    } 
	public String toString(){  
		  return  "Price: "+getMoney();  
	 } 
    
}
