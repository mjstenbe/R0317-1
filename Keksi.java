
public class Keksi {
	
	//Luodaan Konstruktori luokalle Keksi jos arvoja ei ole asetettu
	public Keksi() {
		this.paino = 35; //Antaa keksille oletusarvon
		}
	//Luodaan Konstruktori jossa uudelle keksille saa lisättyä painon ja nimen
	public Keksi (int uusipaino, String uusiNimi) {
		this.paino = uusipaino;
		this.nimi = uusiNimi;
	}
	
	private String nimi;
	private int paino;
	private String maku;
	
	public int
    getPaino(){ 
    return this.paino;
    }
    //Luodaan metodi joka tuo muuttujan Public tasolle
    public void setPaino(int uusiPaino){ 
    this.paino = uusiPaino;
    }
    
    public String
    getNimi(){ 
    return this.nimi;
    }
    //Luodaan metodi joka tuo muuttujan Public tasolle
    public void setNimi(String uusiNimi){ 
    this.nimi = uusiNimi;
    }
    
    public String toString() {
        return 
        " Paino: "+ this.getPaino() + "g" +
        " Nimi: "+ this.getNimi();
    }
    
    public void haukkaa(){ //Luo metodin
    	if (this.paino -10 < 0) { //tarkistaa, että paino ei ole pienempi kuin nolla
    	this.paino = 0; 
    	System.out.println("Söit jo keksin!");
    	}
    	
    	else this.paino -= 10; //Jos if-lauseke ei toteudu ja keksin arvo ei ole 0 niin keksin painosta vähenee 10
}}
