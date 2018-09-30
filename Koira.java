class Koira {
    int ikä;
    String nimi, rotu, ääni;
    
	public Koira(int ikä, String nimi, String rotu, String ääni) {
		this.ikä = ikä;
		this.nimi = nimi;
		this.rotu = rotu;
		this.ääni = ääni;
	}
	public void tulostaTiedot() {// metodi tulostaTiedot()
		System.out.println("Nimi: " + nimi + "\n" + "Ikä: " + ikä + "\n" + "Rotu: " + rotu);
		
	}
	public String annaÄäni() {// metodi annaÄäni()
		return ääni;
		
	}}

public class KoiranTesti {
    public static void main(String[] args) {
        Koira rekku = new Koira (2, "Rekku", "Dalmatialainen", "Hau!!!");
        Koira nelli = new Koira (4, "Nelli", "Australianterrieri", "hauhau");

        System.out.println("Koiran tiedot:");
        rekku.tulostaTiedot();
        System.out.println("Koira sanoo: " + rekku.annaÄäni());
        System.out.println();
        nelli.tulostaTiedot();
        System.out.println("Koira sanoo: " + nelli.annaÄäni());
    }
}