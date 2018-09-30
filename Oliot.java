import java.util.Scanner;

public class Oliot {
    public static void main(String args[]) {
        String merkkijono;
        Scanner lukija =  new Scanner(System.in);        
        TulostusLuokka tulostaja = new TulostusLuokka();
       
        System.out.print("Anna merkkijono, jonka tulostan: ");
        merkkijono = lukija.nextLine();
        tulostaja.Tulosta(merkkijono);
    }
}

//  Tähän kirjoitetaan puuttuva luokka.
class TulostusLuokka {
	public void Tulosta(String merkkijono) {
		System.out.print(merkkijono);
	}
}