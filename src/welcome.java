import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class welcome {
	
	

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel name;
	private static JButton PC;
	private static JButton friend;
	private static ImageIcon logo;
	private static JLabel ask;

	public static void main(String[] args) {
		frame = new JFrame();
		panel = new JPanel();
		logo = new ImageIcon("logo.png");
		
		frame.setSize(640,600);
		frame.setTitle("TIC-TAC-TOE");
		frame.setIconImage(logo.getImage());
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(new Color(25,25,25));
		
		name = new JLabel();
		name.setBackground(new Color(25,25,25));
		name.setForeground(new Color(25,255,0));
		name.setFont(new Font("Ink Free",Font.BOLD,75));
		name.setBounds(100,100,600,75);
		name.setText("Tic-Tac-Toe");
		name.setOpaque(true);
		panel.add(name);
		
		ask = new JLabel("AGAINST WHOM DO YOU WANT TO PLAY WITH ?");
		ask.setBounds(20,280,600,75);
		ask.setBackground(new Color(25,25,25));
		ask.setForeground(new Color(25,255,0));
		ask.setFont(new Font("Ink Free",Font.BOLD,25));
		ask.setOpaque(true);
		panel.add(ask);
		
		
		
		PC = new JButton("AGAINST COMPUTER");
		PC.setFont(new Font("MV Boli", Font.BOLD, 20));
		PC.setLayout(null);
		PC.setFocusable(false);
		PC.setBounds(30,450,265,50);
		PC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new against_comp();
				frame.dispose();
				
			}
			
		});
		panel.add(PC);
		
		friend = new JButton("AGAINST A FRIEND");
		friend.setFont(new Font("MV Boli", Font.BOLD, 20));
		friend.setFocusable(false);
		friend.setLayout(null);
		friend.setBounds(330,450,250,50);
		friend.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				new against_friend();
				frame.dispose();
			}
			
		});
		panel.add(friend);
		
		
		frame.setVisible(true);
		
	}
		
		
	

}
