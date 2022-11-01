import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Order implements ItemListener{
	private BasicFrame frame,fr,billframe;
	private Container c,c2,c3;
	private JPanel top,middle,bottom,left,fr_panel_center,fr_panel_bottom,bill_panel,right;
	private JPanel mid1,mid2,mid3;
	private JButton back,order,reset,yes,no,checkrates;
	private ImageIcon image;
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
	private final Color NAVY = new Color(0,0,128);
	private final Color MID_NIGHT_BLUE = new Color(0,0,205);
	private final Color SILVER = new Color(192,192,192);
	public String getorder[] = new String[39];
	public float getor[] = new float[39];
	public String init = "0",bill,count;
	public int counter;
	private JLabel placeorder,billabel;
	public JCheckBox cbZinger,cbPizzamini,cbPizzamedium,cbPizzalarge,cbShuwarma;
	public JLabel lbZinger,lbPizzamini,lbPizzamedium,lbPizzalarge,lbShuwarma;
	public JTextField tfZinger,tfPizzamini,tfPizzamedium,tfPizzalarge,tfShuwarma;
	public JCheckBox cbChicKarhai,cbGreenCK,cbRedCK,cbMutKar;
	public JLabel lbChicKarhai,lbGreenCK,lbRedCK,lbMutKar;
	public JTextField tfChicKarhai,tfGreenCK,tfRedCK,tfMutKar;
	public JCheckBox cbChapati,cbNaan,cbTaftan,cbKulcha;
	public JLabel lbChapati,lbNaan,lbTaftan,lbKulcha;
	public JTextField tfChapati,tfNaan,tfTaftan,tfKulcha;
	public JCheckBox cbBiryani,cbFR,cbCP,cbBP,cbCR;
	public JLabel lbBiryani,lbFR,lbCP,lbBP,lbCR;
	public JTextField tfBiryani,tfFR,tfCP,tfBP,tfCR;
	public JCheckBox cbDalchna,cbDalMas,cbFrFries,cbSalad,cbRaita;
	public JLabel lbDalchna,lbDalMas,lbFrFries,lcbSalad,lbRaita;
	public JTextField tfDalchna,tfDalMas,tfFrFries,tfSalad,tfRaita;
	public JCheckBox cbTea,cbGrentea,cbCofe;
	public JLabel lbTea,lbGrentea,lbCofe;
	public JTextField tfTea,tfGrentea,tfCofe;
	public JCheckBox cbColCofe,cbReg,cbSti,cbHL,cbOL,cbJ,cbBS,cbMS,cbCheS,cbChos,cbAS,cbSS,cbFM;
	public JLabel lbColCofe,lbReg,lbSti,lbHL,lbOL,lbJ,lbBS,lbMS,lbCheS,lbChos,lbAS,lbSS,lbFM;
	public JTextField tfColCofe,tfReg,tfSti,tfHL,tfOL,tfJ,tfBS,tfMS,tfCheS,tfChos,tfAS,tfSS,tfFM;
	public JLabel l,l2,l3,ll,ll2,ll3,lll,lll2,lll3;
	public float sum;
	public float getrate[] ={180,600,800,1050,60,800,850,750,1200,15,25,30,40,120,100,140,180,200,60,80,40,30,50,50,50,70,80,30,40,50,100,130,60,70,70,70,80,100,40};

	Order(){
		frame = new BasicFrame("Place Your Order",1200,680);

		image = new ImageIcon("back.PNG");
		Font font = new Font("Comic Sans MS",Font.ITALIC,13);
		placeorder = new JLabel("Order Here");
		placeorder.setForeground(Color.WHITE);
		placeorder.setFont(new Font("Chiller",Font.BOLD,30));

		top = new JPanel();
		top.setBackground(NAVY);
		top.setLayout(new FlowLayout(FlowLayout.CENTER));
		top.add(placeorder);

		for(int l = 0;l<39;l++){
			getorder[l]=init;
			}

		cbZinger = new JCheckBox();
		cbZinger.setBackground(Color.WHITE);
		cbZinger.addItemListener(this);
		cbPizzamini = new JCheckBox();
		cbPizzamini.addItemListener(this);
		cbPizzamini.setBackground(Color.WHITE);
		cbPizzamedium = new JCheckBox();
		cbPizzamedium.addItemListener(this);
		cbPizzamedium.setBackground(Color.WHITE);
		cbPizzalarge = new JCheckBox();
		cbPizzalarge.addItemListener(this);
		cbPizzalarge.setBackground(Color.WHITE);
		cbShuwarma = new JCheckBox();
		cbShuwarma.addItemListener(this);
		cbShuwarma.setBackground(Color.WHITE);

		lbZinger = new JLabel("ZINGER");
		lbZinger.setFont(font);
		lbPizzamini = new JLabel("MINI PIZZA");
		lbPizzamini.setFont(font);
		lbPizzamedium = new JLabel("MEDIUM PIZZA");
		lbPizzamedium.setFont(font);
		lbPizzalarge = new JLabel("LARGE PIZZ");
		lbPizzalarge.setFont(font);
		lbShuwarma = new JLabel("SHAWARMA");
		lbShuwarma.setFont(font);

		Font font2= new Font("Ink Free",Font.BOLD,20);
		
		tfZinger = new JTextField();
		tfZinger.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfZinger.setEditable(false);
		tfPizzamini = new JTextField();
		tfPizzamini.setEditable(false);
		tfPizzamini.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfPizzamedium = new JTextField();
		tfPizzamedium.setEditable(false);
		tfPizzamedium.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfPizzalarge = new JTextField();
		tfPizzalarge.setEditable(false);
		tfPizzalarge.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfShuwarma = new JTextField();
		tfShuwarma.setEditable(false);
		tfShuwarma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfZinger.setFont(font2);
		tfPizzamini.setFont(font2);
		tfPizzamedium.setFont(font2);
		tfPizzalarge.setFont(font2);
		tfShuwarma.setFont(font2);

		cbChicKarhai = new JCheckBox();
		cbChicKarhai.setBackground(Color.WHITE);
		cbChicKarhai.addItemListener(this);
		cbGreenCK = new JCheckBox();
		cbGreenCK.setBackground(Color.WHITE);
		cbGreenCK.addItemListener(this);
		cbRedCK = new JCheckBox();
		cbRedCK.setBackground(Color.WHITE);
		cbRedCK.addItemListener(this);
		cbMutKar = new JCheckBox();
		cbMutKar.setBackground(Color.WHITE);
		cbMutKar.addItemListener(this);

		lbChicKarhai = new JLabel("CHICKEN KARHAI");
		lbChicKarhai.setFont(font);
		lbGreenCK = new JLabel("GREEN KARHAI");
		lbGreenCK.setFont(font);
		lbRedCK = new JLabel("RED KARHAI");
		lbRedCK.setFont(font);
		lbMutKar = new JLabel("MUTTON KARHAI");
		lbMutKar.setFont(font);

		tfChicKarhai = new JTextField();
		tfChicKarhai.setEditable(false);
		tfGreenCK = new JTextField();
		tfGreenCK.setEditable(false);
		tfRedCK = new JTextField();
		tfRedCK.setEditable(false);
		tfMutKar = new JTextField();
		tfMutKar.setEditable(false);
		tfChicKarhai.setFont(font2);
		tfGreenCK.setFont(font2);
		tfRedCK.setFont(font2);
		tfMutKar.setFont(font2);
		tfChicKarhai.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfGreenCK.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfRedCK.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfMutKar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});

		cbChapati = new JCheckBox();
		cbNaan = new JCheckBox();
		cbTaftan = new JCheckBox();
		cbKulcha = new JCheckBox();
		cbChapati.setBackground(Color.WHITE);
		cbNaan.setBackground(Color.WHITE);
		cbTaftan.setBackground(Color.WHITE);
		cbKulcha.setBackground(Color.WHITE);
		cbChapati.addItemListener(this);
		cbNaan.addItemListener(this);
		cbTaftan.addItemListener(this);
		cbKulcha.addItemListener(this);

		lbChapati = new JLabel("CHAPATI");
		lbNaan = new JLabel("NAAN");
		lbTaftan = new JLabel("TAAFTAN");
		lbKulcha = new JLabel("KULCHA");
		lbChapati.setFont(font);
		lbNaan.setFont(font);
		lbKulcha.setFont(font);
		lbTaftan.setFont(font);

		tfChapati = new JTextField();
		tfNaan = new JTextField();
		tfTaftan = new JTextField();
		tfKulcha = new JTextField();
		tfChapati.setEditable(false);
		tfNaan.setEditable(false);
		tfTaftan.setEditable(false);
		tfKulcha.setEditable(false);
		tfChapati.setFont(font2);
		tfNaan.setFont(font2);
		tfTaftan.setFont(font2);
		tfKulcha.setFont(font2);

		tfChapati.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfNaan.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfTaftan.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfKulcha.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		
/*
		tfZinger.setText("180/=");
		tfPizzamini.setText("600/=");
		tfPizzamedium.setText("800/=");
		tfPizzalarge.setText("1050/=");
		tfShuwarma.setText("60/=");
		tfChicKarhai.setText("800/KG=");
		tfGreenCK.setText("850/KG=");
		tfRedCK.setText("750/KG=");
		tfMutKar.setText("1200/KG=");
		tfChapati.setText("15/=");
		tfNaan.setText("25/=");
		tfTaftan.setText("30/=");
		tfKulcha.setText("40/=");
*/
		l = new JLabel("");
		l2 = new JLabel("");
		l3 = new JLabel("Quantity here");
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Consolas",Font.BOLD,15));
		mid1 = new JPanel();
		mid1.setBackground(Color.WHITE);
		mid1.setLayout(new GridLayout(14,3,10,10));
		mid1.add(l);
		mid1.add(l2);
		mid1.add(l3);
		mid1.add(cbZinger);
		mid1.add(lbZinger);
		mid1.add(tfZinger);
		mid1.add(cbPizzamini);
		mid1.add(lbPizzamini);
		mid1.add(tfPizzamini);
		mid1.add(cbPizzamedium);
		mid1.add(lbPizzamedium);
		mid1.add(tfPizzamedium);
		mid1.add(cbPizzalarge);
		mid1.add(lbPizzalarge);
		mid1.add(tfPizzalarge);
		mid1.add(cbShuwarma);
		mid1.add(lbShuwarma);
		mid1.add(tfShuwarma);
		mid1.add(cbChicKarhai);
		mid1.add(lbChicKarhai);
		mid1.add(tfChicKarhai);
		mid1.add(cbGreenCK);
		mid1.add(lbGreenCK);
		mid1.add(tfGreenCK);
		mid1.add(cbRedCK);
		mid1.add(lbRedCK);
		mid1.add(tfRedCK);
		mid1.add(cbMutKar);
		mid1.add(lbMutKar);
		mid1.add(tfMutKar);
		mid1.add(cbChapati);
		mid1.add(lbChapati);
		mid1.add(tfChapati);
		mid1.add(cbNaan);
		mid1.add(lbNaan);
		mid1.add(tfNaan);
		mid1.add(cbTaftan);
		mid1.add(lbTaftan);
		mid1.add(tfTaftan);
		mid1.add(cbKulcha);
		mid1.add(lbKulcha);
		mid1.add(tfKulcha);

		cbBiryani = new JCheckBox();
		cbBiryani.setBackground(Color.WHITE);
		cbBiryani.addItemListener(this);
		cbFR = new JCheckBox();
		cbFR.setBackground(Color.WHITE);
		cbFR.addItemListener(this);
		cbCP = new JCheckBox();
		cbCP.setBackground(Color.WHITE);
		cbCP.addItemListener(this);
		cbBP = new JCheckBox();
		cbBP.setBackground(Color.WHITE);
		cbBP.addItemListener(this);
		cbCR = new JCheckBox();
		cbCR.setBackground(Color.WHITE);
		cbCR.addItemListener(this);

		lbBiryani = new JLabel("BIRYANI");
		lbFR = new JLabel("FRIED RICE");
		lbCP = new JLabel("CHICKEN PULAO");
		lbBP = new JLabel("BEAF PULAO");
		lbCR = new JLabel("CHINEESE RICE");
		lbBiryani.setFont(font); 
		lbFR.setFont(font);
		lbCP.setFont(font);
		lbBP.setFont(font);
		lbCR.setFont(font);

		tfBiryani = new JTextField();
		tfFR = new JTextField();
		tfCP = new JTextField();
		tfBP = new JTextField();
		tfCR = new JTextField();
		tfBiryani.setEditable(false);
		tfBiryani.setFont(font2);
		tfFR.setEditable(false);
		tfFR.setFont(font2);
		tfCP.setEditable(false);
		tfCP.setFont(font2);
		tfBP.setEditable(false);
		tfBP.setFont(font2);
		tfCR.setEditable(false);
		tfCR.setFont(font2);

		tfBiryani.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfFR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfCP.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfBP.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfCR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});

		cbDalchna =new JCheckBox();
		cbDalMas =new JCheckBox();
		cbFrFries =new JCheckBox();
		cbSalad =new JCheckBox();
		cbRaita =new JCheckBox();
		cbDalchna.setBackground(Color.WHITE);
		cbDalMas.setBackground(Color.WHITE);
		cbFrFries.setBackground(Color.WHITE);
		cbSalad.setBackground(Color.WHITE);
		cbRaita.setBackground(Color.WHITE);
		cbDalchna.addItemListener(this);
		cbDalMas.addItemListener(this);
		cbFrFries.addItemListener(this);
		cbSalad.addItemListener(this);
		cbRaita.addItemListener(this);
		
		lbDalchna = new JLabel("DAAL CHANA");
		lbDalMas = new JLabel("DAAL MASH");
		lbFrFries = new JLabel("FRENCH FRIES");
		lcbSalad = new JLabel("SALAD");
		lbRaita = new JLabel("RAITA");
		lbDalchna.setFont(font);
		lbDalMas.setFont(font);
		lbFrFries.setFont(font);
		lcbSalad.setFont(font);
		lbRaita.setFont(font);
		
		tfDalchna = new JTextField();
		tfDalMas = new JTextField();
		tfFrFries = new JTextField();
		tfSalad = new JTextField();
		tfRaita = new JTextField();
		tfDalchna.setEditable(false);
		tfDalMas.setEditable(false);
		tfFrFries.setEditable(false);
		tfSalad.setEditable(false);
		tfRaita.setEditable(false);
		tfDalchna.setFont(font2);
		tfDalMas.setFont(font2);
		tfFrFries.setFont(font2);
		tfSalad.setFont(font2);
		tfRaita.setFont(font2);

		tfDalchna.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfDalMas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfFrFries.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfSalad.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfRaita.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});

		cbTea = new JCheckBox();
		cbGrentea = new JCheckBox();
		cbCofe = new JCheckBox();
		cbTea.setBackground(Color.WHITE);
		cbGrentea.setBackground(Color.WHITE);
		cbCofe.setBackground(Color.WHITE);
		cbTea.addItemListener(this);
		cbGrentea.addItemListener(this);
		cbCofe.addItemListener(this);
		
		lbTea = new JLabel("TEA");
		lbGrentea = new JLabel("GREEN TEA");
		lbCofe = new JLabel("COFFEE");
		lbTea.setFont(font);
		lbGrentea.setFont(font);
		lbCofe.setFont(font);

		
		tfTea = new JTextField();
		tfGrentea = new JTextField();
		tfCofe = new JTextField();
		tfTea.setEditable(false);
		tfGrentea.setEditable(false);
		tfCofe.setEditable(false);
		tfTea.setFont(font2);
		tfGrentea.setFont(font2);
		tfCofe.setFont(font2);

		tfTea.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfGrentea.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		tfCofe.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
/*

	tfBiryani.setText("120/=");
	tfFR.setText("100/=");
	tfCP.setText("140/=");
	tfBP.setText("180/=");
	tfCR.setText("200/=");
	tfDalchna.setText("60/=");
	tfDalMas.setText("80/=");
	tfFrFries.setText("40/=");
	tfSalad.setText("30/=");
	tfRaita.setText("50/=");
	tfTea.setText("50/=");
	tfGrentea.setText("50/=");
	tfCofe.setText("70/=");
*/		
		mid2 = new JPanel();
		mid2.setBackground(Color.WHITE);
		mid2.setLayout(new GridLayout(14,3,10,10));
		ll = new JLabel("");
		ll2 = new JLabel("");
		ll3 = new JLabel("Quantity here");
		ll3.setForeground(Color.RED);
		ll3.setFont(new Font("Consolas",Font.BOLD,15));
		mid2.add(ll);
		mid2.add(ll2);
		mid2.add(ll3);
		mid2.add(cbBiryani);//1
		mid2.add(lbBiryani);//2
		mid2.add(tfBiryani);//3
		mid2.add(cbFR);//4
		mid2.add(lbFR);//5
		mid2.add(tfFR);//6
		mid2.add(cbCP);//7
		mid2.add(lbCP);//8
		mid2.add(tfCP);//9
		mid2.add(cbBP);//10
		mid2.add(lbBP);//11
		mid2.add(tfBP);//12
		mid2.add(cbCR);//13
		mid2.add(lbCR);//14
		mid2.add(tfCR);//15
		mid2.add(cbDalchna);//16
		mid2.add(lbDalchna);//17
		mid2.add(tfDalchna);//18
		mid2.add(cbDalMas);//19
		mid2.add(lbDalMas);//20
		mid2.add(tfDalMas);//21
		mid2.add(cbFrFries);//22
		mid2.add(lbFrFries);//23
		mid2.add(tfFrFries);//24
		mid2.add(cbSalad);//25
		mid2.add(lcbSalad);//26
		mid2.add(tfSalad);//27
		mid2.add(cbRaita);//28
		mid2.add(lbRaita);//29
		mid2.add(tfRaita);//30
		mid2.add(cbTea);//31
		mid2.add(lbTea);//32
		mid2.add(tfTea);//33
		mid2.add(cbGrentea);//34
		mid2.add(lbGrentea);//35
		mid2.add(tfGrentea);//36
		mid2.add(cbCofe);//37
		mid2.add(lbCofe);//38
		mid2.add(tfCofe);//39

	cbColCofe = new JCheckBox();
	cbReg = new JCheckBox();
	cbSti = new JCheckBox();
	cbHL = new JCheckBox();
	cbOL = new JCheckBox();
	cbJ = new JCheckBox();
	cbBS = new JCheckBox();
	cbMS = new JCheckBox();
	cbCheS = new JCheckBox();
	cbChos = new JCheckBox();
	cbAS = new JCheckBox();
	cbSS = new JCheckBox();
	cbFM = new JCheckBox();
	cbColCofe.setBackground(Color.WHITE);
	cbReg.setBackground(Color.WHITE);
	cbSti.setBackground(Color.WHITE);
	cbHL.setBackground(Color.WHITE);
	cbOL.setBackground(Color.WHITE);
	cbJ.setBackground(Color.WHITE);
	cbBS.setBackground(Color.WHITE);
	cbMS.setBackground(Color.WHITE);
	cbCheS.setBackground(Color.WHITE);
	cbChos.setBackground(Color.WHITE);
	cbAS.setBackground(Color.WHITE);
	cbSS.setBackground(Color.WHITE);
	cbFM.setBackground(Color.WHITE);
	cbColCofe.addItemListener(this);
	cbReg.addItemListener(this);
	cbSti.addItemListener(this);
	cbHL.addItemListener(this);
	cbOL.addItemListener(this);
	cbJ.addItemListener(this);
	cbBS.addItemListener(this);
	cbMS.addItemListener(this);
	cbCheS.addItemListener(this);
	cbChos.addItemListener(this);
	cbAS.addItemListener(this);
	cbSS.addItemListener(this);
	cbFM.addItemListener(this);
//Labels
	lbColCofe = new JLabel("COLD COFFEE");
	lbReg = new JLabel("REGULAR");
	lbSti = new JLabel("STING");
	lbHL = new JLabel("HALF LITER");
	lbOL = new JLabel("ONE LITER");
	lbJ = new JLabel("JUMBO");
	lbBS = new JLabel("BANANA SHAKE");
	lbMS = new JLabel("MANGO SHAKE");
	lbCheS = new JLabel("CHEEKOO SHAKE");
	lbChos = new JLabel("CHOCOLATE SHAKE");
	lbAS = new JLabel("APPLE SHAKE");
	lbSS = new JLabel("STRAWBERRY SHAKE");
	lbFM = new JLabel("FLAVOURED MILK");
	lbColCofe.setFont(font);
	lbReg.setFont(font);
	lbSti.setFont(font);
	lbHL.setFont(font);
	lbOL.setFont(font);
	lbJ.setFont(font);
	lbBS.setFont(font);
	lbMS.setFont(font);
	lbCheS.setFont(font);
	lbChos.setFont(font);
	lbAS.setFont(font);
	lbSS.setFont(font);
	lbFM.setFont(font);
//textFields
	tfColCofe = new JTextField();
	tfReg = new JTextField();
	tfSti = new JTextField();
	tfHL = new JTextField();
	tfOL = new JTextField();
	tfJ = new JTextField();
	tfBS = new JTextField();
	tfMS = new JTextField();
	tfCheS = new JTextField();
	tfChos = new JTextField();
	tfAS = new JTextField();
	tfSS = new JTextField();
	tfFM = new JTextField();

	tfColCofe.setEditable(false);
	tfReg.setEditable(false);
	tfSti.setEditable(false);
	tfHL.setEditable(false);
	tfOL.setEditable(false);
	tfJ.setEditable(false);
	tfBS.setEditable(false);
	tfMS.setEditable(false);
	tfCheS.setEditable(false);
	tfChos.setEditable(false);
	tfAS.setEditable(false);
	tfSS.setEditable(false);
	tfFM.setEditable(false);

	tfColCofe.setFont(font2);
	tfReg.setFont(font2);
	tfSti.setFont(font2);
	tfHL.setFont(font2);
	tfOL.setFont(font2);
	tfJ.setFont(font2);
	tfBS.setFont(font2);
	tfMS.setFont(font2);
	tfCheS.setFont(font2);
	tfChos.setFont(font2);
	tfAS.setFont(font2);
	tfSS.setFont(font2);
	tfFM.setFont(font2);

	tfColCofe.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfReg.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfSti.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfHL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfOL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfJ.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfBS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfMS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfCheS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfChos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfAS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfSS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	tfFM.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
	
/*	
	tfColCofe.setText("80/=");
	tfReg.setText("30/=");
	tfSti.setText("40/=");
	tfHL.setText("50/=");
	tfOL.setText("100/=");
	tfJ.setText("130/=");
	tfBS.setText("60/=");
	tfMS.setText("70/=");
	tfCheS.setText("70/=");
	tfChos.setText("70/=");
	tfAS.setText("80/=");
	tfSS.setText("100/=");
	tfFM.setText("40/=");
*/	
		mid3 = new JPanel();
		mid3.setBackground(Color.WHITE);
		mid3.setLayout(new GridLayout(14,3,10,10));

		lll = new JLabel("COLD DRINKS  &");
		lll2 = new JLabel("SHAKES");
		lll3 = new JLabel("Quantity here");
		lll.setForeground(Color.BLACK);
		lll2.setForeground(Color.BLACK);
		lll3.setForeground(Color.RED);
		lll.setFont(new Font("Consolas",Font.BOLD,15));
		lll2.setFont(new Font("Consolas",Font.BOLD,15));
		lll3.setFont(new Font("Consolas",Font.BOLD,15));
		mid3.add(lll);
		mid3.add(lll2);
		mid3.add(lll3);
		mid3.add(cbColCofe);//1
		mid3.add(lbColCofe);//2
		mid3.add(tfColCofe);//3
		mid3.add(cbReg);//1 2
		mid3.add(lbReg);//2
		mid3.add(tfReg);//3
		mid3.add(cbSti);//1 3
		mid3.add(lbSti);//2
		mid3.add(tfSti);//3
		mid3.add(cbHL);//1 4
		mid3.add(lbHL);//2
		mid3.add(tfHL);//3
		mid3.add(cbOL);//1 5
		mid3.add(lbOL);//2
		mid3.add(tfOL);//3
		mid3.add(cbJ);//1 6
		mid3.add(lbJ);//2
		mid3.add(tfJ);//3
		mid3.add(cbBS);//1 7
		mid3.add(lbBS);//2
		mid3.add(tfBS);//3
		mid3.add(cbMS);//1 8
		mid3.add(lbMS);//2
		mid3.add(tfMS);//3
		mid3.add(cbCheS);//1 9
		mid3.add(lbCheS);//2
		mid3.add(tfCheS);//3
		mid3.add(cbChos);//1 10
		mid3.add(lbChos);//2
		mid3.add(tfChos);//3
		mid3.add(cbAS);//1 11
		mid3.add(lbAS);//2
		mid3.add(tfAS);//3
		mid3.add(cbSS);//1 12
		mid3.add(lbSS);//2
		mid3.add(tfSS);//3
		mid3.add(cbFM);//1 13
		mid3.add(lbFM);//2
		mid3.add(tfFM);//3
		middle = new JPanel();
		//middle.setBackground(LIGHT_YELLOW);
		middle.setBackground(SILVER);
		middle.setLayout(new GridLayout(1,3,10,0));
		middle.add(mid1);
		middle.add(mid2);
		middle.add(mid3);

		back = new JButton(image);//creating button for back
		back.setBackground(Color.WHITE);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				back_action(event);
			}
		});

		order = new JButton("ORDER");
		order.setBackground(Color.WHITE);
		//order.setForeground(VERY_LIGHT_BLUE);
		order.setForeground(NAVY);
		order.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action(event);
			}
		});
		reset = new JButton("RESET");
		reset.setBackground(Color.WHITE);
		reset.setForeground(NAVY);
		//reset.setForeground(VERY_LIGHT_BLUE);
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				reset_action(event);
			}
		});

		bottom = new JPanel();
		bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		//bottom.setBackground(GOLD);
		bottom.setBackground(SILVER);
		bottom.add(order);
		bottom.add(reset);
			

		left = new JPanel();
		left.setLayout(new FlowLayout(FlowLayout.RIGHT));
		left.add(back);
//		left.setBackground(LIGHT_YELLOW);
		left.setBackground(SILVER);

		
		c = frame.getContentPane();
		c.add(top,BorderLayout.PAGE_START);
		c.add(middle,BorderLayout.CENTER);
		c.add(bottom,BorderLayout.PAGE_END);
		c.add(left,BorderLayout.LINE_START);
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	//Button Action Listener
	public void back_action(ActionEvent event){
		frame.dispose();
		Home h = new Home();
	}	//end of action listener
	//Check Box Item Listener
	//action listener for order button
	public void itemStateChanged(ItemEvent event){
		if(cbZinger.isSelected()==true){//1
			tfZinger.setEditable(true);
		//	tfZinger.setText(null);
			
		}
		if(cbZinger.isSelected()==false){//2
			//tfZinger.setText("180/=");
			tfZinger.setText(null);
			tfZinger.setEditable(false);
		}
		if(cbPizzamini.isSelected()){//3
			tfPizzamini.setEditable(true);
			//tfPizzamini.setText(null);
		}
		if(cbPizzamini.isSelected()==false){//4
			//tfPizzamini.setText("600/=");
			tfPizzamini.setEditable(false);
			tfPizzamini.setText(null);
		}
		if(cbPizzamedium.isSelected()){//5
			tfPizzamedium.setEditable(true);
			//tfPizzamedium.setText(null);
		}
		if(cbPizzamedium.isSelected()==false){//6
			//tfPizzamedium.setText("800/=");
			tfPizzamedium.setEditable(false);
			tfPizzamedium.setText(null);
		}
		if(cbPizzalarge.isSelected()){//7
			tfPizzalarge.setEditable(true);
			//tfPizzalarge.setText(null);
		}
		if(cbPizzalarge.isSelected()==false){//8
		//	tfPizzalarge.setText("1050/=");
			tfPizzalarge.setEditable(false);
			tfPizzalarge.setText(null);
		}
		if(cbShuwarma.isSelected()){//9
			tfShuwarma.setEditable(true);
			//tfShuwarma.setText(null);
		}
		if(cbShuwarma.isSelected()==false){//10
		//	tfShuwarma.setText("60/=");
			tfShuwarma.setText(null);
			tfShuwarma.setEditable(false);
		}
		if(cbChicKarhai.isSelected()){//11
			tfChicKarhai.setEditable(true);
			//tfChicKarhai.setText(null);
		}
		if(cbChicKarhai.isSelected()==false){//12
		//	tfChicKarhai.setText("800/KG=");
			tfChicKarhai.setText(null);
			tfChicKarhai.setEditable(false);
		}
		if(cbGreenCK.isSelected()){//13
			tfGreenCK.setEditable(true);
			//tfGreenCK.setText(null);
		}
		if(cbGreenCK.isSelected()==false){//14
			//tfGreenCK.setText("850/KG=");
			tfGreenCK.setText(null);
			tfGreenCK.setEditable(false);
		}
		if(cbRedCK.isSelected()){//15
			tfRedCK.setEditable(true);
			//tfRedCK.setText(null);
		}
		if(cbRedCK.isSelected()==false){//16
			//tfRedCK.setText("750/KG=");
			tfRedCK.setText(null);
			tfRedCK.setEditable(false);
		}
		if(cbMutKar.isSelected()){//17
			tfMutKar.setEditable(true);
			//tfMutKar.setText(null);
		}
		if(cbMutKar.isSelected()==false){//18
			//tfMutKar.setText("1200/KG=");
			tfMutKar.setText(null);
			tfMutKar.setEditable(false);
		}
		if(cbChapati.isSelected()){//19
			tfChapati.setEditable(true);
			//tfChapati.setText(null);
		}
		if(cbChapati.isSelected()==false){//20
		//	tfChapati.setText("15/=");
			tfChapati.setText(null);
			tfChapati.setEditable(false);
		}
		if(cbNaan.isSelected()){//21
			tfNaan.setEditable(true);
			//tfNaan.setText(null);
		}
		if(cbNaan.isSelected()==false){//22
		//	tfNaan.setText("25/=");
			tfNaan.setText(null);
			tfNaan.setEditable(false);
		}
		if(cbTaftan.isSelected()){//23
			tfTaftan.setEditable(true);
			//tfTaftan.setText(null);
		}
		if(cbTaftan.isSelected()==false){//24
			//tfTaftan.setText("30/=");
			tfTaftan.setText(null);
			tfTaftan.setEditable(false);
		}
		if(cbKulcha.isSelected()){//25
			tfKulcha.setEditable(true);
			//tfKulcha.setText(null);
		}
		if(cbKulcha.isSelected()==false){//26
		//	tfKulcha.setText("40/=");
			tfKulcha.setText(null);
			tfKulcha.setEditable(false);
		}
		if(cbBiryani.isSelected()){//27
			tfBiryani.setEditable(true);
		//	tfBiryani.setText(null);
		}
		if(cbBiryani.isSelected()==false){//28
		//	tfBiryani.setText("120/=");
			tfBiryani.setText(null);
			tfBiryani.setEditable(false);
		}
		if(cbFR.isSelected()){//29fried rice
			tfFR.setEditable(true);
			//tfFR.setText(null);
		}
		if(cbFR.isSelected()==false){//30fried rice
		//	tfFR.setText("100/=");
			tfFR.setText(null);
			tfFR.setEditable(false);
		}
		if(cbCP.isSelected()){//31 chicken pulao
			tfCP.setEditable(true);
			//tfCP.setText(null);
		}
		if(cbCP.isSelected()==false){//32 chicken pulao
			//tfCP.setText("140/=");
			tfCP.setText(null);
			tfCP.setEditable(false);
		}
		if(cbBP.isSelected()){//33 beaf pulao
			tfBP.setEditable(true);
			//tfBP.setText(null);
		}
		if(cbBP.isSelected()==false){//34 beaf pulao
			//tfBP.setText("180/=");
			tfBP.setText(null);
			tfBP.setEditable(false);	
		}
		if(cbCR.isSelected()){//35
			tfCR.setEditable(true);
			//tfCR.setText(null);
		}
		if(cbCR.isSelected()==false){//36
			//tfCR.setText("200/=");
			tfCR.setText(null);
			tfCR.setEditable(false);
		}
		if(cbDalchna.isSelected()){//37
			tfDalchna.setEditable(true);
			//tfDalchna.setText(null);
		}
		if(cbDalchna.isSelected()==false){//38
		//	tfDalchna.setText("60/=");
			tfDalchna.setText(null);
			tfDalchna.setEditable(false);
		}
		if(cbDalMas.isSelected()){//39
			tfDalMas.setEditable(true);
			//tfDalMas.setText(null);
		}
		if(cbDalMas.isSelected()==false){//40
		//	tfDalMas.setText("80/=");
			tfDalMas.setText(null);
			tfDalMas.setEditable(false);
		}
		if(cbFrFries.isSelected()){//41
			tfFrFries.setEditable(true);
			//tfFrFries.setText(null);
		}
		if(cbFrFries.isSelected()==false){//42
		//	tfFrFries.setText("40/=");
			tfFrFries.setText(null);
			tfFrFries.setEditable(false);
		}
		if(cbSalad.isSelected()){//43
			tfSalad.setEditable(true);
			//tfSalad.setText(null);
		}
		if(!cbSalad.isSelected()){//44
			//tfSalad.setText("30/=");
			tfSalad.setText(null);
			tfSalad.setEditable(false);
		}
		if(cbRaita.isSelected()){//45
			tfRaita.setEditable(true);
			//tfRaita.setText(null);
		}
		if(!cbRaita.isSelected()){//46
			//tfRaita.setText("50/=");
			tfRaita.setText(null);
			tfRaita.setEditable(false);
		}
		if(cbTea.isSelected()){//47
			tfTea.setEditable(true);
			//tfTea.setText(null);
		}
		if(!cbTea.isSelected()){//48
		//	tfTea.setText("50/=");
			tfTea.setText(null);
			tfTea.setEditable(false);
		}
		if(cbGrentea.isSelected()){//49
			tfGrentea.setEditable(true);
			//tfGrentea.setText(null);
		}
		if(!cbGrentea.isSelected()){//50
		//	tfGrentea.setText("50/=");
			tfGrentea.setText(null);
			tfGrentea.setEditable(false);
		}
		if(cbCofe.isSelected()){//51
			tfCofe.setEditable(true);
			//tfCofe.setText(null);
		}
		if(!cbCofe.isSelected()){//52
			//tfCofe.setText("70/=");
			tfCofe.setText(null);
			tfCofe.setEditable(false);
		}
		if(cbColCofe.isSelected()){//53
			tfColCofe.setEditable(true);
			//tfColCofe.setText(null);
		}
		if(!cbColCofe.isSelected()){//54
			//tfColCofe.setText("80/=");
			tfColCofe.setText(null);
			tfColCofe.setEditable(false);
		}
		if(cbReg.isSelected()){//55
			tfReg.setEditable(true);
			//tfReg.setText(null);
		}
		if(!cbReg.isSelected()){//56
			//tfReg.setText("30/=");
			tfReg.setText(null);
			tfReg.setEditable(false);
		}
		if(cbSti.isSelected()){//57
			tfSti.setEditable(true);
			//tfSti.setText(null);
		}
		if(!cbSti.isSelected()){//58
			//tfSti.setText("40/=");
			tfSti.setText(null);
			tfSti.setEditable(false);
		}
		if(cbHL.isSelected()){//59
			tfHL.setEditable(true);
			//tfHL.setText(null);
		}
		if(!cbHL.isSelected()){//60
		//	tfHL.setText("50/=");
			tfHL.setText(null);
			tfHL.setEditable(false);
		}
		if(cbOL.isSelected()){//61
			//tfOL.setText(null);
			tfOL.setEditable(true);
		}
		if(!cbOL.isSelected()){//62
			//tfOL.setText("100/=");
			tfOL.setText(null);
			tfOL.setEditable(false);
		}
		if(cbJ.isSelected()){//63
			//tfJ.setText(null);
			tfJ.setEditable(true);
		}
		if(!cbJ.isSelected()){//64
			//tfJ.setText("130/=");
			tfJ.setText(null);
			tfJ.setEditable(false);
		}
		if(cbBS.isSelected()){//65
			//tfBS.setText(null);
			tfBS.setEditable(true);
		}
		if(!cbBS.isSelected()){//66
			//tfBS.setText("60/=");
			tfBS.setText(null);
			tfBS.setEditable(false);
		}
		if(cbMS.isSelected()){//67
			//tfMS.setText(null);
			tfMS.setEditable(true);
		}
		if(!cbMS.isSelected()){//68
			//tfMS.setText("70/=");
			tfMS.setText(null);
			tfMS.setEditable(false);
		}
		if(cbCheS.isSelected()){//69
			//tfCheS.setText(null);
			tfCheS.setEditable(true);
		}
		if(!cbCheS.isSelected()){//70
			//tfCheS.setText("70/=");
			tfCheS.setText(null);
			tfCheS.setEditable(false);
		}
		if(cbChos.isSelected()){//71
			//tfChos.setText(null);
			tfChos.setEditable(true);
		}
		if(!cbChos.isSelected()){//72
			//tfChos.setText("70/=");
			tfChos.setText(null);
			tfChos.setEditable(false);
		}
		if(cbAS.isSelected()){//73
			//tfAS.setText(null);
			tfAS.setEditable(true);
		}
		if(!cbAS.isSelected()){//74
			//tfAS.setText("80/=");
			tfAS.setText(null);
			tfAS.setEditable(false);
		}
		if(cbSS.isSelected()){//75
			//tfSS.setText(null);
			tfSS.setEditable(true);
		}
		if(!cbSS.isSelected()){//76
			//tfSS.setText("100/=");
			tfSS.setText(null);
			tfSS.setEditable(false);
		}
		if(cbFM.isSelected()){//77
//			tfFM.setText(null);
			tfFM.setEditable(true);
		}
		if(!cbFM.isSelected()){//78
//			tfFM.setText("40/=");
			tfFM.setText(null);
			tfFM.setEditable(false);
		}
	}//end of item listener
	//it will chek if any text fiels has left empty
	public boolean isEmpty(){

		if(tfZinger.getText().equals("")&&cbZinger.isSelected()){return true;}
		else if(tfPizzamini.getText().equals("")&&cbPizzamini.isSelected()){return true;}
		else if(tfPizzamedium.getText().equals("")&&cbPizzamedium.isSelected()){return true;}
		else if(tfPizzalarge.getText().equals("")&&cbPizzalarge.isSelected()){return true;}
		else if(tfShuwarma.getText().equals("")&&cbShuwarma.isSelected()){return true;}
		else if(tfChicKarhai.getText().equals("")&&cbChicKarhai.isSelected()){return true;}
		else if(tfGreenCK.getText().equals("")&&cbGreenCK.isSelected()){return true;}
		else if(tfRedCK.getText().equals("")&&cbRedCK.isSelected()){return true;}
		else if(tfMutKar.getText().equals("")&&cbMutKar.isSelected()){return true;}
		else if(tfChapati.getText().equals("")&&cbChapati.isSelected()){return true;}
		else if(tfNaan.getText().equals("")&&cbNaan.isSelected()){return true;}
		else if(tfTaftan.getText().equals("")&&cbTaftan.isSelected()){return true;}
		else if(tfKulcha.getText().equals("")&&cbKulcha.isSelected()){return true;}
		else if(tfBiryani.getText().equals("")&&cbBiryani.isSelected()){return true;}
		else if(tfFR.getText().equals("")&&cbFR.isSelected()){return true;}
		else if(tfCP.getText().equals("")&&cbCP.isSelected()){return true;}
		else if(tfBP.getText().equals("")&&cbBP.isSelected()){return true;}
		else if(tfCR.getText().equals("")&&cbCR.isSelected()){return true;}
		else if(tfDalchna.getText().equals("")&&cbDalchna.isSelected()){return true;}
		else if(tfDalMas.getText().equals("")&&cbDalMas.isSelected()){return true;}
		else if(tfFrFries.getText().equals("")&&cbFrFries.isSelected()){return true;}
		else if(tfSalad.getText().equals("")&&cbSalad.isSelected()){return true;}
		else if(tfRaita.getText().equals("")&&cbRaita.isSelected()){return true;}
		else if(tfTea.getText().equals("")&&cbTea.isSelected()){return true;}
		else if(tfGrentea.getText().equals("")&&cbGrentea.isSelected()){return true;}
		else if(tfCofe.getText().equals("")&&cbCofe.isSelected()){return true;}
		else if(tfColCofe.getText().equals("")&&cbColCofe.isSelected()){return true;}
		else if(tfReg.getText().equals("")&&cbReg.isSelected()){return true;}
		else if(tfSti.getText().equals("")&&cbSti.isSelected()){return true;}
		else if(tfHL.getText().equals("")&&cbHL.isSelected()){return true;}
		else if(tfOL.getText().equals("")&&cbOL.isSelected()){return true;}
		else if(tfJ.getText().equals("")&&cbJ.isSelected()){return true;}
		else if(tfBS.getText().equals("")&&cbBS.isSelected()){return true;}
		else if(tfMS.getText().equals("")&&cbMS.isSelected()){return true;}
		else if(tfCheS.getText().equals("")&&cbCheS.isSelected()){return true;}
		else if(tfChos.getText().equals("")&&cbChos.isSelected()){return true;}
		else if(tfAS.getText().equals("")&&cbAS.isSelected()){return true;}
		else if(tfSS.getText().equals("")&&cbSS.isSelected()){return true;}
		else if(tfFM.getText().equals("")&&cbFM.isSelected()){return true;}
			else{return false;}	

	}//nd of is empty
	public boolean isNoItemSelected(){
		int c=0;
		if(cbZinger.isSelected()){c+=1;}
		if(cbPizzamini.isSelected()){c+=1;}
		if(cbPizzamedium.isSelected()){c+=1;}
		if(cbPizzalarge.isSelected()){c+=1;}
		if(cbShuwarma.isSelected()){c+=1;}
		if(cbChicKarhai.isSelected()){c+=1;}
		if(cbGreenCK.isSelected()){c+=1;}
		if(cbRedCK.isSelected()){c+=1;}
		if(cbMutKar.isSelected()){c+=1;}
		if(cbChapati.isSelected()){c+=1;}
		if(cbNaan.isSelected()){c+=1;}
		if(cbTaftan.isSelected()){c+=1;}
		if(cbKulcha.isSelected()){c+=1;}
		if(cbBiryani.isSelected()){c+=1;}
		if(cbFR.isSelected()){c+=1;}
		if(cbCP.isSelected()){c+=1;}
		if(cbBP.isSelected()){c+=1;}
		if(cbCR.isSelected()){c+=1;}
		if(cbDalchna.isSelected()){c+=1;}
		if(cbDalMas.isSelected()){c+=1;}
		if(cbFrFries.isSelected()){c+=1;}
		if(cbSalad.isSelected()){c+=1;}
		if(cbRaita.isSelected()){c+=1;}
		if(cbTea.isSelected()){c+=1;}
		if(cbGrentea.isSelected()){c+=1;}
		if(cbCofe.isSelected()){c+=1;}
		if(cbColCofe.isSelected()){c+=1;}
		if(cbReg.isSelected()){c+=1;}
		if(cbSti.isSelected()){c+=1;}
		if(cbHL.isSelected()){c+=1;}
		if(cbOL.isSelected()){c+=1;}
		if(cbJ.isSelected()){c+=1;}
		if(cbBS.isSelected()){c+=1;}
		if(cbMS.isSelected()){c+=1;}
		if(cbCheS.isSelected()){c+=1;}
		if(cbChos.isSelected()){c+=1;}
		if(cbAS.isSelected()){c+=1;}
		if(cbSS.isSelected()){c+=1;}
		if(cbFM.isSelected()){c+=1;}
		
		if(c==0){
			return true;
		}
		else return false;
		

	}//end of isNoItemSelected() function
	public boolean isZero(){
		int d=0;
		if(tfZinger.getText().equals("0")){d+=1;}
		if(tfPizzamini.getText().equals("0")){d+=1;}
		if(tfPizzamedium.getText().equals("0")){d+=1;}
		if(tfPizzalarge.getText().equals("0")){d+=1;}
		if(tfShuwarma.getText().equals("0")){d+=1;}
		if(tfChicKarhai.getText().equals("0")){d+=1;}
		if(tfGreenCK.getText().equals("0")){d+=1;}
		if(tfRedCK.getText().equals("0")){d+=1;}
		if(tfMutKar.getText().equals("0")){d+=1;}
		if(tfChapati.getText().equals("0")){d+=1;}
		if(tfNaan.getText().equals("0")){d+=1;}
		if(tfTaftan.getText().equals("0")){d+=1;}
		if(tfKulcha.getText().equals("0")){d+=1;}
		if(tfBiryani.getText().equals("0")){d+=1;}
		if(tfFR.getText().equals("0")){d+=1;}
		if(tfCP.getText().equals("0")){d+=1;}
		if(tfBP.getText().equals("0")){d+=1;}
		if(tfCR.getText().equals("0")){d+=1;}
		if(tfDalchna.getText().equals("0")){d+=1;}
		if(tfDalMas.getText().equals("0")){d+=1;}
		if(tfFrFries.getText().equals("0")){d+=1;}
		if(tfSalad.getText().equals("0")){d+=1;}
		if(tfRaita.getText().equals("0")){d+=1;}
		if(tfTea.getText().equals("0")){d+=1;}
		if(tfGrentea.getText().equals("0")){d+=1;}
		if(tfCofe.getText().equals("0")){d+=1;}
		if(tfColCofe.getText().equals("0")){d+=1;}
		if(tfReg.getText().equals("0")){d+=1;}
		if(tfSti.getText().equals("0")){d+=1;}
		if(tfHL.getText().equals("0")){d+=1;}
		if(tfOL.getText().equals("0")){d+=1;}
		if(tfJ.getText().equals("0")){d+=1;}
		if(tfBS.getText().equals("0")){d+=1;}
		if(tfMS.getText().equals("0")){d+=1;}
		if(tfCheS.getText().equals("0")){d+=1;}
		if(tfChos.getText().equals("0")){d+=1;}
		if(tfAS.getText().equals("0")){d+=1;}
		if(tfSS.getText().equals("0")){d+=1;}
		if(tfFM.getText().equals("0")){d+=1;}
		
		if(d!=0){
			return true;
		}		
		else return false;

	}//end of is zero

	public void order_action(ActionEvent event){
		fr = new BasicFrame("!Sure",400,120);
		counter = 0;
		fr_panel_bottom = new JPanel();
		fr_panel_bottom.setBackground(Color.WHITE);
		checkrates = new JButton("RATES?");
		no = new JButton("ORDER");
		yes = new JButton("BACK");
		JLabel warning = new JLabel("F");		
		
		if(isEmpty()){
			warning.setText("you have left somewhere empty space");
			no.setEnabled(false);
			warning.setForeground(Color.RED);
		}
			else if(isNoItemSelected()){
			warning.setText("You have not selected any item");
			warning.setForeground(Color.RED);
			no.setEnabled(false);
		}
				else if(isZero()){
					warning.setText("You have intered 0 somewhere");
					warning.setForeground(Color.RED);
					no.setEnabled(false);
				}
					else if(isInt()){
						warning.setText("You entered invalid quantity somewhere!");
						no.setEnabled(false);
					}
						else{no.setEnabled(true);
					
					for(int l = 0; l<39; l++){
			getorder[l] = init;
		}
		if(tfZinger.getText()!=null&&cbZinger.isSelected()){getorder[0] = tfZinger.getText();counter+=1;}
		if(tfPizzamini.getText()!=null&&cbPizzamini.isSelected()){getorder[1] = tfPizzamini.getText();counter+=1;}
		if(tfPizzamedium.getText()!=null&&cbPizzamedium.isSelected()){getorder[2] = tfPizzamedium.getText();counter+=1;}
		if(tfPizzalarge.getText()!=null&&cbPizzalarge.isSelected()){getorder[3] = tfPizzalarge.getText();counter+=1;}
		if(tfShuwarma.getText()!=null&&cbShuwarma.isSelected()){getorder[4] = tfShuwarma.getText();counter+=1;}
		if(tfChicKarhai.getText()!=null&&cbChicKarhai.isSelected()){getorder[5] = tfChicKarhai.getText();counter+=1;}
		if(tfGreenCK.getText()!=null&&cbGreenCK.isSelected()){getorder[6] = tfGreenCK.getText();counter+=1;}
		if(tfRedCK.getText()!=null&&cbRedCK.isSelected()){getorder[7] = tfRedCK.getText();counter+=1;}
		if(tfMutKar.getText()!=null&&cbMutKar.isSelected()){getorder[8] = tfMutKar.getText();counter+=1;}
		if(tfChapati.getText()!=null&&cbChapati.isSelected()){getorder[9] = tfChapati.getText();counter+=1;}
		if(tfNaan.getText()!=null&&cbNaan.isSelected()){getorder[10] = tfNaan.getText();counter+=1;}
		if(tfTaftan.getText()!=null&&cbTaftan.isSelected()){getorder[11] = tfTaftan.getText();counter+=1;}
		if(tfKulcha.getText()!=null&&cbKulcha.isSelected()){getorder[12] = tfKulcha.getText();counter+=1;}
		if(tfBiryani.getText()!=null&&cbBiryani.isSelected()){getorder[13] = tfBiryani.getText();counter+=1;}
		if(tfFR.getText()!=null&&cbFR.isSelected()){getorder[14] = tfFR.getText();counter+=1;}
		if(tfCP.getText()!=null&&cbCP.isSelected()){getorder[15] = tfCP.getText();counter+=1;}
		if(tfBP.getText()!=null&&cbBP.isSelected()){getorder[16] = tfBP.getText();counter+=1;}
		if(tfCR.getText()!=null&&cbCR.isSelected()){getorder[17] = tfCR.getText();counter+=1;}
		if(tfDalchna.getText()!=null&&cbDalchna.isSelected()){getorder[18] = tfDalchna.getText();counter+=1;}
		if(tfDalMas.getText()!=null&&cbDalMas.isSelected()){getorder[19] = tfDalMas.getText();counter+=1;}
		if(tfFrFries.getText()!=null&&cbFrFries.isSelected()){getorder[20] = tfFrFries.getText();counter+=1;}
		if(tfSalad.getText()!=null&&cbSalad.isSelected()){getorder[21] = tfSalad.getText();counter+=1;}
		if(tfRaita.getText()!=null&&cbRaita.isSelected()){getorder[22] = tfRaita.getText();counter+=1;}
		if(tfTea.getText()!=null&&cbTea.isSelected()){getorder[23] = tfTea.getText();counter+=1;}
		if(tfGrentea.getText()!=null&&cbGrentea.isSelected()){getorder[24] = tfGrentea.getText();counter+=1;}
		if(tfCofe.getText()!=null&&cbCofe.isSelected()){getorder[25] = tfCofe.getText();counter+=1;}
		if(tfColCofe.getText()!=null&&cbColCofe.isSelected()){getorder[26] = tfColCofe.getText();counter+=1;}
		if(tfReg.getText()!=null&&cbReg.isSelected()){getorder[27] = tfReg.getText();counter+=1;}
		if(tfSti.getText()!=null&&cbSti.isSelected()){getorder[28] = tfSti.getText();counter+=1;}
		if(tfHL.getText()!=null&&cbHL.isSelected()){getorder[29] = tfHL.getText();counter+=1;}
		if(tfOL.getText()!=null&&cbOL.isSelected()){getorder[30] = tfOL.getText();counter+=1;}
		if(tfJ.getText()!=null&&cbJ.isSelected()){getorder[31] = tfJ.getText();counter+=1;}
		if(tfBS.getText()!=null&&cbBS.isSelected()){getorder[32] = tfBS.getText();counter+=1;}
		if(tfMS.getText()!=null&&cbMS.isSelected()){getorder[33] = tfMS.getText();counter+=1;}
		if(tfCheS.getText()!=null&&cbCheS.isSelected()){getorder[34] = tfCheS.getText();counter+=1;}
		if(tfChos.getText()!=null&&cbChos.isSelected()){getorder[35] = tfChos.getText();counter+=1;}
		if(tfAS.getText()!=null&&cbAS.isSelected()){getorder[36] = tfAS.getText();counter+=1;}
		if(tfSS.getText()!=null&&cbSS.isSelected()){getorder[37] = tfSS.getText();counter+=1;}
		if(tfFM.getText()!=null&&cbFM.isSelected()){getorder[38] = tfFM.getText();counter+=1;}
		warning.setText("Are you sure! or do you want to check the rates");
		warning.setForeground(NAVY);

		}//end of else statement
		count = Integer.toString(counter);	
		fr_panel_center = new JPanel();
		fr_panel_center.setBackground(Color.WHITE);
		fr_panel_center.setLayout(new GridLayout(2,1,5,5));
		fr_panel_center.add(warning);
		c2 = fr.getContentPane();
		
		yes.setForeground(NAVY);
		yes.setBackground(Color.WHITE);
		yes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				back_action2(event);
			}
		});
	
		checkrates.setForeground(NAVY);
		checkrates.setBackground(Color.WHITE);
		checkrates.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				checkrates_action(event);
			}
		});
		
		no.setForeground(NAVY);
		no.setBackground(Color.WHITE);
		no.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				order_action2(event);
			}
		});
		fr_panel_bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		fr_panel_bottom.add(yes);
		fr_panel_bottom.add(checkrates);
		fr_panel_bottom.add(no);
		c2.add(fr_panel_center,BorderLayout.CENTER);
		c2.add(fr_panel_bottom,BorderLayout.PAGE_END);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}//end of order action listener
	//calculate bill
	public String get_calculated_bill(){
		sum = 0;
		for(int j=0;j<39;j++){
			try{
			getor[j] = Float.parseFloat(getorder[j]);
			sum+=getor[j]*getrate[j];
		}catch(Exception e){
			
		}
	}	bill = Float.toString(sum);
	return bill;
	//returns the calculated bill
}//end of calculate bill
	//back action of warning frame or fr
public boolean checkForInvalid(JTextField t, String s){
	try{
				int ss = Integer.parseInt(t.getText());
				return false;
		}catch(NumberFormatException e){
			return true;
		}
}//end of checkForInvalid
public boolean checkForInvalidFloat(JTextField t, String s){
	try{
		float ss = Float.parseFloat(t.getText());
		return false;
	}catch(NumberFormatException e){
		return true;
	}
}//end of checkForInvalidFloat method
public boolean isInt(){
	int a = 0;
	if(cbZinger.isSelected()&&checkForInvalid(tfZinger,tfZinger.getText())){
		a+=1;//1
	}
	if(cbPizzamini.isSelected()&&checkForInvalid(tfPizzamini,tfPizzamini.getText())){
		a+=1;//2
	}
	if(cbPizzamedium.isSelected()&&checkForInvalid(tfPizzamedium,tfPizzamedium.getText())){
		a+=1;//3
	}
	if(cbPizzalarge.isSelected()&&checkForInvalid(tfPizzalarge,tfPizzalarge.getText())){
		a+=1;//4
	}
	if(cbShuwarma.isSelected()&&checkForInvalid(tfShuwarma,tfShuwarma.getText())){
		a+=1;//5
	}
	if(cbChapati.isSelected()&&checkForInvalid(tfChapati,tfChapati.getText())){
		a+=1;//6
	}
	if(cbChicKarhai.isSelected()&&checkForInvalidFloat(tfChicKarhai,tfChicKarhai.getText())){
		a+=1;//7
	}
	if(cbRedCK.isSelected()&&checkForInvalidFloat(tfRedCK,tfRedCK.getText())){
		a+=1;//8
	}
	if(cbGreenCK.isSelected()&&checkForInvalidFloat(tfGreenCK,tfGreenCK.getText())){
		a+=1;//9
	}
	if(cbMutKar.isSelected()&&checkForInvalidFloat(tfMutKar,tfMutKar.getText())){
		a+=1;//10
	}
	if(cbNaan.isSelected()&&checkForInvalid(tfNaan,tfNaan.getText())){
		a+=1;//11
	}
	if(cbTaftan.isSelected()&&checkForInvalid(tfTaftan,tfTaftan.getText())){
		a+=1;//12
	}
	if(cbKulcha.isSelected()&&checkForInvalid(tfKulcha,tfKulcha.getText())){
		a+=1;//13
	}
	if(cbBiryani.isSelected()&&checkForInvalid(tfBiryani,tfBiryani.getText())){
		a+=1;//14
	}
	if(cbFR.isSelected()&&checkForInvalid(tfFR,tfFR.getText())){
		a+=1;//15
	}
	if(cbCP.isSelected()&&checkForInvalid(tfCP,tfCP.getText())){
		a+=1;//16
	}
	if(cbBP.isSelected()&&checkForInvalid(tfBP,tfBP.getText())){
		a+=1;//17
	}
	if(cbCR.isSelected()&&checkForInvalid(tfCR,tfCR.getText())){
		a+=1;//18
	}
	if(cbDalchna.isSelected()&&checkForInvalid(tfDalchna,tfDalchna.getText())){
		a+=1;//19
	}
	if(cbDalMas.isSelected()&&checkForInvalid(tfDalMas,tfDalMas.getText())){
		a+=1;//20
	}
	if(cbFrFries.isSelected()&&checkForInvalid(tfFrFries,tfFrFries.getText())){
		a+=1;//21
	}
	if(cbSalad.isSelected()&&checkForInvalid(tfSalad,tfSalad.getText())){
		a+=1;//22
	}
	if(cbRaita.isSelected()&&checkForInvalid(tfRaita,tfRaita.getText())){
		a+=1;//23
	}
	if(cbTea.isSelected()&&checkForInvalid(tfTea,tfTea.getText())){
		a+=1;//24
	}
	if(cbGrentea.isSelected()&&checkForInvalid(tfGrentea,tfGrentea.getText())){
		a+=1;//25
	}
	if(cbCofe.isSelected()&&checkForInvalid(tfCofe,tfCofe.getText())){
		a+=1;//26
	}
	if(cbColCofe.isSelected()&&checkForInvalid(tfColCofe,tfColCofe.getText())){
		a+=1;//27
	}
	if(cbReg.isSelected()&&checkForInvalid(tfReg,tfReg.getText())){
		a+=1;//28
	}
	if(cbSti.isSelected()&&checkForInvalid(tfSti,tfSti.getText())){
		a+=1;//29
	}
	if(cbHL.isSelected()&&checkForInvalid(tfHL,tfHL.getText())){
		a+=1;//30
	}
	if(cbOL.isSelected()&&checkForInvalid(tfOL,tfOL.getText())){
		a+=1;//31
	}
	if(cbJ.isSelected()&&checkForInvalid(tfJ,tfJ.getText())){
		a+=1;//32
	}
	if(cbBS.isSelected()&&checkForInvalid(tfBS,tfBS.getText())){
		a+=1;//33
	}
	if(cbMS.isSelected()&&checkForInvalid(tfMS,tfMS.getText())){
		a+=1;//34
	}
	if(cbCheS.isSelected()&&checkForInvalid(tfCheS,tfCheS.getText())){
		a+=1;//35
	}
	if(cbChos.isSelected()&&checkForInvalid(tfChos,tfChos.getText())){
		a+=1;//36
	}
	if(cbAS.isSelected()&&checkForInvalid(tfAS,tfAS.getText())){
		a+=1;//37
	}
	if(cbSS.isSelected()&&checkForInvalid(tfSS,tfSS.getText())){
		a+=1;//38
	}
	if(cbFM.isSelected()&&checkForInvalid(tfFM,tfFM.getText())){
		a+=1;//39
	}
	if(a>0){
		return true;
	}
		else return false;
}//end of isInt method
	public void back_action2(ActionEvent event){
		fr.dispose();
	}
	public void order_action2(ActionEvent event){
		String s = get_calculated_bill();
		JButton ok = new JButton("OK");
		ok.setBackground(Color.WHITE);
		ok.setForeground(NAVY);
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				ok_Action(event);
			}
		});
		JPanel okpane = new JPanel();
		okpane.setLayout(new FlowLayout(FlowLayout.CENTER));
		okpane.add(ok);
		okpane.setBackground(Color.WHITE);
		billframe = new BasicFrame("SIR YOUR BILL IS HERE",400,100);
		fr.dispose();
		bill_panel = new JPanel();
		billabel = new JLabel("Your bill is "+ s + "Rs only you bought "+ count + " items");
		billabel.setForeground(NAVY);
		billabel.setFont(new Font("Bahnschrift Light",Font.BOLD,14));
		bill_panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		bill_panel.setBackground(Color.WHITE);
		bill_panel.add(billabel);
		c3 = billframe.getContentPane();
		c3.setBackground(Color.WHITE);
		c3.add(bill_panel,BorderLayout.CENTER);
		c3.add(okpane,BorderLayout.PAGE_END);
		billframe.setResizable(false);
		billframe.setLocationRelativeTo(null);
		billframe.setVisible(true);
		billframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	}//end of order action 2
	public void checkrates_action(ActionEvent event){
					Rates show = new Rates();
			}
	public void ok_Action(ActionEvent event){
		billframe.dispose();
				cbZinger.setSelected(false);		
		cbPizzamini.setSelected(false);		
		cbPizzamedium.setSelected(false);		
		cbPizzalarge.setSelected(false);
		cbShuwarma.setSelected(false);		
		cbChicKarhai.setSelected(false);		
		cbGreenCK.setSelected(false);		
		cbRedCK.setSelected(false);		
		cbMutKar.setSelected(false);		
		cbChapati.setSelected(false);		
		cbNaan.setSelected(false);		
		cbTaftan.setSelected(false);		
		cbKulcha.setSelected(false);		
		cbBiryani.setSelected(false);		
		cbFR.setSelected(false);		
		cbCP.setSelected(false);		
		cbBP.setSelected(false);		
		cbCR.setSelected(false);		
		cbDalchna.setSelected(false);		
		cbDalMas.setSelected(false);		
		cbFrFries.setSelected(false);		
		cbSalad.setSelected(false);		
		cbRaita.setSelected(false);		
		cbTea.setSelected(false);		
		cbGrentea.setSelected(false);		
		cbCofe.setSelected(false);		
		cbColCofe.setSelected(false);		
		cbReg.setSelected(false);		
		cbSti.setSelected(false);		
		cbHL.setSelected(false);		
		cbOL.setSelected(false);		
		cbJ.setSelected(false);		
		cbBS.setSelected(false);		
		cbMS.setSelected(false);		
		cbCheS.setSelected(false);		
		cbChos.setSelected(false);		
		cbAS.setSelected(false);		
		cbSS.setSelected(false);		
		cbFM.setSelected(false);		

	}//end of ok button action which comes in bill frame

	public void reset_action(ActionEvent event){
		cbZinger.setSelected(false);		
		cbPizzamini.setSelected(false);		
		cbPizzamedium.setSelected(false);		
		cbPizzalarge.setSelected(false);
		cbShuwarma.setSelected(false);		
		cbChicKarhai.setSelected(false);		
		cbGreenCK.setSelected(false);		
		cbRedCK.setSelected(false);		
		cbMutKar.setSelected(false);		
		cbChapati.setSelected(false);		
		cbNaan.setSelected(false);		
		cbTaftan.setSelected(false);		
		cbKulcha.setSelected(false);		
		cbBiryani.setSelected(false);		
		cbFR.setSelected(false);		
		cbCP.setSelected(false);		
		cbBP.setSelected(false);		
		cbCR.setSelected(false);		
		cbDalchna.setSelected(false);		
		cbDalMas.setSelected(false);		
		cbFrFries.setSelected(false);		
		cbSalad.setSelected(false);		
		cbRaita.setSelected(false);		
		cbTea.setSelected(false);		
		cbGrentea.setSelected(false);		
		cbCofe.setSelected(false);		
		cbColCofe.setSelected(false);		
		cbReg.setSelected(false);		
		cbSti.setSelected(false);		
		cbHL.setSelected(false);		
		cbOL.setSelected(false);		
		cbJ.setSelected(false);		
		cbBS.setSelected(false);		
		cbMS.setSelected(false);		
		cbCheS.setSelected(false);		
		cbChos.setSelected(false);		
		cbAS.setSelected(false);		
		cbSS.setSelected(false);		
		cbFM.setSelected(false);		
	}//end of reset button action
	private boolean isInvalid(JTextField t, String s){
		try{
				int ss = Integer.parseInt(s);
				return true;
		}catch(NumberFormatException e){
			return false;
		}
	}//end of isInvalid method

}