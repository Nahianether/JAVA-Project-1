import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DepositeGui extends Obj {

	public DepositeGui(){
			JFrame f=new JFrame("Welcome To Private Banking System");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(600,400);
			f.setLayout(null);
			
			JLabel lb25=new JLabel("Deposite");
			f.add(lb25);
			lb25.setBounds(240,0,100,20);
			
			JLabel lb26=new JLabel("Deposite Ammount");
			f.add(lb26);
			lb26.setBounds(215,20,120,20);
			
			JTextField tf10=new JTextField(5);
			f.add(tf10);
			tf10.setBounds(230,40,80,20);
			
			JButton bn13=new JButton("Enter");
			f.add(bn13);
			bn13.setBounds(230,70,80,20);
			bn13.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f.setVisible(false);
					String tempBalance = tf10.getText();
					double ammount = Double.parseDouble(tempBalance);
					A[num].deposite(ammount);
					JOptionPane.showMessageDialog(bn13, "Deposite Done");
					new ManageAccount();	
				}		
			});	
			f.setVisible(true);
		}
	
}
