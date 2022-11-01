import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu implements ItemListener{
	private BasicFrame frame;
	private Container c;
	private JPanel top,center,bottom,inside;
	private JLabel chose_item;
	private JScrollPane sp;
	private final Color SILVER = new Color(192,192,192);
	private final Color FLORAL_WHITE = new Color(255,250,240);
	private final Color CORN_SILK = new Color(255,248,220);
	private final Color HONEY_DEW = new Color(240,255,240);
	private final Color AZURE = new Color(240,255,255);
	private final Color NAVY = new Color(0,0,128);
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
	private final Color SNOW = new Color(255,250,250);
	private JButton back;
	private ImageIcon back_img;
	private JComboBox<String> cb;
	private JLabel item,rate,item1,rate1,item2,rate2,item3,rate3,item4,rate4,item5,rate5;
	private JLabel item6,rate6,item7,rate7;
	Menu(){
		frame = new BasicFrame("Today's MENU",1200,680);
		String[] arr = {"Fast Food","Karhai","Naan","Rice","Vegetable","Hot Drink","Cold Drink","Fresh Juice"};
		
		Font cb_font = new Font("Calibri",Font.BOLD,30);

		back_img = new ImageIcon("Back.png");

		cb = new JComboBox<String>(arr);

		cb.setFont(cb_font);
		cb.setForeground(NAVY);
		cb.addItemListener(this);
		cb.setEditable(false);
		cb.setBackground(VERY_LIGHT_YELLOW);

		back = new JButton(back_img);
		back.setBackground(Color.WHITE);
		//adding actionlistener to the back button which is on the bottom
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				back_action(event);
			}
		});

		chose_item = new JLabel("Choose Category");
		chose_item.setFont(new Font("Calibri",Font.BOLD,30));
		chose_item.setForeground(Color.WHITE);

		top = new JPanel();//top panel whicl shows jcombobox
		top.setBackground(NAVY);
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
		flow.setHgap(40);
		top.setLayout(flow);
		top.add(chose_item);
		top.add(cb);

		Font fntt = new Font("Calibri",Font.BOLD,60);
		Font fnt = new Font("Calibri",Font.BOLD,30);

		item = new JLabel("Item");
		item.setFont(fntt);
		item.setForeground(NAVY);
		
		rate = new JLabel("Rate");
		rate.setFont(fntt);
		rate.setForeground(NAVY);

		item1 = new JLabel("Zinger Burger");
		item1.setFont(fnt);
		item1.setForeground(NAVY);
		
		rate1 = new JLabel("180/=");
		rate1.setFont(fnt);
		rate1.setForeground(NAVY);
		
		item2 = new JLabel("Pizza Mini");
		item2.setFont(fnt);
		item2.setForeground(NAVY);
		
		rate2 = new JLabel("600/=");
		rate2.setFont(fnt);
		rate2.setForeground(NAVY);
		
		item3 = new JLabel("Pizza Medium");
		item3.setFont(fnt);
		item3.setForeground(NAVY);
		
		rate3 = new JLabel("800/=");
		rate3.setFont(fnt);
		rate3.setForeground(NAVY);
		
		item4 = new JLabel("Pizza Large");
		item4.setFont(fnt);
		item4.setForeground(NAVY);

		rate4 = new JLabel("1050/==");
		rate4.setFont(fnt);
		rate4.setForeground(NAVY);
		
		item5 = new JLabel("Shuwarma");
		item5.setFont(fnt);
		item5.setForeground(NAVY);

		rate5 = new JLabel("60/=");
		rate5.setFont(fnt);
		rate5.setForeground(NAVY);

		item6 = new JLabel();
		item6.setFont(fnt);

		rate6 = new JLabel();
		rate6.setFont(fnt);
	
		item7 = new JLabel();
		item7.setFont(fnt);
	
		rate7 = new JLabel();
		rate7.setFont(fnt);
		
		inside = new JPanel();
		inside.setBackground(SILVER);
		inside.setLayout(new GridLayout(10,2,70,0));
		inside.add(item);
		inside.add(rate);
		inside.add(item1);
		inside.add(rate1);
		inside.add(item2);
		inside.add(rate2);
		inside.add(item3);
		inside.add(rate3);
		inside.add(item4);
		inside.add(rate4);
		inside.add(item5);
		inside.add(rate5);
		inside.add(item6);
		inside.add(rate6);
		inside.add(item7);
		inside.add(rate7);
		

		center = new JPanel();
		center.add(inside,BorderLayout.CENTER);
		center.add(inside);
		center.setBackground(SILVER);

		bottom = new JPanel();
		bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		bottom.add(back);
		bottom.setBackground(SILVER);
		sp = new JScrollPane(center);
		c = frame.getContentPane();
		c.add(top,BorderLayout.PAGE_START);
		c.add(bottom,BorderLayout.PAGE_END);
		c.add(sp,BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
	}
	public void back_action(ActionEvent event){
		frame.dispose();
		Home h = new Home();
	}
	public void itemStateChanged(ItemEvent event){
		String s = (String)cb.getSelectedItem();
		if(s=="Fast Food"){
			center.setBackground(SILVER);
			inside.setBackground(SILVER);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Zinger");
		item1.setForeground(NAVY);
		item2.setText("Pizza Mini");
		item2.setForeground(NAVY);
		item3.setText("Pizza Medium");
		item3.setForeground(NAVY);
		item4.setText("Pizza Large");
		item4.setForeground(NAVY);
		item5.setText("Shuwarma");
		item5.setForeground(NAVY);
		rate1.setText("180/=");
		rate1.setForeground(NAVY);
		rate2.setText("600/=");
		rate2.setForeground(NAVY);
		rate3.setText("800/=");
		rate3.setForeground(NAVY);
		rate4.setText("1000/=");
		rate4.setForeground(NAVY);
		rate5.setText("100/=");
		rate5.setForeground(NAVY);
		bottom.setBackground(SILVER);
		item6.setText(null);
		item7.setText(null);
		rate6.setText(null);
		rate7.setText(null);
		}
		if(s == "Karhai"){
			center.setBackground(CORN_SILK);
			inside.setBackground(CORN_SILK);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Chicken Karhai");
		item1.setForeground(NAVY);
		item2.setText("Green Chicken Karhai");
		item2.setForeground(NAVY);
		item3.setText("Red Chicken Karhai");
		item3.setForeground(NAVY);
		item4.setText("Mutton Karhai");
		item4.setForeground(NAVY);
		item5.setText(null);
		rate1.setText("800/KG=");
		rate1.setForeground(NAVY);
		rate2.setText("850/KG=");
		rate2.setForeground(NAVY);
		rate3.setText("750/KG=");
		rate3.setForeground(NAVY);
		rate4.setText("1200/KG=");
		rate4.setForeground(NAVY);
		rate5.setText(null);
		bottom.setBackground(CORN_SILK);
		item6.setText(null);
		item7.setText(null);
		rate6.setText(null);
		rate7.setText(null);
		}
		if(s == "Naan"){
			center.setBackground(FLORAL_WHITE);
			inside.setBackground(FLORAL_WHITE);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Chapati");
		item1.setForeground(NAVY);
		item2.setText("Naan");
		item2.setForeground(NAVY);
		item3.setText("Taaftan");
		item3.setForeground(NAVY);
		item4.setText("Kulcha");
		item4.setForeground(NAVY);
		item5.setText(null);
		rate1.setText("15/=");
		rate1.setForeground(NAVY);
		rate2.setText("25/=");
		rate2.setForeground(NAVY);
		rate3.setText("30/=");
		rate3.setForeground(NAVY);
		rate4.setText("40/=");
		rate4.setForeground(NAVY);
		rate5.setText(null);
		bottom.setBackground(FLORAL_WHITE);
		item6.setText(null);
		item7.setText(null);
		rate6.setText(null);
		rate7.setText(null);
		}
		if(s == "Rice"){
			center.setBackground(AZURE);
			inside.setBackground(AZURE);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Biryani");
		item1.setForeground(NAVY);
		item2.setText("Fried Rice");
		item2.setForeground(NAVY);
		item3.setText("Chicken Pulao");
		item3.setForeground(NAVY);
		item4.setText("Beaf Pulao");
		item4.setForeground(NAVY);
		item5.setText("Chinese Rice");
		item5.setForeground(NAVY);
		rate1.setText("120/=");
		rate1.setForeground(NAVY);
		rate2.setText("100/=");
		rate2.setForeground(NAVY);
		rate3.setText("140/=");
		rate3.setForeground(NAVY);
		rate4.setText("180/=");
		rate4.setForeground(NAVY);
		rate5.setText("200/=");
		rate5.setForeground(NAVY);
		bottom.setBackground(AZURE);
		item6.setText(null);
		item7.setText(null);
		rate6.setText(null);
		rate7.setText(null);
		}
		if(s == "Vegetable"){
			center.setBackground(HONEY_DEW);
			inside.setBackground(HONEY_DEW);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Daal Chana");
		item1.setForeground(NAVY);
		item2.setText("Daal Masoor");
		item2.setForeground(NAVY);
		item3.setText("French Fries");
		item3.setForeground(NAVY);
		item4.setText("Salad");
		item4.setForeground(NAVY);
		item5.setText("Raaita");
		item5.setForeground(NAVY);
		rate1.setText("60/=");
		rate1.setForeground(NAVY);
		rate2.setText("80/=");
		rate2.setForeground(NAVY);
		rate3.setText("40/=");
		rate3.setForeground(NAVY);
		rate4.setText("30/=");
		rate4.setForeground(NAVY);
		rate5.setText("50/=");
		rate5.setForeground(NAVY);
		bottom.setBackground(HONEY_DEW);	
		item6.setText(null);
		item7.setText(null);
		rate6.setText(null);
		rate7.setText(null);
		
		}
		if(s == "Hot Drink"){
			center.setBackground(SNOW);
			inside.setBackground(SNOW);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Tea");
		item1.setForeground(NAVY);
		item2.setText("Green Tea");
		item2.setForeground(NAVY);
		item3.setText("Coffee");
		item3.setForeground(NAVY);
		item4.setText("Cold Coffee");
		item4.setForeground(NAVY);
		item5.setText(null);
		item5.setForeground(NAVY);
		rate1.setText("50/=");
		rate1.setForeground(NAVY);
		rate2.setText("50/=");
		rate2.setForeground(NAVY);
		rate3.setText("70/=");
		rate3.setForeground(NAVY);
		rate4.setText("80/=");
		rate4.setForeground(NAVY);
		rate5.setText(null);
		rate5.setForeground(NAVY);
		bottom.setBackground(SNOW);	
		item6.setText(null);
		item7.setText(null);
		rate6.setText(null);
		rate7.setText(null);
			
		}
		if(s == "Cold Drink"){
			center.setBackground(Color.WHITE);
			inside.setBackground(Color.WHITE);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Regular");
		item1.setForeground(NAVY);
		item2.setText("Sting");
		item2.setForeground(NAVY);
		item3.setText("Half Liter");
		item3.setForeground(NAVY);
		item4.setText("One Liter");
		item4.setForeground(NAVY);
		item5.setText("Jumbo");
		item5.setForeground(NAVY);
		rate1.setText("30/=");
		rate1.setForeground(NAVY);
		rate2.setText("40/=");
		rate2.setForeground(NAVY);
		rate3.setText("50/=");
		rate3.setForeground(NAVY);
		rate4.setText("100/=");
		rate4.setForeground(NAVY);
		rate5.setText("130/=");
		rate5.setForeground(NAVY);
		item6.setText(null);
		item7.setText(null);
		rate6.setText(null);
		rate7.setText(null);
		bottom.setBackground(Color.WHITE);	
		}
		if(s == "Fresh Juice"){
			center.setBackground(LIGHT_YELLOW);
			inside.setBackground(LIGHT_YELLOW);
			item.setForeground(NAVY);
			rate.setForeground(NAVY);
		item1.setText("Banana Shack");
		item1.setForeground(NAVY);
		item2.setText("Mango Shack");
		item2.setForeground(NAVY);
		item3.setText("Cheekoo Shack");
		item3.setForeground(NAVY);
		item4.setText("Choco Shack");
		item4.setForeground(NAVY);
		item5.setText("Apple Shack");
		item5.setForeground(NAVY);
		item6.setText("StrawBerry Shack");
		item6.setForeground(NAVY);
		item7.setText("Flavoured Milk");
		item7.setForeground(NAVY);
		rate1.setText("60/=");
		rate1.setForeground(NAVY);
		rate2.setText("70/=");
		rate2.setForeground(NAVY);
		rate3.setText("70/=");
		rate3.setForeground(NAVY);
		rate4.setText("70/=");
		rate4.setForeground(NAVY);
		rate5.setText("80/=");
		rate5.setForeground(NAVY);
		rate6.setText("100/=");
		rate6.setForeground(NAVY);
		rate7.setText("40/=");
		rate7.setForeground(NAVY);
		bottom.setBackground(LIGHT_YELLOW);	

		}
	}
}