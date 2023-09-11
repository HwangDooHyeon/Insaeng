package Menu;

import java.util.Scanner;

public class AR {

    public static void printAr() {
        while (true) {
            System.out.println("1. 농장");
            System.out.println("2. 양로원");
            System.out.println("3. 뒷골목");
            System.out.print("메뉴를 선택해주세요.: ");

            Scanner scanner = new Scanner(System.in);

            int ar = scanner.nextInt();

            if (ar == 1) {
                System.out.println("선택하신 메뉴는 농장입니다");

            } else if (ar == 2) {
                System.out.println("선택하신 메뉴는 양로원 입니다");
            } else if (ar == 3) {
                System.out.println("선택하신 메뉴는 뒷골목 입니다");
            } else {
                System.out.println("잘못 선택하셨습니다. 다시 선택하세요.");
            }
        }
    }
}