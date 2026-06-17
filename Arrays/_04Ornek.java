import java.util.Scanner;

import javax.xml.transform.Source;

public class _04Ornek {
public static void main(String[] args) {
	// Kum saati:
	/*
	 
	 *      *        
	 **    **
	 ***  ***
	 ********
	 ***  ***
	 **    **
	 *      *
	       
	       
	 */
	Scanner input = new Scanner(System.in);
	System.out.print("---------\nBoyut İçin Tek Sayı Gir->");
	int boyut = input.nextInt();
	// İlk aşama :
	int sütünSayısı = ((boyut/2)+1)*2;
	for(int satır = 1 ; satır<=boyut/2 ; satır++) {
		for(int sütün = 1 ; sütün<=sütünSayısı ; sütün++) {
			if(sütün<=satır || sütün>sütünSayısı-satır) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
		
	}
	// İkinci aşama :
	for(int i = 1 ; i<=sütünSayısı ; i++) {
		System.out.print("* ");
	}
	System.out.println();
	
	// Üçüncü Aşama :
	for(int satir1 = boyut/2 ; satir1>=1 ; satir1--) {
		for(int sütün1 = 1 ; sütün1<=sütünSayısı ; sütün1++) {
			if(sütün1<=satir1) {
				System.out.print("* ");
			}else if(sütünSayısı-satir1<sütün1 && sütün1<=sütünSayısı) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			
			
			
		}
		System.out.println();
	}
}
}

		
	
	
