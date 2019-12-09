
public class Savings extends Account{
	double interest=0.05;
	double maximumwithdrawl;
	public Savings(String n, double b) {
		super(n, b, 2000);
		maximumwithdrawl =50000 ;
	}
	public double getBalance(int year){
		return getBalance()+(getBalance()*interest)*year;
	}
	
	public Savings() {
	}
	
	
	public void withdrawl(double ammount){
		if(ammount<=maximumwithdrawl&&((getBalance()-ammount)>=minimumbalance)){
			setBalance(getBalance()-ammount);	
		}
		else
			System.out.println("Not Enough Money");
	}
}
