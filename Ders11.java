
public class Ders11 {

	public static void main(String[] args) {
		//                                       LOGİCAL OPERATORLER

		/*
		 *                                   VE OPERATORU (&&)
		 * 
		 *                     BU OPERATOR KOŞUL SORGULAMASINDA TÜM DURUMLAR DOĞRUYSA TRUE VERİR YANLIŞ BİR
		 *                     TANE DAHİ OLURSA FALSE VERİR.
		 * 
		 *                BU OPERATOR ÇARPMA İŞLEMİ GİBİ GÖRÜLEBİLİR.
		 * 
		 * 
		 */

		int a = 587;
		int b = 45;
		
		
		boolean sonuc = a>500 && b>40;
		System.out.println(sonuc);

		
		   /*                                             VEYA OPERATORU ( || )
	     
		                             EĞER DURUMLARDAN BİR TANE DURUM DOĞRUYSA TRUE VERİR 
		                             TÜM DURUMLAR YANLIŞSA FALSE VERİR
		                             
		                             BU İŞLEM TOPLAMA GİBİ DÜŞÜNÜLEBİLİR.
		    
		    
		    
		    */
		
		
		int sayi1 =  45546;
		int sayi2 = 45465;
		
		boolean sonuc1 = sayi1>500 || sayi2>40;
		System.out.println(sonuc1);
		
		
		
		
		   /*                                     TERNANY OPERATOR ( ?: ) 
		    
		     
		                            BU OPERATOR BİR KOŞULU EĞER ÖYLEYSE "İLK OLANI" YAZ DEĞİLSE "İKİNCİYİ" YAZ DİYE OKUNUR.
		                            
		                            --İLK OLARAK KOŞUL YAZILIR DAHA SONRA SORUSU SORULUR GİBİ DÜŞÜNÜLÜR SORU İŞARETİ GELİR DAHA SONRA İKİ NOKTA İLE YANLIŞSA BU GELSİN
		                            DİYE DÜŞÜNÜLÜR..----
		                            
		                            ÖRNEK :  boolean x = 5<7 ? yes : false ;
		     
		    *
		    */
		
		int x = 454;
		int y = 78578;
		
		
		boolean kosul = x>y ? true : false ;
		System.out.println(kosul);
		
		int gecici = x>y ? 10 : 20 ;
		System.out.println(gecici);
		
		String gecici1 = x<y ? "DOĞRU" : "YANLIŞ";
		System.out.println(gecici1);
		
		
		
		/*                                   DEĞİL OPERATORU  ( ! ) 
		 
		 
		                          BU İŞARET BİR SAYININ TAM TERSİNİ ALDIĞIMIZI GÖSTERİR. 
		                          
		                          
		                          
		 
		 */
		
		        boolean kasık = !true;                                    // TAM TERSİ ANLAMINA GELİR
		        System.out.println(kasık);
		
		        
		        
		
	} 

}
