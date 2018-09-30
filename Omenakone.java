import java.util.Scanner;
public class Omenakone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Omena ekaOmena = new Omena();
		 ekaOmena.setVari("Vihreä");
		 ekaOmena.setLajike("Vihreä Kuula");
		 ekaOmena.setPaino(300);

		    Omena tokaOmena = new Omena();
		    tokaOmena.setVari("Punainen");
		    tokaOmena.setLajike("Sugar Mama");
		    tokaOmena.setPaino(150);
		    
		    Omena kolmasOmena = new Omena();
		    kolmasOmena.setVari("Sininen");
		    kolmasOmena.setLajike("Hubba Bubba");
		    kolmasOmena.setPaino(750);
		    
		    //Kutsutaan tulostusmetodia
		    System.out.println(ekaOmena);
		    ekaOmena.haukkaa();
		    System.out.println(ekaOmena);
		    ekaOmena.haukkaa();
		    System.out.println(ekaOmena);
		    System.out.println();
		    System.out.println(tokaOmena);
		    tokaOmena.haukkaa();
		    System.out.println(tokaOmena);
		    tokaOmena.haukkaa();
		    System.out.println(tokaOmena);
		    System.out.println();
		    System.out.println(kolmasOmena);
		    kolmasOmena.haukkaa();
		    System.out.println(kolmasOmena);
		    kolmasOmena.haukkaa();
		    System.out.println(kolmasOmena);
		    

	}

}
