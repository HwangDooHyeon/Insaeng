package Utility;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.NoSuchElementException;


public class ScanManager {
    private static Scanner scanner;

    public static void Initialize()
    {
        scanner = new Scanner(System.in);
    }

    public static int Scan()
    {
        int num = 0;

        while(num < 1 || 5 < num){
            try {
//                System.out.println("1. 학교");
//                System.out.println("2. 알바");
//                System.out.println("3. 파티");
//                System.out.println("4. 외출");
//                System.out.println("5. 상태확인");
//                System.out.println("===================================");
                System.out.print("입력 : ");
                num = scanner.nextInt();
                scanner.nextLine();

                if(!(0 < num && num < 6))
                    System.out.println("1 ~ 5 사이의 값을 입력해 주세요.");
            }
            catch (InputMismatchException e ) {
                scanner.nextLine();
                System.out.println("숫자를 입력해주세요.");
            }
        }

        return num;
    }

}
