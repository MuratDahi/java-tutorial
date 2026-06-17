
public class _06ornek {
public static void main(String[] args) {
	// Bir n tam sayısını parametre olarak kabul eden ve her basamak çiftinin yeri sırayla değiştiren ve yeni bir tamsayı
	// döndüren swapDigitPairs adlı bir yöntem yazınız.
	
	// Örnek :
	// 482596 ----> 845269 döndürür.
	
	// Bu sorunu string kullanmadan çözmelisiniz.
	System.out.println(swapDigitPairs(482596));
}
public static int swapDigitPairs(int sayi) {
	int power = 10 , power1 = 1;
	int toplam = 0;
	while(sayi != 0) {
	int sayıTutma = sayi%10;
	int sayıTutma1 = (sayi/10)%10;
	sayi = sayi/100;
	toplam = toplam + sayıTutma*power+sayıTutma1*power1;
	power=power*100;
	power1=power1*100;
	}
	return toplam;
	}
}
