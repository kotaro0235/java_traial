package jframe_sample;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SampleIcon extends JFrame {
	
	public static void main(String... args) {
		SampleIcon frame = new SampleIcon("ƒ^ƒCƒgƒ‹");
		frame.setVisible(true);
	}
	
	SampleIcon(String title) {
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("../img_sample/favicon.ico");
		setIconImage(icon.getImage());
	}

}
