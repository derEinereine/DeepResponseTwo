
/**
 * 
 * @author nachneunkommtacht@gmail.com
 * @version 0.3
 * @since April 2023
 */

/**
 *Working Directory JJJJTTMM-HHMM
 * 20230604-2149
 * 20230704-2005
 * 20230804-1246
 * printSum()
 *  20231304-2124
 *  
 *  20250107-2036 -printDirection()
 */

public class Logic {
	

	
	public Logic(){
		//System.out.println("Konstruktor Logik");
	}

	boolean verzweigungRun(String s)
	{
		boolean b = true;
		if(s == "0") b = false;
		
		return b;
	}
	
	void printSum(String s)
	{
		System.out.println("Summe des Muster "+
				"Den Index der Zahlen für die Stelle ausgeben \n"+
				"Die Boolsche Summe Wahr Wahr Wahr = 3");
			
		Model mo = new Model();
		mo.setModel(s);
		
		ModelData moda = new ModelData();
		
		int[][] mu = new int[moda.getHigh()][moda.getWide()];
		
		
		//Skalieren der Int Matrix
		for(int k = 0; k<mo.getModel().length; k++ )
		{	
			for(int l = 0; l<mo.getModel()[k].length; l++ )
			{
				
				for(int m = 0; m<mo.getModel()[k][l].length; m ++)
				{	
					if(mo.getModel()[k][l][m]==true)
					{
						mu[l][m]++;		
					}
							
				}
									
			}
		
		}
		
		
		//Ausgabe der Int Matrix		
		for(int l = 0; l<mu.length; l++ )
		{
			
			for(int m = 0; m<mu[l].length; m ++)
			{					
				System.out.print(mu[l][m] + ",");	
			}
			
			System.out.print("\n");
								
		}
		
		
		
		//Finden des MAX wertes in der Int Matrix
		int max = 0;
		
		for(int l = 0; l<mu.length; l++ )
		{
			
			for(int m = 0; m<mu[l].length; m ++)
			{					
				if(mu[l][m]>max)max=mu[l][m];
			}
			
		
								
		}
		
		System.out.println("MAX: "+ max);
		
		//Ausgabe vom Mittelwert der Eingabe		
				for(int l = 0; l<mu.length; l++ )
				{
					
					for(int m = 0; m<mu[l].length; m ++)
					{						
						
						if(mu[l][m]>max/2)
						{
							System.out.print("#");
						}
						else
						{
							System.out.print(" ");
						}
					
					}
					
					System.out.print("\n");
										
				}
		
		
	}
	
	
		void printBig(String s, boolean b)
		{

			Model mo = new Model();
			mo.setModel(s);

			
			//Gibt den Modell von Modelldaten seine Quantoren 
			int x = 0; //ANZAHL SYMBOLE
			int y = 0; //ANZAHL ZEILEN
			int z = 0; //ANZAHL STELLEN
			
//			System.out.print("Mockup logiQuerMode()");
			System.out.print("\n");
			
//			Model mo = new Model();
//			////////QUANTIFIZIEREN DES MODELL
			
//			System.out.print("QUANTIFIZIEREN DES MODELL");
//			System.out.print("\n");
	
			
			
			for(int k = 0; k<mo.getModel().length; k++ )
			{	
				for(int l = 0; l<mo.getModel()[k].length; l++ )
				{
					
					for(int m = 0; m<mo.getModel()[k][l].length; m ++)
					{							
						z++;			
					}
					y++;					
				}

				x++;
			
			}
			
//			System.out.print("x:" +x+ " y:" +y+ " z:" +z);
//			System.out.print("\n");
//			System.out.print("ERZEUGEN VOM STRING");
//			System.out.print("\n");
			
			
			
			boolean[] wqFin = new boolean[z+y];
			
			int v = 0;//Stellenwertsumme vom ModellDatenübersetzung
			 
	
			
//			System.out.print("üBERSETZEN VOM MODELL AUF STRING");
//			System.out.print("\n");
			
			/*
			 * Spezialschleife : Äußerste bestimmt die mittlere
			 * 					der Modellübertragung, damit ModelData in
			 * 					Summe des Modell von Kopf- bis Fußzeile
			 * 					
			 */
			
			for(int h = 0; h<mo.getModel()[0].length; h++ )
			{
				for(int k = 0; k<mo.getModel().length; k++ )
				{	
					for(int l = 0; l<mo.getModel()[k].length; l++ )
					{	
						l=h;
						for(int m = 0; m<mo.getModel()[k][l].length; m ++)
						{	
							if(mo.getModel()[k][l][m]==true) 
							{
//								System.out.print("X");
								wqFin[v]=true;
								
						
							}
							else
							{
//								System.out.print(" ");
								wqFin[v]=false;
								
							}
							v++;
						}

						wqFin[v]=false;
						v++;

						break;
						
					}
				}
			}
/*20230704-2016			
			System.out.print("AUSGABE VOM STRING");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("1d array AUSGABE");
			System.out.print("\n");
			
			for(int e = 0; e<wqFin.length; e++)
			{

					
					if(wqFin[e]==false)
					{
						System.out.print(" ");
					
					}
					else
					{
						System.out.print("#");	
					}
				
					if((e%(y+x))==y+x-1)System.out.print("\n");
//Italic				if((e%(y+x+1))==y+x)System.out.print("\n");
//Diagonal				if((e%(y+x-1))==y+x-2)System.out.print("\n");
			}
*/			
//			System.out.print("\n");
//			System.out.print("TRANSFORMATION 1d auf 2d");
//			System.out.print("\n");
			
			
			
			boolean[][]uT=new boolean[y/x][x+y];
			int f = 0;
//			int g = 0;
			for(int e = 0; e<wqFin.length; e++)
			{		
//					System.out.print("#");
				
					if(wqFin[e]==false)
					{
//						System.out.print(" ");
						uT[f][e%(y+x)]=false;
					
					}
					else
					{
//						System.out.print("#");
						uT[f][e%(y+x)]=true;
					}
				
					if((e%(y+x))==y+x-1)
					{	
//						System.out.print("\n");
						f++;
					    
					}
//Italic				if((e%(y+x+1))==y+x)System.out.print("\n");
//Diagonal				if((e%(y+x-1))==y+x-2)System.out.print("\n");
			}
			
			
			
	
	
			
/*20230704-2017			
			
			System.out.print("\n");
			System.out.print("2d array AUSGABE");
			System.out.print("\n");
			
			
			
			for(int u = 0;u<uT.length;u++)
			{
				for(int w = 0;w<uT[u].length;w++)
				{
					if(uT[u][w]==false)
					{
						System.out.print("+");
//						uT[f][e%(y+x)]=false;
					
					}
					else
					{
						System.out.print("#");
//						uT[f][e%(y+x)]=true;
					}
				}
				System.out.print("\n");
			}
			
*/	
			
			
			
			
			//Erstellen eines Rahmen
			boolean[][] uTp = new boolean[uT.length+4][uT[0].length+3];
	
			
			
			
/*20230704-2020	
			for(short k = 0;k<uTp.length;k++)
//				20230304-2044
				{
					
					for(short l = 0; l<uTp[k].length;l++)
					{
						if((k==0)|l==0|k==uTp.length-1|l==uTp[k].length-1)
						{	
							
								System.out.print("x");
							
						}
						else
						{
							System.out.print(" ");	
						}
						
						
						
					}
					System.out.println("");
				}
*/	
			
			
			
			
				//Speichern des Rahmen
				for(short k = 0;k<uTp.length;k++)
//				20230404-2050
				{
					
					for(short l = 0; l<uTp[k].length;l++)
					{
						if((k==0)|l==0|k==uTp.length-1|l==uTp[k].length-1)
						{								
//								System.out.print("x");
								uTp[k][l]=true;
						}
						else
						{							
//								System.out.print(" ");
								uTp[k][l]=false;
						}
						
						
						
					}
//					System.out.println("");
				}
				
				//Einfügen des Schriftzeichen
				for(int u = 2;u<uTp.length-2;u++)
				{
					for(int w = 2;w<uTp[u].length-2;w++)
					{
							uTp[u][w]=uT[u-2][w-2];
					}
					
				}
				
				
				//Ausgabe von uT in uTp mit anpassbaren Rahmen
					//20250107-2108 SignCounter install/unsitall wrong path
				for(short k = 0;k<uTp.length;k++)
//					20230404-2104
					{
						
						for(short l = 0; l<uTp[k].length;l++)
						{
							if((uTp[k][l]==true))
							{		
								if((k==0)|l==0|k==uTp.length-1|l==uTp[k].length-1)
								{
									if(b==true) 
									{
										System.out.print("+");	
									}
									else
									{
										System.out.print(" ");
									}
								}
								else
								{
									System.out.print("#");	
								}
																
							}
							else
							{
									System.out.print(" ");	
							}
							
							
							
						}
						System.out.println("");
					}
						
		}
		
	
		
		//20250107 neu installiert
		void printDirection(String drc){		
			
		}
		
		
		
		void lineSignCounter(String s) {
			{
				System.out.println("Summe des Muster "+
						"Den Index der Zahlen für die Stelle ausgeben \n"+
						"Die Boolsche Summe Wahr Wahr Wahr = 3");
					
				Model mo = new Model();
				mo.setModel(s);
				
				ModelData moda = new ModelData();
				
				int[][] mu = new int[moda.getHigh()][moda.getWide()];
				
				
				//Skalieren der Int Matrix
				for(int k = 0; k<mo.getModel().length; k++ )
				{	
					for(int l = 0; l<mo.getModel()[k].length; l++ )
					{
						
						for(int m = 0; m<mo.getModel()[k][l].length; m ++)
						{	
							if(mo.getModel()[k][l][m]==true)
							{
								mu[l][m]++;		
							}
									
						}
											
					}
				
				}
				
				
				//Ausgabe der Int Matrix		
				for(int l = 0; l<mu.length; l++ )
				{
					
					for(int m = 0; m<mu[l].length; m ++)
					{					
						System.out.print(mu[l][m] + ",");	
					}
					
					System.out.print("\n");
										
				}
				
				
				
				//Finden des MAX wertes in der Int Matrix
				int max = 0;
				
				for(int l = 0; l<mu.length; l++ )
				{
					
					for(int m = 0; m<mu[l].length; m ++)
					{					
						if(mu[l][m]>max)max=mu[l][m];
					}
					
				
										
				}
				
				System.out.println("MAX: "+ max);
				
				//Ausgabe vom Mittelwert der Eingabe		
						for(int l = 0; l<mu.length; l++ )
						{
							
							for(int m = 0; m<mu[l].length; m ++)
							{						
								
								if(mu[l][m]>max/2)
								{
									System.out.print("#");
								}
								else
								{
									System.out.print(" ");
								}
							
							}
							
							System.out.print("\n");
												
						}
						
						//20250107-2130 install "line sign counter
//						"Aus dem MAtrix Addierer Exptrahiert.
						
						int [] row = new int[5];
						
						
						for(int l = 0; l<mu.length; l++ )
						{
							
							for(int m = 0; m<mu[l].length; m ++)
							{					
								System.out.print(mu[l][m] + ",");
								row[l]=row[l]+mu[l][m];
							}
							
							System.out.print("\n");
												
						}
						
						System.out.println();
						for(int l = 0; l<row.length; l++ )
						{
							System.out.println("Spaltennsumme Zeile: " + (l +1));
							System.out.println(row[l]);
							System.out.println();
						}
						
				
				
			}
		}
		
		

}
