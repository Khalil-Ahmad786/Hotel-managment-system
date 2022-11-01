import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Rates implements ActionListener{
	private BasicFrame orderframe;
	private JPanel pane,inside,toppanel;
	private Container c;
	private JScrollPane s;
	private JButton btn;
	private JLabel itemslabel[] = new JLabel[39];
	private JLabel rateslabel[] = new JLabel[39];
	private BoxLayout layout,layout2;
	private Font font,font2;
	private ImageIcon img = new ImageIcon("Back.PNG");
	private String items[] = {"Zinger Burger","Pizza  Mini","Pizza Medium","Pizza Large","Shuwarma","Chicken Karhai","Green Chicken Karhai","Red Chicken Karhai","Mutton Karhai","Chapati","Naan","Taaftan","Kulcha","Biryani","Fried Rice","Chicken Pulao","Beaf Pulao","Chineese Rice","Daal Chana","Daal Mash","French Fries","Salad","Raaita","Tea","Green Tea","Coffee","Cold Coffee","Regular","Sting","Half Liter","One Liter","Jumbo","Banana Shack","Mango Shack","Cheeko Shack","Choco Shack","Apple Shack","StrawBerry Shack","Flavoured Milk"};
	private String rates[] = {"Rs. 180/=","Rs. 600/=","Rs. 800/=","Rs. 1000/=","Rs. 100/=","Rs. 800/KG=","Rs. 850/KG=","Rs. 750/KG=","Rs. 1200/KG=","Rs. 15/=","Rs. 25/=","Rs. 30/=","Rs. 40/=","Rs. 120/=","Rs. 100/=","Rs. 140/=","Rs. 180/=","Rs. 200/=","Rs. 60/=","Rs. 80/=","Rs. 40/=","Rs. 30/=","Rs. 50/=","Rs. 50/=","Rs. 50/=","Rs. 70/=","Rs. 80/=","Rs. 30/=","Rs. 40/=","Rs. 50/=","Rs. 100/=","Rs. 130/=","Rs. 60/=","Rs. 70/=","Rs. 70/=","Rs. 70/=","Rs. 80","Rs. 100/=","Rs. 40/="};
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
	private final Color SLATE_GRAY = new Color(112,128,144);
	private final Color LIGHT_STEEL_BLUE = new Color(176,196,222);
	private final Color SILVER = new Color(192,192,192);
	private final Color NAVY = new Color(0,0,128);
	Rates(){
		orderframe = new BasicFrame("RATES ARE HERE",1000,700);
		c = orderframe.getContentPane();
		font = new Font("Calibri",Font.BOLD,50);
		font2 = new Font("Calibri",Font.BOLD,30);
		
		pane = new JPanel();
		pane.setBackground(SILVER);
		
		inside = new JPanel();
		toppanel = new JPanel();
		toppanel.setBackground(NAVY);
		
		btn = new JButton(img);
		btn.setBackground(Color.WHITE);
		btn.addActionListener(this);
		
		toppanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		toppanel.add(btn);
		
		pane.setLayout(new GridLayout(40,2,5,5));
		JLabel r = new JLabel("RATES");
		JLabel it = new JLabel("ITEMS");
		
		r.setFont(font);
		it.setFont(font);
		//for loop to initiliaze labels
		for (int m=0;m<39;m++ ) {
			itemslabel[m] = new JLabel(items[m]);
			rateslabel[m] = new JLabel(rates[m]);
		}
		// loop to set text and other deecoration of labels
		for(int i=0;i<39;i++){
			itemslabel[i].setFont(font2);
			rateslabel[i].setFont(font2);
			itemslabel[i].setForeground(NAVY);
			rateslabel[i].setForeground(NAVY);
		}
		pane.add(it);
		pane.add(r);
		// loo to add labels to the panels
		for(int j = 0; j<39;j++){
			pane.add(itemslabel[j]);
			pane.add(rateslabel[j]);
		}

		inside.setBackground(GOLD);
		inside.setLayout(new BorderLayout());
		inside.add(pane,BorderLayout.CENTER);
		s = new JScrollPane(inside);
//		s.setViewportView(inside);
		c.add(toppanel,BorderLayout.LINE_START);
		c.add(s,BorderLayout.CENTER);
		orderframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		orderframe.setLocationRelativeTo(null);
	}
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==btn){
			orderframe.dispose();			
		}
	}
}