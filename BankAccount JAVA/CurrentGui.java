
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CurrentGui extends Obj{

	public CurrentGui(){
			JFrame f4=new JFrame("Welcome To Private Banking System");
			f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f4.setSize(600,400);
			f4.setLayout(null);
			
			JLabel lb10=new JLabel("Current Account");
			f4.add(lb10);
			lb10.setBounds(227,20,100,20);
			JLabel lb11=new JLabel("Name");
			f4.add(lb11);
			lb11.setBounds(145,50,80,20);
			JTextField tf3=new JTextField(5);
			f4.add(tf3);
			tf3.setBounds(120,70,100,20);
			JLabel lb12=new JLabel("Balance");
			f4.add(lb12);
			lb12.setBounds(247,50,80,20);
			JTextField tf4=new JTextField(5);
			f4.add(tf4);
			tf4.setBounds(230,70,100,20);
			JLabel lb13=new JLabel("TradeLisence");
			f4.add(lb13);
			lb13.setBounds(345,50,80,20);
			JTextField tf5=new JTextField(5);
			f4.add(tf5);
			tf5.setBounds(340,70,100,20);
			JButton bn8=new JButton("Enter");
			f4.add(bn8);
			bn8.setBounds(232,110,80,20);
			bn8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f4.setVisible(false);
					String name = tf3.getText();
					String tempBalance = tf4.getText();
					double balance = Double.parseDouble(tempBalance);
					String tempTradelisence = tf4.getText();
					int tradelisence = Integer.parseInt(tempTradelisence);
					A[i]=new Current(name,balance,tradelisence);
					JOptionPane.showMessageDialog(bn8, A[i].getId());
					i++;
					new ApplicationGui();
				}		
			});	
			
			
			f4.setVisible(true);
		}

}
