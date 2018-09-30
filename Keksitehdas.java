
public class Keksitehdas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		Keksi ekaKeksi = new Keksi();
		Keksi tokaKeksi = new Keksi(50, "Suffeli");
		
		System.out.println(ekaKeksi);
		System.out.println(tokaKeksi);
		
		 ekaKeksi.setPaino(30);
		 ekaKeksi.setNimi("Domino");
		 
		 System.out.println(ekaKeksi);
		 ekaKeksi.haukkaa();
		 System.out.println(ekaKeksi);
		 ekaKeksi.haukkaa();
		 System.out.println(ekaKeksi);
		 ekaKeksi.haukkaa();
		 System.out.println(ekaKeksi);
		 ekaKeksi.haukkaa();
		 

}}
