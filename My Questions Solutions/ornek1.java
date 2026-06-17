
public class ornek1 {

	public static void main(String[] args) {
		/*
		 
		                                          PASCAL TRİANGLE
		                                          
		 
		 
		 */
		int size = 5;
		for(int satir = 0 ; satir < size;satir++) {
			int toplam = 1;
			for(int sutun = 0 ; sutun <= satir ; sutun++ ) {
				System.out.print(toplam+" ");
				toplam = toplam * (satir - sutun)/(sutun+1);
			}
			System.out.println();
		}

	}
	// satir = 0 
	// sutun = 0
	// toplam = 1
	// size = 5 
	

}
