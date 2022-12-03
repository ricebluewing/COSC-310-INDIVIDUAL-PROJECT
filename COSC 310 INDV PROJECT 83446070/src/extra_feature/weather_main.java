package extra_feature;



import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.json.JSONException;

import cosc310_T28_librarySystem.Libraly;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class weather_main extends JFrame {

	/**
	 * Launch the application.
	 */
	public void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				weather_main form = new weather_main();
				form.setVisible(true);
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public weather_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 440);
		setTitle("WEATHER");

		
//		setIconImage(Toolkit.getDefaultToolkit().getImage("todoicon.svg.png"));
		
		getContentPane().setLayout(new GridLayout(2, 2, 10, 10)); // 2x2
			
		
		
		
JButton	btn2 = new JButton();
		
		BufferedImage icon2;
		BufferedImage picon2;
		try {
			icon2 = ImageIO.read(getClass().getResource("KELOWNA small.jpeg"));
			btn2.setIcon(new ImageIcon(icon2));
			picon2 = ImageIO.read(getClass().getResource("BKELOWNA small.jpeg"));
			btn2.setPressedIcon(new ImageIcon(picon2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		getContentPane().add(btn2);
		btn2.addActionListener(new ActionListener(){
    		
    		public void actionPerformed(ActionEvent arg0) {
    		KELOWNA K = new KELOWNA();
		    	try {
		    K.Main();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (JSONException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
    		}
    		
    	});
JButton	btn1 = new JButton();
	
		BufferedImage icon1;
		BufferedImage picon1;
		try {
			icon1 = ImageIO.read(getClass().getResource("VANCOUVER small.jpeg"));
			btn1.setIcon(new ImageIcon(icon1));
			picon1 = ImageIO.read(getClass().getResource("BVANCOUVER small.jpeg"));
			btn1.setPressedIcon(new ImageIcon(picon1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener(){
    		
    		public void actionPerformed(ActionEvent arg0) {
    		Vancouver V = new Vancouver();
		    	try {
		    V.Main();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (JSONException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
    		}
    		
    	});
		
JButton	btn3 = new JButton();
		
		BufferedImage icon3;
		BufferedImage picon3;
		try {
			icon3 = ImageIO.read(getClass().getResource("LONDON small.jpeg"));
			btn3.setIcon(new ImageIcon(icon3));
			picon3 = ImageIO.read(getClass().getResource("BLONDON small.jpeg"));
			btn3.setPressedIcon(new ImageIcon(picon3));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getContentPane().add(btn3);
		btn3.addActionListener(new ActionListener(){
    		
    		public void actionPerformed(ActionEvent arg0) {
    			
    			
    			London L = new London();
    		    	try {
			    L.Main();
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} catch (JSONException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
    			
    		}
    		
    	});
		
JButton	btn4 = new JButton();
		
		BufferedImage icon4;
		BufferedImage picon4;
		try {
			icon4 = ImageIO.read(getClass().getResource("NEWYORK small.jpeg"));
			btn4.setIcon(new ImageIcon(icon4));
			picon4 = ImageIO.read(getClass().getResource("BNEWYORK small.jpeg"));
			btn4.setPressedIcon(new ImageIcon(picon4));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getContentPane().add(btn4);
		btn4.addActionListener(new ActionListener(){
    		
    		public void actionPerformed(ActionEvent arg0) {
    			
    		NEWYORK N = new NEWYORK();
		    	try {
		    N.Main();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (JSONException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}	
    			
    		}
    		
    	});
	}

}
