
public class Ders8 {

	public static void main(String[] args) {
		/*                                            ARTTIRMA VE AZALTMA OPERATORLERİ


                                  ARTTIRMA OPERATORU : ++     -------->  1 ARTTIRMAK İÇİN KULLANILIR.
                                  
                                  
                                  AZALTMA OPERATORU : --     ---------> 1 AZALTMAK İÇİN KULLANILIR 

 
         */
		
		                                // COMMAND : YORUM SATIRI
		int a = 5 ;
		
		System.out.println("A'nın İlk Değeri: "+a);
		
		
		int b = 8;                                           // NOT : ++B DEMEK İLK ÖNCE ARTTIR B'YE YAZ DAHA SONRA EKRANA ÇIKTI VER VEYA B'NİN YENİ DEĞERİNİN ATA.
                                                             // NOT : B++ DEMEK İLK OLARAK B'NİN İLK DEĞERİNİ EKRANA YAZ DAHA SONRA B'Yİ ARTTIR.		
		System.out.println("B'nın İlk Değeri: "+b);
		
		int gecici;
		
		
		gecici= a++ + b++;
		
		System.out.println(gecici);                        // BURAYI HER GÖRDÜĞÜNDE KENDİNE SAYGIN OLSUN BİR ÖRNEK ÇÖZ 
		
		System.out.println("A'nın Yeni Değeri: "+a);
		System.out.println("B'nın Yeni Değeri: "+b);
		
                                                     // ÇIKARMA OPERATORU(--)  BU DA ÜSTTEKİ ÖRNEĞİN + YERİNE - KONULMASI İLE OLUŞUR.
		
		
		
		
	}

}
