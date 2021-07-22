/* Artamis Karrys
07/21/2021
Project that involves making a scanner class that takes user input and repeats the input inserted into scanner
*/
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// make a scanner that repeats user input
		Scanner ab = new Scanner(System.in);
		System.out.println("You stated: " + ab.nextLine());
		ab.close();
	
	}

}
