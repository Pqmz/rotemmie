package game;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**alnjklsnf**//
public class movement extends JFrame{
	
	public movement() {
		super.setTitle("Game");
		super.setSize(900,600);
		super.setLocation(100, 100);
		super.setResizable(false);
		super.add(new stuff());
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}
	

	public static void main(String[] args) {
		new movement(); 
	}
}
