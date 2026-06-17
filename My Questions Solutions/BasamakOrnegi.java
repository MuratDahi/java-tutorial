import java.util.Scanner;

public class BasamakOrnegi {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Lütfen Sayıyı Giriniz: ");
	int sayi = input.nextInt();
	int sayac = 1;
	while(sayi>=10 || sayi<=-10) {
		sayi = sayi/10;
		sayac++;
	}
	System.out.println("Girilen sayı "+sayac+" basamaklıdır.");
	
			
}
}
