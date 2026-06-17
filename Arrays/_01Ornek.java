
public class sadas {
public static void main(String[] args) {
	System.out.println(yerDegistirme("merhaba"));
}
// Merhaba kelimesinde ki e harflerinin yerine * yazdıran metodu yazınız.

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
return yeniMetin ;
}
}
