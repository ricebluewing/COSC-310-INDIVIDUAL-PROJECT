package extra_feature_2;


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

public class news_api extends JFrame {

    
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
	        	
	            
	            String theURL = "";
	        	
	            int n = 1 +(int)(Math.random()*5);
	            
	            
	           switch(n) {
	            
	           
	           case 1: theURL = "https://newsdata.io/api/1/news?apikey=pub_14102b135dac9c71ec01ef3a2959c9b8a49ef&language=fr";
	           		break;
	           		
	           case 2: theURL ="https://newsdata.io/api/1/archive?apikey=pub_14102b135dac9c71ec01ef3a2959c9b8a49ef";
	           		break;
	           		
	           case 3: theURL = "https://newsdata.io/api/1/news?apikey=pub_14102b135dac9c71ec01ef3a2959c9b8a49ef&category=sports,health";
	           		break;
	           		
	           case 4: theURL = "https://newsdata.io/api/1/news?apikey=pub_14102b135dac9c71ec01ef3a2959c9b8a49ef&domain=ctvnews_london";
		        	break;
		        	
	           case 5: theURL = "https://newsdata.io/api/1/news?apikey=pub_14102b135dac9c71ec01ef3a2959c9b8a49ef&q=social";
	           		break;
		        
	           } 
	        	
	        	
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
	
	
	
	

	
	
	
	
	
	
	
	

