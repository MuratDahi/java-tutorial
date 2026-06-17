import java.beans.IntrospectionException;
import java.util.Scanner;

public class _01ornek {
public static void main(String[] args) {
	// Bir tamsayıyı parametre olarak kabul eden ve bu tamsayının binary gösterimini içeren bir string döndüren toBinary
	// adlı metot yazınız. 
	// Örnek :
	// binary(44) çağrısı "101100" döndürür.
	Scanner input = new Scanner(System.in);
	System.out.print("---------\nTo Binary Makinesine Hoşgeldiniz...\n---------\nSayi Giriniz->");
	int sayi = input.nextInt();
	
	System.out.print("---------\nCevap->"+toBinary(sayi));
}

public static String toBinary(int sayi) {
	String metin = "";
	while(sayi!=0) {
	if(sayi%2==0) {
		metin="0"+metin;
		sayi=sayi/2;
	}else {
		metin="1"+metin;
		sayi=sayi/2;
	}
	
	}
	return metin;
	
}

}
