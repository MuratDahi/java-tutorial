import java.util.Iterator;
import java.util.Scanner;

public class _03Ornek {
public static void main(String[] args) {
	// Kullanıcıdan alınan 10 boyutlu bir dizinin ikinci en büyük elemanını diziyi sıralamadan bulan ve bu elemanı ekrana
	// yazan java kodu.
	
	Scanner input = new Scanner(System.in);
	int[] diziler = new int[10]; 
	int max = diziler[0] , ikinciMax = diziler[0] , sayac = 0,gecici=0;
	for(int index = 0 ; index<=9 ; index++) {
		System.out.print("-------\nDizinin "+index+" değerini giriniz -->");
		diziler[index] = input.nextInt();
	}
	for(int index = 0 ; index<diziler.length; index++) {
		max = Math.max(max,diziler[index]);
		if(max==diziler[sayac]) {
			gecici=sayac;
		}
		sayac++;
		
	}
	System.out.println(gecici);
	System.out.println(max);
	
	for(int indeks = 0 ; indeks<gecici  ; indeks++) {
		ikinciMax=Math.max(ikinciMax, diziler[indeks]);
	}
	
	
	for(int index1=gecici+1;index1<diziler.length ;index1++) {
		ikinciMax=Math.max(ikinciMax,diziler[index1]);
	}
	
	System.out.println(ikinciMax);
	
	
 }
}
