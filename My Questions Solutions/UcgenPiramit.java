import java.util.Scanner;

public class UcgenPiramit {

	public static void main(String[] args) {
		//                       *
		//                      ***
		//                     *****
		//                    *******
		//                   *********
		
		/*
		  
		  
		 
		
		  
		  
		 */
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Tam Sayı Giriniz :");
		int satirSayisi = input.nextInt();
		int sutunSayisi = 2*satirSayisi-1 , sayac = 0;
		
		if(satirSayisi<=0 ) {
			System.out.println("Girilen boyut pozitif olmalıdır. ");
			
		}
		
		for(int satir = 1 ; satir<=satirSayisi ; satir++) {
			for(int sutun = 1 ; sutun<2*sutunSayisi ; sutun++) {
				// Burada sadece sembol atacak yerleri söylüyorum
				if(sutunSayisi/2+1-sayac<=sutun && sutun<=sutunSayisi/2+1+sayac) {
				System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			sayac++;
			System.out.println();
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
