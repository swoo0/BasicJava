package chapter02;
//96p
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//new Scanner(System.in); 이후 Ctrl + 1

		System.out.println("정수를 입력하세요: ");
		int value1 = scanner.nextInt();
		System.out.println("글자를입력하세요: ");
        String message = scanner.next();
        
        System.out.println("입력된 값: " + value1);
        System.out.println("입력된 메시지: " + message);

        scanner.close();
	}
}
