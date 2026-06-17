
public class Ders22 {

	public static void main(String[] args) {
		//                                                   FARKLI VERİ TİPLERİ İLE DİZİLER
		
		// int
		// char
		// double
		
		
		System.out.print("INT VERI TIPIYLE DIZILER: ");
		int[] sayılar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		int sayac = 0;
		
		while(sayac<sayılar.length)
		{
			System.out.println(sayılar[sayac]);
			sayac++;
		}
		
		
		System.out.println("CHAR VERI TIPIYLE DIZILER: ");
		
		char [] karakter = {'?','*',')','_','=','%',};
		int sayac1 = 0;
		while(sayac1<karakter.length)
		{
			System.out.println(karakter[sayac1]);
			sayac1++;
		}
		
		
		System.out.println(" DOUBLE VERI TIPIYLE DIZILER: ");
		
		double [] veriler = {15.8,16.7,14.56,165.5};
		int sayac2 = 0;
		while(sayac2<veriler.length)
		{
			System.out.println(veriler[sayac2]);
			sayac2++;
		}
		
		
		
		/*
		 NOT:
		 DİZİLERİ ŞU ŞEKİLDE DE TANIMLAYABİLİRİZ , 
		 
		 int[] sayilar = new int[6];
		 
		 sayilar[0]=15;
		 sayilar[1]=12;
		    .
		    .
		    .                                 BU ŞEKİLDE DE TANIMLAYABİLİRİZ.
		    .
		 sayilar[6]=123;
		 
		 
		 
		 
		 
		 
		 
		 
		 */

	}

}
