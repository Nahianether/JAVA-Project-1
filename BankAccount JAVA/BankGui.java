import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class BankGui {

	JTextField tf;
	JLabel lb;
	JButton bn;
	
	public BankGui(){
			JFrame f=new JFrame("Welcome To Private Banking System");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(600,400);
			f.setLayout(null);
			
			lb=new JLabel("Creat Account");
			f.add(lb);
			lb.setBounds(230,0,100,20);
			bn=new JButton("Enter");
			f.add(bn);
			bn.setBounds(230,20,80,20);
			
			
			lb=new JLabel("Savings Account");
			f.add(lb);
			lb.setBounds(222,50,100,20);
			bn=new JButton("Enter");
			f.add(bn);
			bn.setBounds(230,70,80,20);
			lb=new JLabel("Name");
			f.add(lb);
			lb.setBounds(185,90,80,20);
			tf=new JTextField(8);
			f.add(tf);
			tf.setBounds(160,110,100,20);
			lb=new JLabel("Balance");
			f.add(lb);
			lb.setBounds(315,90,80,20);
			tf=new JTextField(8);
			f.add(tf);
			tf.setBounds(300,110,100,20);
			
			lb=new JLabel("Current Account");
			f.add(lb);
			lb.setBounds(227,140,100,20);
			bn=new JButton("Enter");
			f.add(bn);
			bn.setBounds(232,160,80,20);
			lb=new JLabel("Name");
			f.add(lb);
			lb.setBounds(145,180,80,20);
			tf=new JTextField(5);
			f.add(tf);
			tf.setBounds(120,200,100,20);
			lb=new JLabel("Balance");
			f.add(lb);
			lb.setBounds(247,180,80,20);
			tf=new JTextField(5);
			f.add(tf);
			tf.setBounds(230,200,100,20);
			lb=new JLabel("TradeLisence");
			f.add(lb);
			lb.setBounds(345,180,80,20);
			tf=new JTextField(5);
			f.add(tf);
			tf.setBounds(340,200,100,20);
			
			lb=new JLabel("Student Account");
			f.add(lb);
			lb.setBounds(227,230,100,20);
			bn=new JButton("Enter");
			f.add(bn);
			bn.setBounds(232,250,80,20);
			lb=new JLabel("Name");
			f.add(lb);
			lb.setBounds(145,270,80,20);
			tf=new JTextField(5);
			f.add(tf);
			tf.setBounds(120,290,100,20);
			lb=new JLabel("Balance");
			f.add(lb);
			lb.setBounds(247,270,80,20);
			tf=new JTextField(5);
			f.add(tf);
			tf.setBounds(230,290,100,20);
			lb=new JLabel("Institute");
			f.add(lb);
			lb.setBounds(355,270,80,20);
			tf=new JTextField(5);
			f.add(tf);
			tf.setBounds(340,290,100,20);
			
			//button.addActionListener(new ButtonHandler());
			f.setVisible(true);
			//f.addMouseListener(this);
		}
	
	public static void main(String[] args) {
		new BankGui();
	}


}
