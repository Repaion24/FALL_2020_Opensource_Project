import javax.swing.*;
import java.awt.*;


public class Swingprg extends JFrame {
	JButton open, read, close;
	JPanel center_p;
	JPanel north_p;
	
	public Swingprg() {
		north_p = new JPanel();
		center_p = new JPanel();
		
		open = new JButton("open");
		read = new JButton("read");
		close = new JButton("close");

		north_p.setBackground(Color.DARK_GRAY);
		north_p.add(open);
		north_p.add(read);
		north_p.add(close);
		
		setTitle("Opensource8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel("JAVA",JLabel.LEFT);
		JLabel l2 = new JLabel("Hello",JLabel.RIGHT);
		JLabel l3 = new JLabel("Love",JLabel.CENTER);
		
		center_p.add(l1);
		center_p.add(l2);
		center_p.add(l3);
		
		center_p.setLayout(new GridLayout(2,6));
		
		add(north_p, BorderLayout.NORTH);
		add(center_p, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Swingprg frame = new Swingprg();
	}
}
