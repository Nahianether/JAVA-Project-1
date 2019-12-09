import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class DisplayGui extends Obj {
	
	public DisplayGui(){
			JFrame f10=new JFrame("Welcome To Private Banking System");
			f10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f10.setSize(600,400);
			f10.setLayout(null);
			
			JLabel lb29=new JLabel("Display Account");
			f10.add(lb29);
			lb29.setBounds(227,20,100,20);
			
			JLabel lb30=new JLabel("Name");
			f10.add(lb30);
			lb30.setBounds(145,50,80,20);
			
			JTextField tf15=new JTextField(A[num].getName());
			f10.add(tf15);
			tf15.setBounds(120,70,100,20);
			
			JLabel lb31=new JLabel("Id");
			f10.add(lb31);
			lb31.setBounds(247,50,80,20);
			
			JTextField tf16=new JTextField(A[num].getId());
			f10.add(tf16);
			tf16.setBounds(230,70,100,20);
			
			JLabel lb32=new JLabel("Balance");
			f10.add(lb32);
			lb32.setBounds(355,50,80,20);	
			JButton bn50=new JButton("Ammount?");
			f10.add(bn50);
			bn50.setBounds(340,70,100,20);
			bn50.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f10.setVisible(false);
					JOptionPane.showMessageDialog(bn50, A[num].getBalance());					
				}		
			});		
			
			JButton bn7=new JButton("Exit");
			f10.add(bn7);
			bn7.setBounds(230,110,80,20);
			bn7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f10.setVisible(false);
					new ManageAccount();					
				}		
			});		
			
			f10.setVisible(true);
		}
			
	
}
