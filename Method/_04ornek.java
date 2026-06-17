import java.util.Scanner;

public class _04ornek {
public static void main(String[] args) {
	// Bir tamsayı dizisini parametre olarak kabul eden ve dizideki çift sayıların yüzdesini gerçek bir sayı olarak
	// döndüren ciftOrani isminde bir yöntem yazın . Örneğin,[6,2,9,11,3] dizisi verildiğinde metot 40.0 değerini
	// göndermelidir. Eğer dizide hiç çift eleman yoksa ve boş bir dizi ise 0.0 değeri dönmelidir.
	Scanner input = new Scanner(System.in);
	System.out.print("------------\nHoş geldiniz...\n---------\nDizinin Eleman Sayısını Giriniz ->");
	int eleman = input.nextInt();
	int[] dizi = new int[eleman];
	for(int index = 0 ; index<dizi.length ; index++) {
		System.out.print("---------\nDizinin "+index+" değeri ->");
		dizi[index]=input.nextInt();
		System.out.println(dizi.length);
	}
	System.out.print("---------\nÇift Sayıların Oranı->"+ciftOrani(dizi));
	
 }
 public static double ciftOrani(int[] dizi) {
	 double ciftSayi = 0 , tekSayi = 0;
	for(int index = 0 ; index<dizi.length ; index++) {
		if(dizi[index]%2==0) {
			ciftSayi++;
		}else {
			tekSayi++;
		}
		
	}
	return (ciftSayi/dizi.length)*100;
    	
	
}
}
