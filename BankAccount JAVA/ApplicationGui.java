import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ApplicationGui {
	protected Object f1;
	
	public ApplicationGui(){
			JFrame f1=new JFrame("Welcome To Private Banking System");
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f1.setSize(600,400);
			f1.setLayout(null);
			
			JLabel lb1=new JLabel("Creat Account");
			f1.add(lb1);
			lb1.setBounds(230,00,100,20);
			JButton bn1=new JButton("Enter");
			f1.add(bn1);
			bn1.setBounds(230,20,80,20);
			bn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f1.setVisible(false);
					new CreatAccountGui();
				}		
			});			
			JLabel lb2=new JLabel("Manage Account");
			f1.add(lb2);
			lb2.setBounds(225,50,100,20);
			JButton bn2=new JButton("Enter");
			f1.add(bn2);
			bn2.setBounds(230,70,80,20);
			bn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f1.setVisible(false);
					new Manage();			
				}		
			});		
			
			JLabel lb3=new JLabel("Exit");
			f1.add(lb3);
			lb3.setBounds(260,100,100,20);
			JButton bn3=new JButton("Enter");
			f1.add(bn3);
			bn3.setBounds(230,120,80,20);
			bn3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f1.setVisible(false);
				}		
			});
			
			
			f1.setVisible(true);
		}
	
//	private ActionListener actionPerformed(Object object) {
//		return null;
//	}

	public static void main(String[] args) {
		new ApplicationGui();
		
		}
}
