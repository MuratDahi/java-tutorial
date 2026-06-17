import java.util.Scanner;

public class DizilerÖrnek {
public static void main(String[] args) {

	// * * * * *
	// *       *
	// *       *
	// *       *
	// * * * * *
	
	Scanner input = new Scanner(System.in);
	System.out.print("--------\nKarenin Boyutu->");
	int kenarUzunlugu = input.nextInt();
	for(int satır = 1 ; satır<=kenarUzunlugu ; satır++) {
		for(int sutun = 1 ; sutun<=kenarUzunlugu ; sutun++) {
			if(satır==1 || satır==kenarUzunlugu || sutun==1 ||sutun==kenarUzunlugu) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
}

}
