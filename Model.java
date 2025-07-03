
/**
 * 
 * @author nachneunkommtacht@gmail.com
 * @version 0.2
 * @since April 2023
 */

/**
 *Working Directory JJJJTTMM-HHMM
 * 20230604-2149
 * 20230804-1252
 *
 *20250107-2047 - Direction counter implementet aa,cc,pp,vv
 */

public class Model
{	
	
	public Model() 
	{		
	}
				
		public static String str;
		public static boolean[][][] arrq;
//		public static boolean[][] arrq;
		
		//Direction Counter
		public static int aa = 0;
		public static int cc = 0;
		public static int pp = 0;
		public static int vv = 0;
		
		
		void setModel(String str)
		//20232903-2015
		{
			this.str = str;
//			System.out.println(this.str);
		}
		
		
		
		boolean [][][] getModel()
		//20232803-2152
		{

			String str = this.str;
			
			ModelData moDa = new ModelData();
			
			
		//3 Dimensionales Array der Zeichenlaenge*boolsche MAtrix Zeichen
			boolean[][][] arrq 
			= 
			new boolean[str.length()][moDa.getHigh()][moDa.getWide()];
			
			char c;
				
			//Model mo = new Model();
			for(int k = 0; k<arrq.length; k++ )
			{	
								
				 c = str.charAt(k);
				switch(c)
				{
				case 'A':
							arrq[k] = moDa.printAhObj();
							aa++;
					break;
				case 'B':
							arrq[k] = moDa.printBhObj();
							pp++;
					break;	
				case 'C':
							arrq[k] = moDa.printChObj();
							cc++;
					break;
				case 'D':
							arrq[k] = moDa.printDhObj();	
							cc++;
					break;
				case 'E':
							arrq[k] = moDa.printEhObj();
							cc++;
							//cc++;
					break;	
				case 'F':
							arrq[k] = moDa.printFhObj();
							pp++;
					break;
				case 'G':
							arrq[k] = moDa.printGhObj();
							cc++;
							
					break;
				case 'H':
							arrq[k] = moDa.printHhObj();	
							aa++;
					break;	
				case 'I':
							arrq[k] = moDa.printIhObj();
							cc++;
					break;
				case 'J':
							arrq[k] = moDa.printJhObj();
							cc++;
							vv++;
					break;
				case 'K':
							arrq[k] = moDa.printKhObj();
							cc++;
					break;	
				case 'L':
							arrq[k] = moDa.printLhObj();
							cc++;
					break;
				case 'M':
							arrq[k] = moDa.printMhObj();	
							aa++;
					break;
				case 'N':
							arrq[k] = moDa.printNhObj();	
							aa++;
					break;	
				case 'O':
							arrq[k] = moDa.printOhObj();
							aa++;
							vv++;
					break;
				case 'P':
							arrq[k] = moDa.printPhObj();
							pp++;
					break;
				case 'Q':
							arrq[k] = moDa.printQhObj();
							cc++;
							vv++;
					break;
				case 'R':
							arrq[k] = moDa.printRhObj();
							aa++;
					break;
				case 'S':
							arrq[k] = moDa.printShObj();
							cc++;
					break;
				case 'T':
							arrq[k] = moDa.printThObj();
							cc++;
					break;
				case 'U':
							arrq[k] = moDa.printUhObj();
							cc++;
					break;
				case 'V':
							arrq[k] = moDa.printVhObj();
							vv++;
					break;
				case 'W':
							arrq[k] = moDa.printWhObj();
							vv++;
					break;
				case 'X':
							arrq[k] = moDa.printXhObj();
							cc++;
							cc++;
					break;
				case 'Y':
							arrq[k] = moDa.printYhObj();
							vv++;
							cc++;
					break;
				case 'Z':
							arrq[k] = moDa.printZhObj();
							cc++;
					break;
				case ' ':
							arrq[k] = moDa.printBarspace();
				break;

			
					
				default:
					
					arrq[k] = moDa.printBarspace();
//					System.out.println("switch default Model");
				}
								
			}				
	
		this.arrq = arrq;
		
		return arrq;
		}
}
				

