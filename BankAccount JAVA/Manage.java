import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Manage extends Obj{
	
	public Manage(){
			JFrame f7=new JFrame("Welcome To Private Banking System");
			f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f7.setSize(600,400);
			f7.setLayout(null);
			
			JLabel lb23=new JLabel("Manage Account");
			f7.add(lb23);
			lb23.setBounds(225,0,100,20);
			
			JLabel lb24=new JLabel("Id");
			f7.add(lb24);
			lb24.setBounds(265,20,80,20);
			
			JTextField tf9=new JTextField(5);
			f7.add(tf9);
			tf9.setBounds(230,40,80,20);
			
			JButton bn12=new JButton("Enter");
			f7.add(bn12);
			bn12.setBounds(230,70,80,20);
			bn12.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f7.setVisible(false);
					String s = tf9.getText();
					for(int j=0;j<=i;j++){
            			if(s.equals(A[j].getId())){
            				num=j;
            				break;
            			}
            		}
					new ManageAccount();			
				}		
			});		
	
			f7.setVisible(true);
		}
	

}
