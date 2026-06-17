import java.util.Scanner;

public class SayıToplamBulma {

	public static void main(String[] args) {
		// Girilen sayı da dahil 1 'den girilen sayıya kadar toplam bulma
		/*
		 1- Başla
		 2- Tanımla sayı , toplam = 0 , 
		 3- Klavyeden al sayi
		 4- Eğer 
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Hesaplanmasını İstediğiniz Değeri Giriniz: ");
		int sayi = input.nextInt();
        int  toplam = 0 ;
		while(sayi>=1) {
			
			toplam+=sayi;
			sayi--;
			
		}
		System.out.println(toplam);
		
		

	}

}
