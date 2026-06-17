
public class _10ornek {
public static void main(String[] args) {
	// Merhaba kelimesinde ki e harflerinin yerine * yazdıran metodu yazınız.
	System.out.println(yerDegistirme("merhaba"));
	
}
 public static String yerDegistirme(String metin) {
	 char hedef = 'a' ;
	 String yeniMetin ="";
    for(int index = 0 ; index<metin.length();index++) {
		if (metin.charAt(index)!=hedef) {
			yeniMetin=yeniMetin+metin.charAt(index);
			
		}
    else if(metin.charAt(index)==hedef) {
    		yeniMetin=yeniMetin+"*";
		}
    	
    }
    return yeniMetin;
}
}
