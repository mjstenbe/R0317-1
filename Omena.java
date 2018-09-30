
public class Omena {
	

	private String vari;
    private String lajike;
    private int paino;

    public Omena(){
    	this.lajike = "Ei lajiketta";
    	this.vari = "Ei väriä";
    	}
    
    //Luodaan metodi jolla haetaan muuttuja väri julkiseksi
    public String
    getVari(){ 
    return this.vari;
    }
    //Luodaan metodi joka tuo muuttujan Public tasolle
    public void setVari(String uusiVari){ 
    this.vari = uusiVari;
    }
    
    //Luodaan metodi jolla haetaan muuttuja lajike julkiseksi
    public String
    getLajike(){ 
    return this.lajike;
    }
    //Luodaan metodi joka tuo muuttujan lajike Public tasolle
    public void setLajike(String uusiLajike){ 
    this.lajike = uusiLajike;
    }
    
  //Luodaan metodi jolla haetaan muuttuja paino julkiseksi
    public int
    getPaino(){ 
    return this.paino;
    }
    //Luodaan metodi joka tuo muuttujan paino Public tasolle
    public void setPaino(int uusiPaino){ 
    this.paino = uusiPaino;
    }
    
  //Luodaan luokkaan tulostus
    public String toString() {
        return 
        " Väri: "+ this.getVari() 
        + "\n" + " Lajike: " + this.getLajike() 
        + "\n" + " Paino: " + this.getPaino() + "g";
    }
    
    //Luodaan luokkaan aliohjelma jota oliot voivat hyödyntää, omenasta haukataan palanen jolloin paino vähenee
    public void haukkaa(){
    	System.out.println("Rouskis");
    	this.paino-=10;
    }

}


