
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreatAccountGui {
	
	public CreatAccountGui(){
			JFrame f2=new JFrame("Welcome To Private Banking System");
			f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f2.setSize(600,400);
			f2.setLayout(null);
			
			JLabel lb4=new JLabel("Savings Account");
			f2.add(lb4);
			lb4.setBounds(222,20,100,20);
			JButton bn4=new JButton("Enter");
			f2.add(bn4);
			bn4.setBounds(230,40,80,20);
			bn4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f2.setVisible(false);
					new SavingsGui();			
				}		
			});		
			
			
			JLabel lb5=new JLabel("Current Account");
			f2.add(lb5);
			lb5.setBounds(227,70,100,20);
			JButton bn5=new JButton("Enter");
			f2.add(bn5);
			bn5.setBounds(232,90,80,20);
			bn5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f2.setVisible(false);
					new CurrentGui();			
				}		
			});
			
			
			JLabel lb6=new JLabel("Student Account");
			f2.add(lb6);
			lb6.setBounds(227,120,100,20);
			JButton bn6=new JButton("Enter");
			f2.add(bn6);
			bn6.setBounds(232,140,80,20);
			bn6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f2.setVisible(false);
					new StudentGui();			
				}		
			});
			
			

			f2.setVisible(true);
		}

}
