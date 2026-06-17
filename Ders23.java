import java.util.Scanner;

public class Ders23 {
public static void main(String[] args) {
	
	                               // DİZİNİN ELEMANLARINI EKRANA YAZDIRMA
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("Dizi Kaç Elemanlı Olsun :");
	int diziUzunlugu = input.nextInt();
	
	String[] isimler = new String[diziUzunlugu];
	
	for(int i = 0 ; i<diziUzunlugu ; i++)
	{
		System.out.println(" Dizinin "+i+" index değerinin giriniz:");
		isimler[i]=input.next();
		
	}
	for(int a = 0 ; a<isimler.length ; a++)
	{
		System.out.println(isimler[a]);
	}
	
	
	
	
	
	
}
}
