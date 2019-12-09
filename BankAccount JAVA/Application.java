import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
		Account[] A=new Account[50];
        int a=0,i=-1,j=-2,x;
            do{
            	System.out.println(".....Welcome To My Banking System.....");
            	System.out.println("Want to open a new accout? Press 1:");
            	System.out.println("Want to work with your account? Press 2:");
            	System.out.println("Want to Exit:Press 3:");
            	System.out.println("Enter Your Choice:");
            	x=userInput.nextInt();
            	if(x==1){
            		System.out.println("...Account Type...");
            		System.out.println("1.For Savings Account Write:'Savings'");
            		System.out.println("2.For Current Account Write:'Current'");
            		System.out.println("3.For Student Account Write:'Student'");
                    System.out.println("What Type Of Account Want To Make? Enter Your choice:");
                    String c1=userInput.next();
                    i++;
                    if(c1.equals("Savings")){
            			System.out.println("Enter your Name:");
            			String name=userInput.next();
            			System.out.println("Enter your Balance:");
            			double balance=userInput.nextDouble();
            			A[i]=new Savings(name,balance);
            			System.out.println("Account Holder Name:"+A[i].getName() + "Account Holder Id:"+A[i].getId());
                    }
                    else if(c1.equals("Current")){
                    	System.out.println("Enter your Name:");
                    	String name=userInput.next();
                    	System.out.println("Enter your Balance:");
                    	double balance=userInput.nextDouble();
                    	System.out.println("Enter your TreadLisence:");
                    	int trdLisence=userInput.nextInt();
                    	A[i]=new Current(name, balance,trdLisence);
                    	System.out.println("Account Holder Name:"+A[i].getName() + "Account Holder Id:"+A[i].getId());
                    }	
                    else if(c1.equals("Student")){	
                    	System.out.println("Enter your Name:");
                    	String name=userInput.next();
                    	System.out.println("Enter your Balance:");
                    	double balance=userInput.nextDouble();
                    	System.out.println("Enter your Institute:");
                    	String inst=userInput.next();
                    	A[i]=new Student(name,balance,inst);
                    	System.out.println("Account Holder Name:"+A[i].getName() + "Account Holder Id:"+A[i].getId());
                    }
                    else{
                    	System.out.println("Error Choice...");
                    }
            	}
            	else if(x==2){
            		System.out.println("Input Your Id:");
            		String y= userInput.next();
            		for(j=0;j<=i;j++){
            			if(y.equals(A[j].getId())){
            				break;
            			}
            		}
            	}
            	if(j>=0){
            	do{
            		System.out.println("Want to Deposite Money Press 1:");
            		System.out.println("Want to Withdrawl Money Press 2:");
                    System.out.println("Want Display Account Details Press 3:");
                    System.out.println("Return to Banking System Press 0:");
                    a=userInput.nextInt();
                    if (a == 1) {
                    	System.out.println("Enter How Much Money You Want TO Deposite:");
                        double ammount= userInput.nextDouble();
                        A[j].deposite(ammount);
                    }
                    else if (a== 2) {
                    	System.out.println("Enter How Much Money You Want TO Withdrawl:");
                        double ammount= userInput.nextDouble();
                        A[j].withdrawl(ammount);
                    }
                    else if (a == 3) {
                        A[j].display();
                    }
                    else{
                    	System.out.println("Exit from account");
                    	break;
                    }
            	}while(a!=0);	
            	}
            }while(x!=0);
        }
}