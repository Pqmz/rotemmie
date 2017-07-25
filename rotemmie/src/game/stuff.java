package game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class stuff extends JPanel implements ActionListener{
	private Image bob;	
	
	public stuff() {
		super.setDoubleBuffered(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImageIcon fuckinghell = new ImageIcon(this.getClass().getResource("bob.gif"));
		bob = fuckinghell.getImage();
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(bob, 100, 100, 100, 100, this);
	}
	public void actionPerformed(ActionEvent e) {
		repaint();		
		asdfasdf;  test
	}
}
