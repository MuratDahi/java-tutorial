import java.util.Scanner;

public class StringDegerleriKarsılastırma {

	public static void main(String[] args) {
		// Burada String metodları karşılaştırmayı öğreneceğiz.
		
		// Metotlar : 
		/*
		 1- equals(parametre)
		 2- equalslgnoreCase
		 3- startWith 
		 4- endsWith 
		 5- contains 
		 */
		
		Scanner input = new Scanner(System.in);
		String myBlog = "www.emrecelen.com.tr",seninKararin;
		System.out.println("----------\n->Program İşlemleri\n--------\n1- Programı Başlat\n2- Programı Sonlandır\n--------");
		System.out.print("Kararınız->");
		seninKararin=input.nextLine();
		
		
		if(seninKararin.equals("1") || seninKararin.equalsIgnoreCase("Başlat")) {
			
			// Burada "equals" ve "equalsIgnoreCase" metotları kullanılmıştır :
			
			// equals: String içindeki değeri metin ile eşit olup olmadığını karşılaştırı.
			
			// equaslIgnoreCase: Eşitliği kontrol ederken equals'de olduğu gibi büyük/küçük harf uyumunu önemsemeden metini
			// karşılaştırır.
			
			System.out.println("------\n->Program Başlatıldı.\n->İşlenecek String Metin:"+myBlog+"\n------");
			
			// Burada "startsWith" ve "endsWith" kullanımı yaptık bunlar şu işe yarar:
			// 1-startsWith: Değişkenimiz içerisinde bulunan metinin verilen parametre ile başlayıp başlamadığını kontrol
			// eder.
			
			// 2-endsWith: Değişken üzerindeki metnin parametre olarak belirtilen metin ile bitip bitmediğini kontrol eder.
			
			
  System.out.print("->startsWith('emre') Kullanımı:"+myBlog.startsWith("emre")+
		
		"\n->endsWith('tr') Kullanımı:"+myBlog.endsWith("tr"));			

  System.out.print("\n-> contains('celen') Kullanımı:"+myBlog.contains("celen")+
		"\n------");

			
			
		}
		else if(seninKararin.equals("2") || seninKararin.equalsIgnoreCase("başlatma")){
			System.out.print("\n--------------\n->Programı Sonlandırıldı.\n--------");
			
		}
		else {
			System.out.println("----------\n->Tanımsız Değer Girdiniz\n->Program Sonlandırıldı.\n-------");
		}
				
		

	}
	Scanner input = new Scanner(System.in);
	String myBlog = "www.emrecelen.com.tr",seninKararin;
	

}
