
public class JuomaAutomaatti2 {
	//Luodaan konstruktori
	
		public JuomaAutomaatti2() {
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
}
