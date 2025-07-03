
import java.io.*;

/**
 * 
 * @author nachneunkommtacht@gmail.com
 * @version 0.1
 * @since April 2023
 */

/**
 *Working Directory JJJJTTMM-HHMM
 * 20230604-2149
 * 
 *
 */

public class User{

	public User() {
		//System.out.println("Konstruktor Benutzer");
	}
	
		void bss() {
			System.out.println("Mockup Benutzer");
		}
		
		public String eingabe() {
			
			String s = null;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
			s = br.readLine();
			
			}catch (IOException ioe) {
                ioe.printStackTrace();              
            } 
			return s;
		}
}
