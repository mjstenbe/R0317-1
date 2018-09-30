import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Kirjatehdas {
	
	public static void main(String[] args){
		
		Kirja[] kirjaHylly = new Kirja[4];//kirjahylly-niminen taulukko, joka pit‰‰ sis‰ll‰‰n Kirja-olioita
		
		Scanner lukija = new Scanner(System.in);{
	    
			for(int i=0; i< kirjaHylly.length; i++) { // arvot: 2-0
				
	            	kirjaHylly[i] = new Kirja();//Oma yritys
	            	
	            	//System.out.println("Syˆt‰ kirjan nimi: ");
	            	//String nimi = lukija.nextLine();
	            	
	            	String nimi =
	            	JOptionPane.showInputDialog(null, "Anna kirjan nimi?", 
	            	"Kirjan tietojen kysely", JOptionPane.QUESTION_MESSAGE);
	            	
	            	System.out.println("Syˆt‰ kirjan julkaisuvuosi: ");
	            	int vuosi = lukija.nextInt();
	            	lukija.nextLine(); //Korjataan scannerin kummallisuus yhdell‰ enterin lyˆnnill‰
	            	
	            	//System.out.println("Syˆt‰ tekij‰ nimi: ");
	            	//String kuka = lukija.nextLine();
	            	
	            	String kuka =
	            	JOptionPane.showInputDialog(null, "Anna kirjan tekij‰n nimi?", 
	    	        "Kirjan tietojen kysely", JOptionPane.QUESTION_MESSAGE);
	            	
	            	kirjaHylly[i].setteoksenNimi(nimi);
	            	kirjaHylly[i].setjulkaisuvuosi(vuosi);
	            	kirjaHylly[i].settekija(kuka);
	            	
	            	System.out.println();
	            	
	               System.out.println("Kirjan tiedot: " + "\n" + kirjaHylly[i]);
	               
	              


	            
	        }
			
	        }   
 //OSA 3
	               
	            // ArrayList-muuttujan alustus. Huomaa ett‰ muuttujan tyyppi voidaan antaa nuolisulkeissa
	               //ArrayList<Kirja> kirjaVarasto = new ArrayList<>();
	               
	            // Olioiden lis‰ys
	              // kirjaVarasto.add(ekaKirja);

	            // Olioiden poisto halutusta indeksist‰
	            //kirjaVarasto.remove(1);


	            // Listassa olevien alkioiden m‰‰r‰n kysely
	           // kirjaVarasto.size();

	            // Listassa olevan alkion poimiminen
	          //  kirjaVarasto.get(0);
		}

}
