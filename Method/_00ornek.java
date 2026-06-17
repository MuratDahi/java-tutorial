import java.util.Scanner;

public class _00ornek {

	public static void main(String[] args) {
		// Parametre olarak girilen bir tam sayının faktöriyelini hesaplayan ve bu değeri geri döndüren metodu yazınız.
		Scanner input = new Scanner(System.in);
		System.out.print("--------\nFaktöriyel'i Bulunacak Sayı->");
		int sayi = input.nextInt();
		
		System.out.println("--------\nCevap->"+faktöriyel(sayi));
		

	}
	public static int faktöriyel(int sayi) {
		int fak = 1 , sayac = 1;
		
		while(sayac<=sayi) {
			fak = sayac*fak;
			sayac++;
		}
		return fak;
		
	}
	

}
