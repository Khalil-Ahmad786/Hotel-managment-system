import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Home extends JFrame implements ActionListener {
	private Container c;
	private JPanel panel1, panel2, panel3;
	private JButton btn1, btn2, btn3;
	private Font font, font2;
	private JLabel top_label, bottom_label, prop_label;
	private final Color SILVER = new Color(192, 192, 192);
	private final Color NAVY = new Color(0, 0, 128);
	private final Color LIGHT_ORANGE = new Color(255, 153, 0);
	private final Color GOLD = new Color(255, 204, 51);
	private final Color LIGHT_YELLOW = new Color(255, 255, 153);
	private final Color DARK_YELLOW = new Color(255, 204, 0);
	private final Color VERY_LIGHT_YELLOW = new Color(255, 255, 204);
	private final Color VERY_LIGHT_RED = new Color(255, 102, 102);
	private final Color PURPLE = new Color(102, 0, 153);
	private final Color VERY_LIGHT_GREEN = new Color(102, 255, 102);
	private final Color VERY_LIGHT_BLUE = new Color(51, 204, 255);
	private final Color VERY_DARK_GREEN = new Color(0, 102, 0);
	private final Color LIGHT_BROWN = new Color(153, 102, 0);
	private final Color BROWN = new Color(102, 51, 0);
	private final Color DARK_BROWN = new Color(51, 0, 0);
	private final Color LIGHT_PINK = new Color(255, 192, 203);
	public BasicFrame frame1;

	Home() {
		frame1 = new BasicFrame("Project By Ali Waqar ", 900, 500);
		frame1.setResizable(true);
		c = frame1.getContentPane();

		Font btnfont = new Font("Comic Sans MS", Font.BOLD, 50);
		btn1 = new JButton("MENU");
		btn1.setBackground(Color.WHITE);
		btn1.setForeground(NAVY);
		btn1.setFont(btnfont);
		btn1.addActionListener(this);

		btn2 = new JButton("ORDER");
		btn2.setForeground(NAVY);
		btn2.setBackground(Color.WHITE);
		btn2.setFont(btnfont);
		btn2.addActionListener(this);

		btn3 = new JButton("ABOUT");
		btn3.setForeground(NAVY);
		btn3.setBackground(Color.WHITE);
		btn3.setFont(btnfont);
		btn3.addActionListener(this);

		font = new Font("Chiller", Font.BOLD, 100);
		font2 = new Font("Calibri", Font.BOLD, 40);
		top_label = new JLabel("R  A  Q  A  B  I");
		top_label.setFont(font);
		top_label.setForeground(Color.WHITE);

		bottom_label = new JLabel(" ");
		bottom_label.setFont(font2);
		bottom_label.setForeground(NAVY);

		prop_label = new JLabel(" Ali Waqar");
		prop_label.setFont(new Font("Calibri", Font.BOLD, 20));
		prop_label.setForeground(NAVY);
		panel1 = new JPanel();
		// BorderLayout border_Layout1 = new BorderLayout();
		panel1.setLayout(new FlowLayout());// top label which shows raqabi title
		panel1.add(top_label);
		panel1.setBackground(NAVY);

		panel2 = new JPanel();// 2nd label
		GridLayout g1 = new GridLayout(1, 3);
		g1.setHgap(50);
		g1.setVgap(50);
		panel2.setLayout(g1);
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(btn3);
		panel2.setBackground(SILVER);

		panel3 = new JPanel();// third label in the end
		panel3.setLayout(new GridLayout(2, 1, 20, 10));
		panel3.add(bottom_label);
		panel3.add(prop_label);
		panel3.setBackground(SILVER);

		BorderLayout border_Layout2 = new BorderLayout();
		border_Layout2.setVgap(20);
		c.setLayout(border_Layout2);
		c.setBackground(SILVER);
		c.add(panel1, BorderLayout.PAGE_START);
		c.add(panel2, BorderLayout.CENTER);
		c.add(panel3, BorderLayout.PAGE_END);
		frame1.setLocationRelativeTo(null);// Display Frame in Center
		frame1.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btn1) {
			Menu menu = new Menu();
			frame1.dispose();
		}
		if (event.getSource() == btn2) {
			Order order = new Order();
			frame1.dispose();
		}
		if (event.getSource() == btn3) {
			About a = new About();
			frame1.dispose();
		}

	}
}