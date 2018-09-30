
import java.util.Scanner;

public class OlioidenToimintoja {
    public static void main(String args[]) {
        Tulostaja olio = new Tulostaja();
        olio.Tulosta();
        
    }
}

class Tulostaja { //Sinun tehtäväsi on tehdä luokka Tulostaja
	int eka; 
	int toka;
	//joka kysyy käyttäjältä kaksi kokonaislukua:
	Scanner lukija = new Scanner(System.in);{
		System.out.print("Syötä ensimmäinen kokonaisluku: ");
	    eka = lukija.nextInt();
	    System.out.print("Syötä toinen kokonaisluku: ");
	    toka = lukija.nextInt();
	}
	public void Tulosta() { //Metodi Tulosta() tulostaa saadun summan näytölle
		System.out.println("Lukujen summa: " + Laskin.Summa(eka, toka));
		//kutsuu luokan Laskin metodia Summa() välittäen metodille syötteenä saadut kokonaisluvut.
	}
	}

class Laskin {
    static int Summa(int eka, int toka) {
        int summa = eka + toka;
        return summa;
    }
}

