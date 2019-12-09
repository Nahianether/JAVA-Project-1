import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ManageAccount extends Obj {
	
	public ManageAccount(){
			JFrame f6=new JFrame("Welcome To Private Banking System");
			f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f6.setSize(600,400);
			f6.setLayout(null);
			
			
			JLabel lb18=new JLabel("Manage Account");
			f6.add(lb18);
			lb18.setBounds(225,0,100,20);
			
			JLabel lb19=new JLabel("Deposite Money");
			f6.add(lb19);
			lb19.setBounds(222,20,100,20);
			JButton bn8=new JButton("Enter");
			f6.add(bn8);
			bn8.setBounds(230,40,80,20);
			bn8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f6.setVisible(false);
					new DepositeGui();			
				}		
			});	
			
			JLabel lb20=new JLabel("Withdrawl Money");
			f6.add(lb20);
			lb20.setBounds(227,70,100,20);
			JButton bn9=new JButton("Enter");
			f6.add(bn9);
			bn9.setBounds(232,90,80,20);
			bn9.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f6.setVisible(false);
					new WithdrawGui();			
				}		
			});	
			
			
			JLabel lb21=new JLabel("Display Detail");
			f6.add(lb21);
			lb21.setBounds(227,120,100,20);
			JButton bn10=new JButton("Enter");
			f6.add(bn10);
			bn10.setBounds(232,140,80,20);
			bn10.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new DisplayGui();
				}		
			});
			
			JLabel lb22=new JLabel("Exit");
			f6.add(lb22);
			lb22.setBounds(260,170,100,20);
			JButton bn11=new JButton("Enter");
			f6.add(bn11);
			bn11.setBounds(232,190,80,20);
			bn11.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f6.setVisible(false);
					new ApplicationGui();
				}		
			});
			
			f6.setVisible(true);
		}
	
}
