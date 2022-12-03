package new_GUI;

import cosc310_T28_librarySystem.Libraly;
import extra_feature.weather_main;
import extra_feature_2.news_api;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.json.JSONException;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Main extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Main frame;
				try {
					frame = new Main();
					frame.setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}


	public Main() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(null, "Hello!! WELCOME TO COSC 310 PROJECT");
		
		setBounds(100, 100, 950, 213);
		setTitle("COSC 310 PROJECT");
		//setLocation(500,200);

		
		getContentPane().setLayout(new GridLayout(1, 3, 10, 10)); 
		
		
		
		
		JButton btn1 = new JButton();
		BufferedImage icon1 = ImageIO.read(getClass().getResource("NEWS small.jpeg"));
		BufferedImage picon1 = ImageIO.read(getClass().getResource("BNEWS small.jpeg"));
		btn1.setIcon(new ImageIcon(icon1));
		btn1.setPressedIcon(new ImageIcon(picon1));
		getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener(){
    		
    		public void actionPerformed(ActionEvent arg0) {
    			
    		    news_api na = new news_api();
    		    try {
			na.Main();
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    } catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
    			
    		}
    		
    	});
		
		JButton btn2 = new JButton();
		BufferedImage icon2 = ImageIO.read(getClass().getResource("LIBRARY small.jpeg"));
		BufferedImage picon2 = ImageIO.read(getClass().getResource("BLIBRARY small.jpeg"));
		btn2.setIcon(new ImageIcon(icon2));
		btn2.setPressedIcon(new ImageIcon(picon2));
		getContentPane().add(btn2);
		btn2.addActionListener(new ActionListener(){
    		
    		public void actionPerformed(ActionEvent arg0) {
    		Libraly L = new Libraly();
			try {
		    L.run();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
    		}
		}
    		);
		JButton btn3 = new JButton();
		BufferedImage icon3 = ImageIO.read(getClass().getResource("WEATHER small.jpeg"));
		BufferedImage picon3 = ImageIO.read(getClass().getResource("BWEATHER small.jpeg"));
		btn3.setIcon(new ImageIcon(icon3));
		btn3.setPressedIcon(new ImageIcon(picon3));
		getContentPane().add(btn3);
		btn3.addActionListener(new ActionListener(){
    		
    		public void actionPerformed(ActionEvent arg0) {
    		
    		    weather_main wm = new weather_main();
    		    wm.run();
    		   
    			
    		}
		}
    		);
		
		
		
		
		
		
		
		
		
		

	
    		
    
		
	
}

}