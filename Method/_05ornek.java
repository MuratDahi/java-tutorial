public class _05ornek {
	/*
	 Şimdi biraz düşünelim :
	 
	 Boyut = 5 
    - Kare gibi düşünebiliriz. Bir dizi tanımlayacağız dizi[boyut][boyut]	 
	 1             
	 1 1 
	 1 2 1
	 1 3 3 1
	 1 4 6 4 1
	 */
	public static void main(String[] args) {
		
		System.out.println(pascalUcgeniOlusturma(3));
	
	
	
	
}
	public static int[][] pascalUcgeniOlusturma(int boyut){
		int[][] geriDöndür = new int[boyut][boyut];
		for(int satir = 1 ; satir<=boyut ; satir++) {
			for(int sutun = 1 ; sutun<=boyut ; sutun++) {
				if(sutun==1) {
					geriDöndür[satir-1][0]=1;
				}else if(sutun>satir) {
					geriDöndür[satir-1][sutun-1]=0;
				}else if(sutun<=satir) {
					geriDöndür[satir-1][sutun-1]=geriDöndür[satir-2][sutun-1]+geriDöndür[satir-2][sutun-2];
				}
			}
			
		}
		return geriDöndür;
	}
	public static void düzenleme(int[][] dizi) {
		for(int satır = 0 ; satır<dizi.length ;satır++ ) {
			for(int sutun = 0 ; sutun<dizi.length ; sutun++) {
				if(dizi[satır][0]) {
			}
		}
		
	}
	}