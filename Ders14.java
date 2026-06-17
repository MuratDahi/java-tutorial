
public class Ders14 {

	public static void main(String[] args) {
		//                                              TÜR DÖNÜŞÜMLERİ
		/*
		 
		             STRİNG ----> INT                             https://bizneyapiyoruzki.com/yazilim/javada-tip-donusumleri-type-casting/
		             INT ------> STRİNG 
		             DOUBLE -----> INT
		             INT -----> DOUBLE 
		             FLOAT -----> LONG 
		             LONG -----> FLOAT
		             LONG -----> STRİNG
		             FLOAT -----> STRİNG
		             BYTE -----> STRİNG 
		             
		             
		 
		  
		 
		 
		 
		 */
		
		//  STRİNG -----> INT
		
		
		String a = "57";
	int b = Integer.valueOf(a);       // BURANI'NIN ANLAMI STRİNG TİPİNDEKİ Bİ DEĞERİ INT TANIMLAYIP ONUN METODUNU KOYUP DAHA SONRA BU DEĞİŞTİRMEK İSTEDİĞİMİZ KISMA
		// BUNU KOYMALIYIZ.
		
		System.out.println("STRİNG -----> INT = "+b+7);

		
		
		// INT ------> STRİNG
		
		int ornek1 = 55;
		String ceviri = String.valueOf(ornek1);
		System.out.println("INT ------> STRİNG = "+ceviri+86);                   // EĞER DEĞER İNT TİPİNDE OLSAYID (55+86) YAPACAKTI 
		                                                 // BU DEĞERİ INT TİPİNDEN STRİNG TİPİNE ÇEVİRDİĞİMİZ İÇİN DEĞİŞMEKTEDİR. 
		
		// DOUBLE -----> INT
		  
		double ornek2 = 5.50;
		int ceviri1 = (int)ornek2;
		System.out.println("DOUBLE -----> INT = "+ceviri1);             // BURADA TÜR DÖNÜŞÜMÜ YAPTIK.
		
		// INT ------> DOUBLE 
		
		
		int ornek3 = 5 ;
		double ceviri2 = (double)ornek3;
		System.out.println("INT ------> DOUBLE = "+ceviri2);
		
		
		// FLOAT ---> LONG
		float ornek4 = 5.78f;
		long ceviri3 = (long)ornek4;
		System.out.println("FLOAT ---> LONG = "+ceviri3);
		
		
		// LONG -----> FLOAT 
		
		long ornek5 = 546;
		float ceviri4 = (float)ornek5;
		System.out.println("LONG -----> FLOAT = "+ceviri4);
		
		// LONG ----> STRING 
		
		long ornek6 = 65465;
		String ceviri5 = String.valueOf(ornek6);
		System.out.println("LONG ----> STRING = "+ceviri5+1);
		
		// FLOAT ----> STRING 
		
		float ornek7 = 4750.5f;
		String ceviri6 = String.valueOf(ornek7);
		System.out.println("FLOAT ----> STRING = "+ceviri6);
		
		// BYTE ----> STRING 
		byte ornek8 = 56;
		String ceviri7 = Byte.toString(ornek8);
		System.out.println("BYTE ----> STRING = "+ceviri7);
		
		
		
	}

}
