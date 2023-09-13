package Main;
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

        try {
            // ** 사용자에게 입력 안내 메시지 출력
            //System.out.println("===================================");
            System.out.println("1. 학교");
            System.out.println("2. 알바");
            System.out.println("3. 파티");
            System.out.println("4. 외출");
            System.out.println("5. 상태확인");
            System.out.println("===================================");

            System.out.print("매뉴를 선택해주세요: ");

            num = scanner.nextInt();
            scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println("입력이 잘못되었습니다.");
        }

        return num;
    }

}
