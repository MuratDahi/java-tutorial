
public class _23010310025_MuratDahi_Hafta14_Soru3 {

	public static String toBinary(int girilenSayi) {
		// girilen sayı 0 ise 0 olacak ilk if'e onu yaz
		String geriDönecekMetin="";
		if(girilenSayi==0) {
			
			String geriDönecek = "0";
			return geriDönecek;
		}else {
			while(girilenSayi!=0) {
				if (girilenSayi%2==0) {
					geriDönecekMetin="0"+geriDönecekMetin;
					girilenSayi=girilenSayi/2;
				}else {
					geriDönecekMetin="1"+geriDönecekMetin;
					girilenSayi=girilenSayi/2;
				}
			}
		}
		return geriDönecekMetin;
		
		 
	}
	
	public static void main(String[] args) {
		// Bir tamsayıyı parametre olarak kabul eden ve bu tam sayının ikili gösterimini içeren bir string döndüren
		// toBinary isminde bir yöntem
		System.out.println(toBinary(44));

	}

}
