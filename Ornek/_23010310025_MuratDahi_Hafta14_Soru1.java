
public class _23010310025_MuratDahi_Hafta14_Soru1 {

	public static void main(String[] args) {
		// Parametre olarak girilen bir tam sayının faktöriyelini hesaplayan ve bu değeri geri döndüren faktöriyelHesapla
		// metodunu yazınız
		System.out.println(faktöriyelHesapla(5));

	}
	
	public static int faktöriyelHesapla(int girilenSayi) {
		int faktöriyel = 1 ;
		for(int sayac= 1 ; sayac<=girilenSayi ; sayac++) {
			faktöriyel*=sayac;
		}
		return faktöriyel;
		
		
		
	}

}
