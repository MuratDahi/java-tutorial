import java.util.Scanner;

public class StringKullanımı {
public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);
	System.out.print("Lütfen Metin'i Giriniz :");
	
	// Burada String ile bir isim aldık.
	String myName = input.nextLine();
	
	// Burada Metinin Uzunluğunu Bulduk ve Not Olarak Şunu Ekle Cümle Falan Yazarsak Harf Sayısını Not Ediyor ve
	// Boşluk sayısını alıyor 
	
	System.out.print("------\n->Yapacağımız İşlemler:\n1-Metin Uzunluğu:"+myName.length());
	
	
	// Burada girilen cümlede ilk kullanıcıdan metin giriliyor daha sonra o metinde kullanılan karakterin
	// ilk nerede kullanıldıysa onun sırasını bir eksik şekilde veriyor.
	System.out.print("\n2-Ç harfi kaçıncı indis numarasında:"+myName.indexOf("ç"));
	
	// substring(Parametre): Parametre kısmına tanımlanan indis numarasından sonra ekrana yazdırma işlemi gerçekleştirilir.
	// Parametre kullanılırken başlangıç ve bitiş indis değerlerini substring(Parametre1,Parametre2) şeklinde belirtirsek
	// girilen indis değer aralığındaki metini yazar.
	
	
	// Substring(5) kullanımı 5 dahil ve ondan sonraki değerleri ekrana yazar.
	// Substring(0,4) kullanımı ilk girilen indis dahil son girilen indis dahil değil anlamına gelir.
	System.out.println("\n3-Substring(5) kullanımı:"+myName.substring(5)+"\n4-Substring(0,4) Kullanımı:"+
	myName.substring(1,4));
	
	
	// toLowerCase(): Metin içindeki tüm kelimeleri küçük harfe çevirir.
	System.out.print("\n5-toLowerCase Kullanımı:"+myName.toLowerCase());
	
	// toUpperCase(): Metin içindeki tüm kelimeleri büyük harfe çevirir.
	System.out.print("\n6-toUpperCase Kullanımı:"+myName.toUpperCase());
	
	
	
	
	
	
	
	
	
		
	}
}
