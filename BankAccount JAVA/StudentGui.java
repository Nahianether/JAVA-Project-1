import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentGui extends Obj{
	public StudentGui(){
			JFrame f5=new JFrame("Welcome To Private Banking System");
			f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f5.setSize(600,400);
			f5.setLayout(null);
			
			JLabel lb14=new JLabel("Student Account");
			f5.add(lb14);
			lb14.setBounds(227,20,100,20);
			JLabel lb15=new JLabel("Name");
			f5.add(lb15);
			lb15.setBounds(145,50,80,20);
			JTextField tf6=new JTextField(5);
			f5.add(tf6);
			tf6.setBounds(120,70,100,20);
			JLabel lb16=new JLabel("Balance");
			f5.add(lb16);
			lb16.setBounds(247,50,80,20);
			JTextField tf7=new JTextField(5);
			f5.add(tf7);
			tf7.setBounds(230,70,100,20);
			JLabel lb17=new JLabel("Institute");
			f5.add(lb17);
			lb17.setBounds(355,50,80,20);
			JTextField tf8=new JTextField(5);
			f5.add(tf8);
			tf8.setBounds(340,70,100,20);
			JButton bn9=new JButton("Enter");
			f5.add(bn9);
			bn9.setBounds(232,110,80,20);
			bn9.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f5.setVisible(false);
					String name = tf6.getText();
					String tempBalance = tf7.getText();
					double balance = Double.parseDouble(tempBalance);
					String institute = tf8.getText();
					A[i]=new Student(name,balance,institute);
					JOptionPane.showMessageDialog(bn9, A[i].getId());
					i++;
					new ApplicationGui();
				}		
			});	
			f5.setVisible(true);
		}

}
