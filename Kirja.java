
public class Kirja {
	
	//Luodaan Konstruktori ja asetetaan oletusarvot
			public Kirja() {
				this.teoksenNimi = "Ei nime‰";
				this.julkaisuvuosi = 0000; 
				this.tekija = "Ei tekij‰‰";
				this.hinta = 0;
				}
	//Luodaan Konstruktori jossa uudelle oliolle saa lis‰tty‰ teoksenNimen ja tekij‰n tiedot sek‰ julkaisuvuoden
			public Kirja (String teoksenNimi, String tekija, int julkaisuvuosi) {
				this.teoksenNimi = teoksenNimi;
				this.tekija = tekija;
				this.julkaisuvuosi = julkaisuvuosi;
			}
	
	//Luokan ominaisuudet
	private String teoksenNimi;  
	private int julkaisuvuosi; 
	private String tekija;
	private double hinta;
			
	//Luodaan metodi jolla haetaan muuttuja julkiseksi
    public String
    getteoksenNimi(){ 
    return this.teoksenNimi;
    }
    //Luodaan metodi joka tuo muuttujan Public tasolle
    public void setteoksenNimi(String uusiteoksenNimi){ 
    this.teoksenNimi = uusiteoksenNimi;
    }
  //Luodaan metodi jolla haetaan muuttuja julkiseksi
    public int
    getjulkaisuvuosi(){ 
    return this.julkaisuvuosi;
    }
    //Luodaan metodi joka tuo muuttujan Public tasolle
    public void setjulkaisuvuosi(int uusijulkaisuvuosi){ 
    this.julkaisuvuosi = uusijulkaisuvuosi;
    }
  //Luodaan metodi jolla haetaan muuttuja julkiseksi
    public String
    gettekija(){ 
    return this.tekija;
    }
    //Luodaan metodi joka tuo muuttujan Public tasolle
    public void settekija(String uusitekija){ 
    this.tekija = uusitekija;
    }
  //Luodaan metodi jolla haetaan muuttuja julkiseksi
    public double
    getHinta(){ 
    return this.hinta;
    }
    //Luodaan metodi joka tuo muuttujan Public tasolle
    public void sethinta(double uusiHinta){ 
    this.hinta = uusiHinta;
    }

   //Tulostetaan n‰tisti
    public String toString() {
        return 
        "Teoksen nimi: " + this.getteoksenNimi() + "\n" +
        "Julkaisuvuosi: " + this.getjulkaisuvuosi() + "\n" +
        "Tekij‰: " + this.gettekija() + "\n" +
        "Hinta: " + this.getHinta() + "\n";
    }
}
