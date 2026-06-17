
public class Ders3Long {

	public static void main(String[] args) {
		/*                                        LONG VERİ TİPİ 
		
		                                   ÇOK BÜYÜK SAYILAR İÇİN KULLANILIR.    ------> 8 BYTE 
        */
		
		long sayi = 1597544;
		
		
		System.out.println(sayi);
		
		
		//                    EĞER SAYI ÇOK BÜYÜKSE TANIMLADIĞIMIZ SAYININ SONUNA "L" İŞARETİ KOYABİLİRİZ.
		
		
		
		long sayi1 = 45416513265L;
		
		System.out.println(sayi1);
		
		
		
		
		
		//                     LONG VERİ TİPİNİN MAX ALABİLECEĞİ DEĞER OLARAK TANIMLAMAK İSTERSEK "Long.MAX_VALUE" KOMUTUNU KULLANABİLİRİZ.
		
		
		long c = Long.MAX_VALUE;
		System.out.println(c);
		
		
		//                     MİNUMUM İÇİN  "Long.MIN_VALUE" KOMUTU KULLANILIR.        İNGİLİZCEDE     i-I olduğu için MİN değil MIN
		
		
		long d = Long.MIN_VALUE;
		
		System.out.println(d);
	}

}
