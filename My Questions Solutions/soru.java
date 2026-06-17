import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class soru {
public static void main(String[] args) {
	
	// 3 elemanlı bir dizinin elelmanlarını klavyeden alan bu dizinin elemanlarının toplamını bulan java kodu
	
	int size = 3;
	int[] dizi = new int[size];
	Scanner input = new Scanner(System.in);
	
	System.out.println("Lütfen "+size+" adet sayi giriniz: ");
	for(int index = 0 ; index<size; index++)
	{
		System.out.print("Lütfen bir sayı giriniz : ");
		dizi[index] = input.nextInt();
		
	}
	int toplam = 0;
	for(int index = 0 ; index < dizi.length ; index++ )
	{
		toplam = toplam + dizi[index];
		System.out.print(dizi[index]+" ");
		
	}
	System.out.println("\nDizinin elemanları toplamı : "+ toplam);
}
}
