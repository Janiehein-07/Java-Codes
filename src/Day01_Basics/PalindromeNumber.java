package Day01_Basics;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int reverse = 0;
		int original = num;
		while(num>0) {
			int digit = num % 10;
			reverse = reverse*10+digit;
			num = num/10;
		}
		if(original == reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.print("not palindronme");
		}
		scan.close();

	}

}
