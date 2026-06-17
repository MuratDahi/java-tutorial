
public class _23010310025_MuratDahi_Hafta14_Soru2 {

	public static double ortalamaHesaplama(double[] girilenDizi) {
		// dizi {1,3,5,7} olsun 
		// dizinin birinci elemanı alıp bunu bir sonraki index'den başlayacak şekilde max alalım
		double MaxVeMin1 = girilenDizi[0];
		double MaxVeMin2 = girilenDizi[0];
		for(int index = 1 ; index<girilenDizi.length ; index++) {
			
			 MaxVeMin1 = Math.max( MaxVeMin1, girilenDizi[index]);
		}
        for(int index = 1 ; index<girilenDizi.length ; index++) {
			
			 MaxVeMin2 = Math.min(MaxVeMin2,girilenDizi[index]);
		}
        return (MaxVeMin1+MaxVeMin2)/2;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// Tamsayı dizisini parametre olarak alan ve bu dizideki en büyük ve en küçük değerin toplamının yarısını
		// geri döndüren ortalamaHesaplama isminde bir metot yazınız.

		double[] girilenDizi = {-4,12,7,5};
		System.out.println(ortalamaHesaplama(girilenDizi));
		
		
		
}
}
