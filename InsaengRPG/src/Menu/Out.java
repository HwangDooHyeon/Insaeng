package src.Menu;

import java.util.Scanner;

public class Out {
    public static void printOut() {
        while (true) {
            System.out.println("1. 서점");
            System.out.println("2. 금거래소");
            System.out.println("3. 미술관");
            System.out.println("4. 잡화점");
            System.out.print("메뉴를 선택해주세요.: ");

            Scanner scanner = new Scanner(System.in);

            int ar = scanner.nextInt();

            if (ar == 1) {
                System.out.println("선택하신 메뉴는 서점입니다");
                break;
            } else if (ar == 2) {
                System.out.println("선택하신 메뉴는 금거래소 입니다");
                break;
            } else if (ar == 3) {
                System.out.println("선택하신 메뉴는 미술관 입니다");
                break;
            } else if (ar == 4) {
                System.out.println("선택하신 메뉴는 잡화점 입니다");
                break;
            } else {
                System.out.println("잘못 선택하셨습니다. 다시 선택하세요.");
            }
        }
    }
}
