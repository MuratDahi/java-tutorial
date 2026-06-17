import java.util.Iterator;
import java.util.Scanner;

public class _03ornek {

	public static void main(String[] args) {
		// Bir tamsayı dizisini parametre olarak kabul eden ve dizideki değerlerin benzersiz olup olmadığını gösteren 
		// bir boolean değeri döndüren isUnique adında bir yöntem yazın. Birbirine eşit değer çifti yoksa, listedeki 
		// değerleri benzersiz kabul edilir.
		// Örneğin {3,8,12,2,9,17,43,-8,46} ----> True
		// {4,7,3,9,12,-47,3,74} -----> False
		Scanner input = new Scanner(System.in);
		int[] arr = {4,7,3,9,12,-47,3,74};
		System.out.println(isUnique(arr));
	}
	public static boolean isUnique(int[] dizi) {
		for(int index = 0 ; index<dizi.length ; index++) {
			for(int indeks = index+1 ; indeks<dizi.length ; indeks++) {
				if(dizi[index]==dizi[indeks]) {
	            return false;				
				}
			}
		}
		     return true ;
	}

}
