
public class JuomaAutomaatti {
	
	//Luodaan konstruktori
	
	public JuomaAutomaatti() {
		this.kaakaota = 50; 
		this.kahvia = 50;
		this.teetä = 50;
		}
	
	//Luokan attribuutit
	
	private int teetä;
	private int kahvia;
	private int kaakaota;
	
	//Getterit ja setterit
	
	public int getTeetä() {
		return teetä;
	}
	public void setTeetä(int teetä) {
		this.teetä = teetä;
	}
	public int getKahvia() {
		return kahvia;
	}
	public void setKahvia(int kahvia) {
		this.kahvia = kahvia;
	}
	public int getKaakaota() {
		return kaakaota;
	}
	public void setKaakaota(int kaakaota) {
		this.kaakaota = kaakaota;
	}
	
	//metodit juomien valmistukseen
	
	public void valmistaKahvi() {
		System.out.println("Odota hetki, Kahvisi valmistuu. ");
		if (this.kahvia -10 < 0) { //tarkistaa, että paino ei ole pienempi kuin nolla
	    	this.kahvia = 0; 
	    	System.out.println("Kahvia ei ole enää jäljellä! Täytä säiliö.");
	    	}
	    	
	    	else this.kahvia -= 10; //vähentää juoman määrää -10
		
		System.out.println("Kahvia on jäljellä: " + this.kahvia + " yksikköä. Teetä on jäljellä: " + this.teetä + " yksikköä. Kaakaota on jäljellä: " + this.kaakaota + " yksikköä." +"\n");
	}
	public void valmistaTee() {
		System.out.println("Odota hetki, Teesi valmistuu. ");
		if (this.teetä -10 < 0) { //tarkistaa, että paino ei ole pienempi kuin nolla
	    	this.teetä = 0; 
	    	System.out.println("Teetä ei ole enää jäljellä! Täytä säiliö.");
	    	}
	    	
	    	else this.teetä -= 10; //vähentää juoman määrää -10
		
		System.out.println("Kahvia on jäljellä: " + this.kahvia + " yksikköä. Teetä on jäljellä: " + this.teetä + " yksikköä. Kaakaota on jäljellä: " + this.kaakaota + " yksikköä." +"\n");
		
	}
	public void valmistaKaakao() {
		System.out.println("Odota hetki, Kaakaosi valmistuu. ");
		if (this.kaakaota -10 < 0) { //tarkistaa, että paino ei ole pienempi kuin nolla
	    	this.kaakaota = 0; 
	    	System.out.println("Kaakaota ei ole enää jäljellä! Täytä säiliö.");
	    	}
	    	
	    	else this.kaakaota -= 10; //vähentää juoman määrää -10
		
		System.out.println("Kahvia on jäljellä: " + this.kahvia + " yksikköä. Teetä on jäljellä: " + this.teetä + " yksikköä. Kaakaota on jäljellä: " + this.kaakaota + " yksikköä." +"\n");
	}
	public boolean onnistuuko() {
		int luku = (int)(Math.random() * 100+1);
		if (luku <= 25 && luku > 0) {
		return false; }
		else return true;

}}
