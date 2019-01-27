package jframe_sample;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Sample extends JFrame {
	public static void main(String... args) {
		Sample frame = new Sample("タイトル");
		frame.setVisible(true);
	}
	
	Sample(String title) {
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("ボタン");
		Container contentPane = getContentPane();
		contentPane.add(btn,BorderLayout.NORTH);
	}
}