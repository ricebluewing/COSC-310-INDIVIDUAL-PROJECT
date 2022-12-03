
package extra_feature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
//import com.google.gson.Gson;
//
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonObject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.json.JSONException;
import org.json.JSONObject;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

import new_GUI.Main;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class London extends JFrame {

    
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
    
    public void Main () throws IOException, JSONException{
    
	
	
	
	 BufferedReader br = null;

	        try {
	        	
	        	String apikey = "97ff8d7fe658033b8c8836dd3e6486f5";
	        	
	        	String London = "https://api.openweathermap.org/data/2.5/weather?q=London&appid=";
	        	
	        	String theURL = London+apikey;
	        	
	        	
	        	
	            URL url = new URL(theURL);
	            br = new BufferedReader(new InputStreamReader(url.openStream()));

	            String line;

	            StringBuilder sb = new StringBuilder();

	            
	            JSONObject json;
	            
	            while ((line = br.readLine()) != null) {

	                sb.append(line);
	                sb.append(System.lineSeparator());
	               
	                
	             
	                
	            }
	            
	       
	            String jsontext = sb.toString();
	            json = new JSONObject(jsontext);
	            
	         
	         //System.out.println(json.get("weather"));
	            

	            	
	            
	            
	          // System.out.print(sb+"Hello");
	           
	   	
	           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	           
	       	JOptionPane.showMessageDialog(null, sb);
	       	
	       	setBounds(100, 100, 450, 300);
	       	setTitle("LONDON");
	       	setLocation(500,200);
	           
	           
	        } finally {

	            if (br != null) {
	                br.close();
	            }
	
	
	
	
	
	
	
   
    		
    }
    
    
    



	}
}
	
	
	
	

	
	
	
	
	
	
	
	

