package src.Menu;

import src.Main.User;

import java.util.Scanner;

public class PT {
    public static void printPT(){
        while (true) {
            System.out.println("1. 홈파티");
            System.out.println("2. 마을잔치");
            System.out.println("3. 왕궁파티");
            System.out.print("메뉴를 선택해주세요.: ");

            Scanner scanner = new Scanner(System.in);

            int ar = scanner.nextInt();

            if (ar == 1) {
                System.out.println("선택하신 파티는 홈파티입니다");
                break;
            } else if (ar == 2) {
                System.out.println("선택하신 파티는 마을잔치입니다");
                break;
            } else if (ar == 3) {
                System.out.println("선택하신 파티는 왕궁파티입니다");
                break;
            } else {
                System.out.println("잘못 선택하셨습니다. 다시 선택하세요.");
            }
        }
    }
}
