import java.util.Scanner;

public class FaktoriyelOrnegi {

	public static void main(String[] args) {
		// Faktoriyel Örnegi :
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Faktöriyelini Bulmak İstediğiniz Sayıyı Giriniz: ");
		int sayi = input.nextInt();
		int faktorıyel = 1;
		if(sayi>=0) {
		while(sayi>0) {
			faktorıyel*=sayi;
			sayi--;
			}
		System.out.println("Sayının faktöriyel Değeri :"+faktorıyel);
		}
		else
		{
		System.out.println("Lütfen 0 veya pozitif bir sayı giriniz.");	
		}
		
		
			
		

	}

}
