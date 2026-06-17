import java.util.Scanner;

public class calısma {
	// Bir tamsayı dizisini parametre olarak kabul eden ve dizideki çift sayıların yüzdesini gerçek bir sayı olarak
		// döndüren ciftOrani isminde bir yöntem yazın . Örneğin,[6,2,9,11,3] dizisi verildiğinde metot 40.0 değerini
		// göndermelidir. Eğer dizide hiç çift eleman yoksa ve boş bir dizi ise 0.0 değeri dönmelidir.
public static void main(String[] args) {

int dizi[] = { 6,2,9,11,3} ;
System.out.println( "%"+ciftOrani(dizi)+" çifttir.");
	
	
}
public static int ciftOrani(int[] dizi) {
	
	int ciftSayaci = 0 , tekSayaci = 0 ;
	
	for(int index = 0 ; index<dizi.length ; index++) {
		if(dizi[index]%2==0) {
			ciftSayaci++;
		}else {
			tekSayaci++;
		}
	}
	return ciftSayaci*100/(tekSayaci+ciftSayaci);
}
	
}

