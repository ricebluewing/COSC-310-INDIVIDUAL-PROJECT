package cosc310_T28_librarySystem;

import java.io.IOException;

//import extra_feature.weather_main;


/**2
 * 
 * @author Team 28
 * 
 *         The code starts running here. The main class currently just creates a
 *         UserAndManagerTerminal and starts it.
 *
 *         Credits: our program uses source code by Lawrence Dol from
 *         https://stackoverflow.com/questions/342990/create-java-console-inside-a-gui-panel
 *
 */
public class Libraly {

    public void run() throws IOException {

	
	
	UserAndManagerTerminal terminal = new UserAndManagerTerminal();
	terminal.start();

	
	
	
    }

}
