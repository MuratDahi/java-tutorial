import java.util.Scanner;

public class Ders16 {

	public static void main(String[] args) {
		//                                           SWİTCH - CASE YAPISI
		
		Scanner input = new Scanner(System.in);
		System.out.print("SAYI GİRİNİZ : ");
		int sayi = input.nextInt();
		
		switch(sayi)
		{
		case 1 : 
			System.out.println("PAZARTESİ");
			break;
		case 2 : 
			System.out.println("SALI");
			break;
		case 3 : 
			System.out.println("ÇARŞAMBA");
			break;
		case 4 : 
			System.out.println("PERŞEMBE");
			break;
		case 5 : 
			System.out.println("CUMA");
			break;
		case 6 : 
			System.out.println("CUMARTESİ");
			break;
		case 7 : 
			System.out.println("PAZAR");
			break;
			default :
			{
				System.out.println("Lütfen 1 ile 7 arasında bir tam sayı giriniz.");
			}
				
			
		}
	}

}
