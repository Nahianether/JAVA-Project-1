import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SavingsGui extends Obj{

		
	
	public SavingsGui (){
			JFrame f3=new JFrame("Welcome To Private Banking System");
			f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f3.setSize(600,400);
			f3.setLayout(null);
			
			JLabel lb7=new JLabel("Savings Account");
			f3.add(lb7);
			lb7.setBounds(222,20,100,20);
			JLabel lb8=new JLabel("Name");
			f3.add(lb8);
			lb8.setBounds(185,50,80,20);
			
			JTextField tf1=new JTextField(8);
			f3.add(tf1);
			tf1.setBounds(160,70,100,20);
			JLabel lb9=new JLabel("Balance");
			f3.add(lb9);
			lb9.setBounds(315,50,80,20);
			JTextField tf2=new JTextField(8);
			f3.add(tf2);
			tf2.setBounds(300,70,100,20);
			JButton bn7=new JButton("Enter");
			f3.add(bn7);
			bn7.setBounds(230,110,80,20);
			bn7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f3.setVisible(false);
					String name = tf1.getText();
					String tempBalance = tf2.getText();
					
					//double balance = Double.parseDouble(tempBalance);
					//A[i]=new Savings(name, balance);
					//JOptionPane.showMessageDialog(bn7, A[i].getId());	
					//i++;
					
				try{
						FileWriter a=new FileWriter("H:\\Java Program\\BankAccount\\BankInput.txt",true);
						PrintWriter w=new PrintWriter(a);
						w.print(name);
						w.print(tempBalance);
						w.print(A[i].getBalance());
						w.close();
						
				}catch(Exception e1){
					System.out.println(e1);
				}
					new ApplicationGui();
				}		
			});		
			
			
			f3.setVisible(true);
		}
	
}
