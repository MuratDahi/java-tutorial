
public class _09ornek {
public static void main(String[] args) {
	// Parametre olarak girilen bir kelimenin polindrom olup olmadığını kontrol eden ve dönüş olarak true veya false 
	// döndüren isPolindrome adlı metodu yazınız.
	
	
	// Palindrom , tersten okunuşu kendisi ile aynı olan cümle , sözcük ve sayılara denilmektedir .
	
	// Örneğin , 'kayak' kelimesinin tersi 'kayak' olduğu için 	true dönmelidir.
	System.out.println(isPolindrome("kayak"));
}


public static boolean isPolindrome(String metin) {

	
	int indexBası = 0 , indexSon = metin.length()-1;
	while(indexBası<indexSon) {
		if(metin.charAt(indexBası)!=metin.charAt(indexSon)) {
			return false ;
		}
		indexBası++;
		indexSon--;
	}
	return true;
}
}
