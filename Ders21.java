
public class Ders21 {

	public static void main(String[] args) {
		//                                        DİZİLER'E DEĞER ATAMA VE YAZDIRMA
		
		
		String [] isimler = {"Ali","Veli","Murat","Oğuz","Ceyhun"};
		
		int sayac = 0;
		
		while(sayac<isimler.length)                          // .lenght komutu o dizide kaç tane eleman olduğunu söyler bunun
                                                             // bir eksiği komutun kaç tane yazdıracağını söyler.	Yani "isimler.lenght = 5" ama index 4 ' de son
			                                                 // bulacağı için küçük eşit değilde küçük işareti kullanılır.
		{
			System.out.println(isimler[sayac]);
			sayac=sayac+1;
				
		}

	}

}
