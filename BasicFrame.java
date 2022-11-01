import java.awt.*;

import javax.swing.*;
class BasicFrame extends JFrame{

	BasicFrame(String s,int height, int width){
		super(s);
		setSize(height,width);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

	}
BasicFrame(){
		super();
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

	}
		
}