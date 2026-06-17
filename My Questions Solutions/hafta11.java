import java.util.Scanner;

public class hafta11 {

	public static void main(String[] args) {
		// kullanıcıdan bir string alınıcak 
				
		Scanner input = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String kelime = input.nextLine();
		
		
		System.out.print("Hangi index değerini almak istersiniz: ");
		int index = input.nextInt();
		
		if(index>=0 && index<kelime.length()) {
			char karakter = kelime.charAt(index);
			System.out.print("Girilen indexdeki değer : "+karakter);
		}else {
			System.out.println("Geçersiz index...");
		}
		
		
		
		
		// stringdeki tüm değerleri alma :
		for(int index1 = 0; index1<kelime.length();index1++) {
			char karakter1 = kelime.charAt(index);
			
			
		}
		
		
		

	}

}
