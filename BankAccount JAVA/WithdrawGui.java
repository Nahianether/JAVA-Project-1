
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class WithdrawGui extends Obj {
	
	public WithdrawGui(){
			JFrame f=new JFrame("Welcome To Private Banking System");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(600,400);
			f.setLayout(null);
			
			JLabel lb27=new JLabel("Withdraw");
			f.add(lb27);
			lb27.setBounds(242,0,100,20);
			
			JLabel lb28=new JLabel("Withdraw Ammount");
			f.add(lb28);
			lb28.setBounds(215,20,120,20);
			
			JTextField tf11=new JTextField(5);
			f.add(tf11);
			tf11.setBounds(230,40,80,20);
			
			JButton bn14=new JButton("Enter");
			f.add(bn14);
			bn14.setBounds(230,70,80,20);
			bn14.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f.setVisible(false);
					String tempBalance = tf11.getText();
					double ammount = Double.parseDouble(tempBalance);
					A[num].withdrawl(ammount);
					//i++;		
					JOptionPane.showMessageDialog(bn14, "Withdraw Done");
					new ManageAccount();
				}		
			});	
			
			
			f.setVisible(true);
		}
}
