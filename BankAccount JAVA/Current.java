
public class Current extends Account{
	public int tradeLisence;
	public Current(String n,double b,int trdLisence) {
		super(n, b,5000);
		this.tradeLisence=trdLisence;
	}
	
	public Current() {
	}
	
	@Override
	void withdrawl(double ammount) {
		if(((getBalance()-ammount)>=minimumbalance)){
			setBalance(getBalance()-ammount);	
		}
		else
			System.out.println("Not Enough Money");
	}
}
