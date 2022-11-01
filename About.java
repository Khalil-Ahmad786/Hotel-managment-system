import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class About implements ActionListener{
	private final Color LIGHT_ORANGE = new Color(255,153,0);
	private final Color GOLD = new Color(255,204,51);
	private final Color LIGHT_YELLOW = new Color(255,255,153);
	private final Color DARK_YELLOW = new Color(255,204,0);
	private final Color VERY_LIGHT_YELLOW = new Color(255,255,204);
	private final Color VERY_LIGHT_RED = new Color(255,102,102);
	private final Color PURPLE = new Color(102,0,153);
	private final Color VERY_LIGHT_GREEN = new Color(102,255,102);
	private final Color VERY_LIGHT_BLUE = new Color(51,204,255);
	private final Color VERY_DARK_GREEN = new Color(0,102,0);	
	private final Color LIGHT_BROWN = new Color(153,102,0);
	private final Color BROWN = new Color(102,51,0);
	private final Color DARK_BROWN = new Color(51,0,0);

	private BasicFrame f;
	private JScrollPane sp;
	private JPanel p;
	private Container c;
	private Font font,font2;
	private JLabel [] label = new JLabel[40];
	About(){
		f = new BasicFrame("ABOUT",600,700);
		font = new Font("Times New Roman",Font.BOLD,20);
		font2 = new Font("Cooper Black",Font.BOLD,20);
		label[0] = new JLabel("Welcome");
		label[1] = new JLabel("A PROJECT BY Ali Waqar");
		
		
		label[0].setFont(font);
		label[1].setFont(font2);
		label[1].setForeground(Color.RED);
		p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
		for(int i=0; i<2; i++){

			p.add(label[i]);

		}

		sp = new JScrollPane(p);
		sp.setViewportView(p);
//		s.setViewportView(inside);
		c = f.getContentPane();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.add(sp,BorderLayout.CENTER);
		f.setResizable(true);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){

	}

}