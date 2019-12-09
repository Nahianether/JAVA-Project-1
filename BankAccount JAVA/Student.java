
public class Student extends Savings {
	String institute;
	public Student(String n,double b,String inst){
		super(n,b);
		this.institute = inst;
		maximumwithdrawl=20000;
		minimumbalance=100;
		
		
	}
}
