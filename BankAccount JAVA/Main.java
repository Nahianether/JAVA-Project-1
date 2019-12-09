import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.*;
public class Main {
	static int i=-1;
	    Account ba[]=new Account[10];
		JLabel l;
		JCheckBox c,c1,c2;
		JTextField tn,bn,tr,ins,bn1,ai,wl,n;
		double d;
		int tl;
		JButton b,b1;
		public Main() {
			String[] in=new String[10];
			JFrame f=new JFrame("Welcome to Banking System");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(600, 500);
			f.setLayout(null);		
			l=new JLabel("Create Account:");
			l.setBounds(250,40,150,20);
			f.add(l);
			
			l=new JLabel("");
			l.setBounds(100,40,50,20);
			f.add(l);
			
			c1=new JCheckBox("Current");
			c1.setBounds(250,230,70,20);
			f.add(c1);
			c2=new JCheckBox("Student");
			c2.setBounds(350,230,70,20);
			f.add(c2);
			l=new JLabel("Name:");
			l.setBounds(50, 80, 520, 20);
			f.add(l);
			tn=new JTextField();
			tn.setBounds(140, 80, 200, 20);
			//ba.setName(tn.getText());
			
			f.add(tn);
			l=new JLabel("Balance:");
			l.setBounds(50, 110, 520, 20);
			
			f.add(l);
			bn=new JTextField();
			bn.setBounds(140, 110, 200, 20);
			f.add(bn);
		//	d=Double.parseDouble(bn.getText());
		//   System.out.println(d);
			//String s1=bn.getText();
		//	System.out.println(s1);
			l=new JLabel("Trade No:");
			l.setBounds(50, 140, 520, 20);
			f.add(l);
			tr=new JTextField();
			tr.setBounds(140, 140, 200, 20);
			f.add(tr);
			//tl=Integer.parseInt(tr.getText());
			l=new JLabel("(For Current Account Only)");
			l.setBounds(340, 140, 200, 20);
			f.add(l);
			
			l=new JLabel("Withdraw Lim.:");
			l.setBounds(50, 170, 520, 20);
			f.add(l);
			wl=new JTextField();
			wl.setBounds(140, 170, 200, 20);
			f.add(wl);
			l=new JLabel("(For Current Account Only)");
			l.setBounds(340, 170, 200, 20);
			f.add(l);
			
			l=new JLabel("Institute:");
			l.setBounds(50, 200, 520, 20);
			f.add(l);
			ins=new JTextField();
			ins.setBounds(140, 200, 200, 20);
			f.add(ins);
			l=new JLabel("(For Student Account Only)");
			l.setBounds(340, 200, 200, 20);
			f.add(l);
			
			b1=new JButton("Create");
			b1.setBounds(230,260,100,20);
			f.add(b1);
			
			c=new JCheckBox("Savings");
			c.setBounds(150,230,70,20);
			f.add(c);
			
			
			
           c.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					try{
					i++;
					//ba[i]=new Savings(tn.getText(),bn.getText());
					}
					catch(Exception e1){
						e1.printStackTrace();
						System.out.println("Exception");
					}
				}
			});
			
             c1.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					i++;
					//ba[i]=new CurrentAccount(tn.getText(), d, tl);
					//ba[i]=new Current(tn.getText(), bn.getText(), tr.getText());
				}
			});
            c2.addItemListener(new ItemListener() {
 				@Override
 				public void itemStateChanged(ItemEvent e) {
                    i++;
 					//ba[i]=new Student(tn.getText(), bn.getText(), ins.getText());
			
 				}
 			});
         
			l=new JLabel("Exixting Account:");
			l.setBounds(250,310,150,20);
			f.add(l);
			l=new JLabel("A/C No.:");
			l.setBounds(50, 340, 520, 20);
			f.add(l);
			bn1=new JTextField();
			bn1.setBounds(140, 340, 200, 20);
			f.add(bn1);
			
			b=new JButton("Enter");
			b.setBounds(240, 370, 70, 20);
			f.add(b);
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try{
						//System.out.println(tn.getText()+bn.getText());
					f.setVisible(false);
					JFrame f1=new JFrame("Execute Your Account");
					f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					f1.setSize(600, 500);
					f1.setLayout(null);	
					JLabel l1=new JLabel("What you want to do???");
					l1.setBounds(250,20,300,20);
					f1.add(l1);
					ai=new JTextField();
					ai.setBounds(220, 50, 100, 20);
					f.add(ai);
					JOptionPane.showMessageDialog(l1,ba[i].getId());
					f1.setVisible(true);
					}
					catch(Exception e1){
						
					}
				}
			});
			f.setVisible(true);
		}

		public static void main(String[] args) {
			new Main();
			/*Scanner input=new Scanner(System.in);
			double balance;
			int i=-1,ac,j = -1,num;
			String op;
			System.out.println("Enter 1 for existing account,2 for Account Creation,0 for exit");
			ac=input.nextInt();
			while(ac!=0){
			if(ac==1){
				System.out.println("Enter your Account Id:");
				String s=input.next();
				for(num=0;num<=i;num++){
					if(s.equals(ba[num].getId())){
						j=num;
						break;
					}
				}
			}
			else if(ac==2){
				System.out.println("Enter What type of account you want to open\nSavings/Current/Student/No");
				op=input.next();
	            i++;		     	
			  if(op.equals("Savings")){
				System.out.println("Enter your name and openning balance:");
				 ba[i]=new SavingsAccount(input.next(),balance=input.nextDouble());
				 System.out.println("Remembr your Id for future use: "+ba[i].getId());
				 j=i;
			  }
			  else if(op.equals("Current")){
				System.out.println("Enter your name,openning balance and trade license number:");
				ba[i]=new CurrentAccount(input.next(), balance=input.nextDouble(),input.nextInt());
				 System.out.println("Remembr your Id for future use: "+ba[i].getId());
				 j=i;
			  }
			  else if(op.equals("Student")){
				System.out.println("Enter your name,openning balance and institute:");
				ba[i]=new StudentAccount(input.next(), input.nextDouble(), input.next());
				System.out.println("Remembr your Id for future use: "+ba[i].getId());
				j=i;
			  }
			}
			 // else if(op.equals("No")){
				//break;
			 // }
			  int step;
			  if(j>=0){
			  do{
					System.out.println("Enter 1 for depodit 2 for withdraw 3 for display 0 for ext:");
					step=input.nextInt();
				switch(step){
		       case 1:System.out.println("Enter How much you want to deposit:");
			       ba[j].deposit(input.nextDouble());
			       break;
			   case 2:
			    	   System.out.println("Enter How much you want to withdraw:");
				       ba[j].withDraw(input.nextDouble());
			           break;
			   case 3:System.out.println("Balance is:"+ba[j].getBalance());
			       break;
			   case 0:System.out.println("Exit");
			          break;
			 }
			}while(step!=0);
			  }
			  System.out.println("Enter 1 for existing account,2 for Account Creation,0 for exit");
				ac=input.nextInt();
			}*/
		}
}