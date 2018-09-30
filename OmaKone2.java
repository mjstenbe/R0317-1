import java.util.Scanner;
public class OmaKone2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuomaAutomaatti OmaKone2 = new JuomaAutomaatti();
		
		Scanner lukija = new Scanner(System.in);
		int numero;
		
		do {
            System.out.println("*******Juoma-Automaatti*******\r\n" + 
            		"\r\n" + 
            		"1. Kahvi\r\n" + 
            		"2. Tee\r\n" + 
            		"3. Kaakao\r\n" + 
            		"4. Lopeta\r\n" + 
            		"\r\n" + 
            		"******************************\r\n" + 
            		"");
            numero = lukija.nextInt(); 
             
		if (numero == 1) {
		OmaKone2.valmistaKahvi();
        }
		else if (numero == 2) {
		OmaKone2.valmistaTee(); 
	    }
		else if (numero == 3) {
		OmaKone2.valmistaKaakao(); 
        }
		else if (numero < 0 || numero > 4) {
	    System.out.println("Virheellinen numero"); 
	    }
		else if (numero == 4) {
		System.out.println("Kiitos kun käytit minua!"); 
		}
		}
		
		while (OmaKone2.onnistuuko() == true); {}
			System.out.println("Tilaus epäonnistui!");
			 
		        }
		
	}


