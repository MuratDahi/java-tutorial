import java.util.Scanner;

public class _02Ornek {
public static void main(String[] args) {
	// 1 0 0 0 0
	// 1 1 0 0 0
	// 1 2 1 0 0
	// 1 3 3 1 0
	// 1 4 6 4 1
	
	Scanner input = new Scanner(System.in);
	int toplam = 0 , gecici;
	System.out.print("-----\nPascal Boyutu->");
	int boyut = input.nextInt();
	int[][] toplamaDizisi = new int[boyut][boyut];
	
	for(int satır = 1 ; satır<=boyut ; satır++) {
		for(int sutun = 1 ; sutun<=boyut ; sutun++) {
			if(sutun<=satır ) {
				if (sutun==1 ) {
					System.out.print("1 ");
					toplamaDizisi[satır-1][sutun-1]= 1 ;
				}
				else if (2<=sutun && sutun<=satır) {
					toplamaDizisi[satır-1][sutun-1]=toplamaDizisi[satır-2][sutun-1]+toplamaDizisi[satır-2][sutun-2];
					System.out.print(toplamaDizisi[satır-1][sutun-1]+" ");
					
				}
				
			}
			
			else {
				System.out.print("  ");
				// Burası sıfırları temsil eder.
				toplamaDizisi[satır-1][sutun-1]= 0;
			}
		}
		System.out.println();
	}
	
}
}
