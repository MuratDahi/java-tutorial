import java.util.Scanner;

public class _02ornek {
public static void main(String[] args) {
	// Bir tamsayıyı parametre olarak kabul eden ve basamaklarınının değer aralığını döndüren digitRange adlı bir metot 
	// yazınız. Aralık , en büyük ve en küçük basamak değeri arasındaki farkın 1 fazlası olarak tanımlanır.
	// digitRange(68437) çağrısı 6 döndürür 8-3 +1 olur.
	// String'siz çözünüz.
	Scanner input = new Scanner(System.in);
	System.out.print("----------\nHoş Geldiniz...\n----------\nSayı Giriniz->");
	int sayi = input.nextInt();
	System.out.print("-----------\nCevap->"+digitRange(sayi));
}
public static int digitRange(int sayi) {
	int gecici = 0 , gecici1 = 10;
	while(sayi!=0) {
		int maxKontrol = sayi%10;
		sayi = sayi/10;
		gecici = Math.max(gecici, maxKontrol);
		gecici1 = Math.min(gecici1, maxKontrol);
	}
	return gecici-gecici1+1;
	// gecici = max tutar.
	
}
}
    






