import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		//  Hesap Makinesi:
		
		String mesaj = "Toplama için --->1\n"
				+"Çıkarma için --->2\n"
				+"Çarpma için --->3\n"
				+"Bölme için --->4 \nYapınız.";
		System.out.println(mesaj);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Yapmak İstediğiniz işlemi Seçiniz: ");
		
		int islemNumarası = input.nextInt();
		
		switch(islemNumarası) {
		case 1 : System.out.print("Sayı-1 Giriniz: ");
                   int toplama1 = input.nextInt(); 	
                   System.out.print("Sayı-2 Giriniz: ");
                   int toplama2 = input.nextInt(); 
                   int ToplamSonuc = toplama1+toplama2;
                   System.out.print("SAYI-1 + SAYI-2 = "+ToplamSonuc);
                   break;
                   
		case 2 :             System.out.print("Sayı-1 Giriniz: ");
                             int cıkarma1 = input.nextInt(); 	
                             System.out.print("Sayı-2 Giriniz: ");
                             int cıkarma2 = input.nextInt();
                             int CıkarmaSonuc = cıkarma1-cıkarma2;
                             System.out.print("SAYI-1 - SAYI-2 = "+CıkarmaSonuc);
                             break;
		case  3 :     System.out.print("Sayı-1 Giriniz: ");
                      int carpma1 = input.nextInt(); 	
                      System.out.print("Sayı-2 Giriniz: ");
                      int carpma2 = input.nextInt();
                      int CarpmaSonuc = carpma1*carpma2;
                      System.out.print("SAYI-1 X SAYI-2 = "+CarpmaSonuc);
                      break;
		case 4 :               
		
			  
			                System.out.print("Sayı-1 Giriniz: ");
                            int bolme1 = input.nextInt(); 	
                            System.out.print("Sayı-2 Giriniz: ");
                            int bolme2 = input.nextInt();
                            int BolmeSonuc = bolme1/bolme2;
                            System.out.print("SAYI-1 / SAYI-2 = "+BolmeSonuc);
                            break;
         default : 
        	 System.out.print("Tanım Dışı Değer Girdiniz..");

		}
		

	}

}
