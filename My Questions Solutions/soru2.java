
public class soru2 {
public static void main(String[] args) {

	
			int yukseklik = 7;
			for (int index = 0; index <= yukseklik; index++) {
				if (index == 0 || index == yukseklik) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			for (int index = 0; index <= yukseklik; index++) {
				if (index == 0 || index == 1 || index == yukseklik - 1 || index == yukseklik) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			for (int index = 0; index <= yukseklik; index++) {
				if (index == yukseklik - 2 || index == 2 || index == 0 || index == 1 || index == yukseklik - 1
						|| index == yukseklik) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			for (int index = 0; index <= yukseklik; index++) {

				System.out.print("*");
			}
			System.out.println();
			for (int index = 0; index <= yukseklik; index++) {
				if (index == yukseklik - 2 || index == 2 || index == 0 || index == 1 || index == yukseklik - 1
						|| index == yukseklik) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}System.out.println();
			for (int index = 0; index <= yukseklik; index++) {
				if (index == 0 || index == 1 || index == yukseklik - 1 || index == yukseklik) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			for (int index = 0; index <= yukseklik; index++) {
				if (index == 0 || index == yukseklik) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
}
