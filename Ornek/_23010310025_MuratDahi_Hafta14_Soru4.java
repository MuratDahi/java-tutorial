
public class _23010310025_MuratDahi_Hafta14_Soru4 {
public static int swapDigitPairs(int sayi) {
	
	int toplam = 0 ,basamaklarıAyırma=1 , basamakSayısı=1  ;
	while(sayi>=10) {
		int ilkSayi = sayi%10;           // ilkSayi = 8
		int soldakiSayi = sayi/10%10;    // soldakiSayi=6
		
		//  Her zaman soldakiSayi ilkSayi'dan fazla bir sıfır gerektirir. Bu yüzden birini 10 ile diğerini 1 ile carp,
		// daha sonra basamaklarıAyırmayı 2'şerli kontrol ettiğin için 1--->100--->10000 2 sıfır ekleyerek git.
		toplam += ilkSayi * 10 * basamaklarıAyırma + soldakiSayi *1 * basamaklarıAyırma ;
		
		basamaklarıAyırma=basamaklarıAyırma*100;
	// 2şerli kontrol ettiğin için 100 ile bölerek 2 şerli ayır.	
		sayi=sayi/100;
		basamakSayısı=basamakSayısı+2;
		
	}
	if(sayi==0) {
		return toplam;
	}else {
		for(int i = 1 ; i<basamakSayısı ; i++) {
			sayi=sayi*10;
		}
	}
	return toplam+sayi;
}
		
	public static void main(String[] args) {
            
		
		//1268
		
		// Bir pozitif tamsayıyı parametre olarak kabul eden ve her basamak çiftinin yerini sırayla değiştiren
		// ve yeni bir tamsayı döndüren swapDigitPairs isminde bir yöntem yazın.
		// Örne ğin , swapDigitPairs(482596) 845269 döndürür. 9 ve 6, 2 ve 5'in 4 ve 8'in yer değişmiştir.
		
		// Sayı tek sayıda 	basamak içeriyorsa , en soldaki basamağı orjinal yerinde bırakılmalıdır.
		// Örneğin , swapDigitPairs(1234567) 1325476 döndürür.
		//Not: String kullanılmadan çözülmelidir.
		
		System.out.println(swapDigitPairs(2751268));

	}

}
