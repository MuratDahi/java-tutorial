import java.util.Arrays;

public class ornek2 {
public static void main(String[] args) {
	
	
	int[] dizi = {1,2,3,4,5,};
	int diziBoyutu = dizi.length;
	System.out.println(diziBoyutu);
	System.out.println(dizi.length);
	System.out.println("Dizinin elemanları : ");
	for(int index = 0 ; index<dizi.length ; index++) {
		System.out.print(dizi[index]);
	}
	System.out.println();
	// Lochal Global
	

	for(int index = 0 ; index<dizi.length ; index++) {
		dizi[index] = dizi[index] *2 ;
		System.out.print(dizi[index]+ " ");
	}
	
	
	System.out.println(Arrays.toString(dizi));       
	
			
	
}
}
