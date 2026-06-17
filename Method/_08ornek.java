
public class _08ornek {
public static void main(String[] args) {
	// Parametre olarak bir boyutlu bir dizi ve bir hedef tam sayısı verilen ve bu dizi içerisinde ki 2 sayının toplamı ile 
	// hedef sayı bulunuyorsa false döndüren twoSum isminde metot .
	
	// Örneğin [2,7,11,15] ve hedef 9 olsun bu girdi için true olmalıdır.
	// 
	int dizi[] = { 2 , 7 , 11 , 15 } ;
	int hedef = 9 ;
	System.out.println(twoSum(dizi,hedef));
}
 public static boolean twoSum(int[] dizi , int sayi) { 
	for(int index = 0 ; index<dizi.length; index++) {
		for(int indeks = index+1 ; indeks <dizi.length ; indeks++) {
			if(dizi[index]+dizi[indeks]==sayi) {
				return true ;
			}
		}
	}
	return false ;
}
}
