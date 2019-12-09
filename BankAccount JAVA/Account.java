import java.util.Random;

public abstract class Account {
	private String name;
	private String id;
	private double balance;
	double minimumbalance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
	}
	public Account(String n,double b,int mib){
		this.name=n;
		this.balance=b;
		this.minimumbalance=mib;
		Random rand=new Random();
		this.id=10000+rand.nextInt(89999)+"";
	}
	public void deposite(double ammount){
		setBalance(getBalance()+ammount);
	}
	abstract void withdrawl(double ammount);
	void display(){
		System.out.println("Name:"+getName()+" "+"Id:"+getId()+" "+"Balance:"+getBalance());
	}
	
}
