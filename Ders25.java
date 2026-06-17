import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ders25 {

	public static void main(String[] args) {

		System.out.println("Asal Sayı Bulma Programına Hoşgeldiniz...");
		System.out.println("*********************************************");
		
		
         Scanner input = new Scanner(System.in);
         System.out.print("Dizinin Kaç Elemanlı Olduğunu Giriniz : ");
         int girilenSayi = input.nextInt();
         int[] sayiDizisi = new int[girilenSayi];
         
         for(int i = 0 ; i<sayiDizisi.length ; i++) {
        	 System.out.print("Dizinin "+i+". index değerini giriniz : ");
        	 
        	 
        	 sayiDizisi[i]= input.nextInt();
         }
		
		
	    
	}

}
