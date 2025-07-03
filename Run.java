
class Run 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/**
		 * 
		 * @author nachneunkommtacht@gmail.com
		 * @version 0.3
		 * @since April 2023
		 */

		/**
		 *Working Directory JJJJTTMM-HHMM
		 * 20230604-2149
		 * 20230704-XXXX
		 * 20230804-1250
		 * 
		 * 20231304-2124
		 */
		
		Logic lo = new Logic();	
		System.out.println("Aktuelles Argument");
		String blogName1 = String.join("", args);	
		System.out.println(blogName1);
		User bs = new User();
		Model mo = new Model();
			
		
		
		try 
		{			
			do 
			{

						
				switch(blogName1) 
				{					
					case "1":		
						
						System.out.println("EINGABE BITTE 'Nur Großbuchstaben'");
						
						
						lo.printBig(bs.eingabe(), true);
						
						break;	
					
						
					case "2":
						
						System.out.println("Alphabetische Summe");
						
						lo.printSum(bs.eingabe());
									
						break;	
						
					case "3":
						System.out.println("Schnittsummand Zeilen");

						lo.lineSignCounter(bs.eingabe());
					

						break;
					/**	
					case "4":

						System.out.println("Himmelrichtungen");

						lo.printDirection(bs.eingabe());
						break;
						*/						
						
					default:
						lo.printBig("PRINT BIG", true);
				
				}
				
				System.out.print("\n");
				System.out.println
				(
					"Geben sie die Programmauswahl ein."
					+ "\n"
					+ "1 : 5x5 vergrößerte Ausgabe"
					+"\n"
					+"2 : Summenwert der Eingabe"
					+"\n"
					+"3 : Line Sign Counter Eingabe"
					+"\n"
				//	+"4 : Directions der Eingabe"
					
				);
					
				blogName1 = bs.eingabe();
							
				
			}while(lo.verzweigungRun(blogName1));
				
		}catch(Exception e) 
		{	
		}	
		
		
	}
/*
 */
}
