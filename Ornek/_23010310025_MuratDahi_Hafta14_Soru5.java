
public class _23010310025_MuratDahi_Hafta14_Soru5 {

	public static Boolean twoSum(int[] dizi , int hedef) {
	
		
		// Dizinin ilk aldığımız değeri ile bundan sonraki değeri ile karşılaştırma yapacağız , 
		// daha sonra if else yap bitir , if--> true ver for ' dan cık.
		for(int index = 0 ; index<=dizi.length ; index++) {
			
			for(int index1 = index+1 ; index1<dizi.length ; index1++) {
				if(dizi[index]+dizi[index1]==hedef) {
					
					return true;
				}
				
			}
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		// Parametre olarak bir boyutlu dizi ve bir hedef tam sayısı verilen ve bu dizi içerisindeki 2 sayının toplamı
		// ile hedef sayı bulunuyorsa true bulunmuyorsa false döndüren twoSum adlı yöntemi yazınız .
		

		int dizi[] = {1,2,3,4};
		int i = 7;
		System.out.println(twoSum(dizi, i));
		
	}

}
