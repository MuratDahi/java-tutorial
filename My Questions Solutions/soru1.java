
public class soru1 {
public static void main(String[] args) {
	
	// Verilen dizinin 2. en büyük elemanını bulan java kodunu yazınız
	// girdiğimiz indexden en büyüğünü bulmak için 
	
	int enBuyuk = 0 , ikinciEnBuyuk = 0 ;
	int[] array = {-1,4,8,11,9,5,2,-5};
	
	
	for(int index = 0 ; index<array.length ; index++) {
		enBuyuk= Math.max(enBuyuk, array[index]);
		
	}
	int enBuyukIndex=-1;
	for(int indexBulma=0;indexBulma<array.length;indexBulma++) {
		if(array[indexBulma]==enBuyuk) {
			 enBuyukIndex = indexBulma;
		}
	}
	
	for(int index = 0 ;index<array.length ; index++) {
		if(index==enBuyukIndex) {
			continue;
		}
		ikinciEnBuyuk=Math.max(ikinciEnBuyuk, array[index]);
	}
	System.out.println(enBuyuk);
	System.out.println(ikinciEnBuyuk);

	
		
	}
	
}
