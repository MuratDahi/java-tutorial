
public class _07ornek {
public static void main(String[] args) {
	// Kullanıcının girmiş olduğu kelimeyi parametre olarak alan bu kelimeyi tersini döndüren tersCevir metodu.
	// Murat  ---> taruM
	
	System.out.println(tersCevir("murat"));
}

public static String tersCevir(String metin) {
	String geriMetin = "";
	for(int index = metin.length()-1 ; index>=0 ; index-- )  {
	char gecici = metin.charAt(index);
	
	geriMetin = geriMetin + gecici ;
	
	}
	return geriMetin ;
	
}
}
