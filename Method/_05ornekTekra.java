
public class _05ornekTekra {
public static void main(String[] args) {
	int[][] pascalDizisi = pascalUcgeniOlustur(5);
	pascalUcgeniniYazdırma(pascalDizisi);
}
/*
 1
 11
 121
 1331
 14641
 
 
 
 
 */
public static void pascalUcgeniniYazdırma(int[][] dizi) {
	for(int satir = 1 ; satir<=dizi.length ; satir++) {
		
		for(int sutun = 1 ; sutun<=satir ; sutun++) {
			System.out.print(dizi[satir-1][sutun-1]+" ");
		}
		System.out.println();
	}
}

public static int[][] pascalUcgeniOlustur(int boyut){
	int[][] dizi = new int[boyut][];
	for(int satir = 1 ; satir<=boyut ; satir++) {
		dizi[satir-1]= new int[satir];
		
		for(int sutun = 1 ; sutun<=satir ; sutun++) {
			if(sutun==1) {
				dizi[satir-1][0]=1;
			}else if(satir==sutun) {
				dizi[satir-1][sutun-1]=1;
			}else {
				dizi[satir-1][sutun-1]=dizi[satir-2][sutun-1]+dizi[satir-2][sutun-2];
			}
			
		}
		
	}
	return dizi;
}

}
