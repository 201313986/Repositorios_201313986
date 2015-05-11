import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSlider;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Label;
import javax.swing.UIManager;
import java.awt.Color;

class ventana extends JFrame {

	JButton btn1, btn2, btn3, btn4, btn5, btn6;
	private JLabel label,label2,label3,labelt1,labelt2,labelt3,labelt4,labelt5,labelt6,labelt7,labelt8;

	ventana() {

		setTitle("Torres");
		setSize(1000, 600);
		setVisible(true);
		Container contentpane = getContentPane();

		contentpane.setLayout(null);

		btn1 = new JButton("+");
		contentpane.add(btn1);
		btn1.setBounds(120, 500, 50, 25);

		btn2 = new JButton("-");
		contentpane.add(btn2);
		btn2.setBounds(180, 500, 50, 25);

		btn3 = new JButton("+");
		contentpane.add(btn3);
		btn3.setBounds(430, 500, 50, 25);

		btn4 = new JButton("-");
		contentpane.add(btn4);
		btn4.setBounds(490, 500, 50, 25);

		btn5 = new JButton("+");
		contentpane.add(btn5);
		btn5.setBounds(730, 500, 50, 25);

		btn6 = new JButton("-");
		contentpane.add(btn6);
		btn6.setBounds(790, 500, 50, 25);

		label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("8A4.png")));
		label.setBounds(240, 191, 269, 334);
		getContentPane().add(label);

		label2 = new JLabel("");
		label2.setIcon(new ImageIcon(this.getClass().getResource("8A4.png")));
		label2.setBounds(533, 191, 269, 334);
		getContentPane().add(label2);
		
		label3 = new JLabel("");
		label3.setIcon(new ImageIcon(this.getClass().getResource("8A4.png")));
		label3.setBounds(-75, 191, 269, 334);
		getContentPane().add(label3);
	}

	//    pieces[0] = new JLabel(new ImageIcon(System.getProperty("user.dir") + "/images/piece1.png"));


		 void torre() {
			 
		JLabel[] array = new JLabel[7];
		array[7]  = 
		array[6]  = new ImageIcon("t2.png");
		array[5]  = new ImageIcon("t3.png");
		array[4]  = new ImageIcon("t4.png");
		array[3]  = new ImageIcon("t5.png");
		array[2]  = new ImageIcon("t6.png");
		array[1]  = new ImageIcon("t7.png");
		array[0]  = new ImageIcon("t8.png");
	}
	
}