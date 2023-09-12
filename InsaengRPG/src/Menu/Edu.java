package Menu;

import java.util.Scanner;

public class Edu {
    User user = new User();

    public void printEdu() {
        while (true) {
            System.out.println("1. 수학");
            System.out.println("2. 미술");
            System.out.println("3. 도덕");
            System.out.print("메뉴를 선택해주세요.: ");

            Scanner scanner = new Scanner(System.in);

            int Ed = scanner.nextInt();

            if (Ed == 1) {
                System.out.println("선택하신 메뉴는 수학입니다");
                System.out.println("돈 - 5\\n\" + \"지성 + 3\\n\" + \"스트레스 + 5\\n");

            } else if (Ed == 2) {
                System.out.println("선택하신 메뉴는 미술 입니다");
                System.out.println("돈 - 7\\n\" + \"예술 + 3\\n\" + \"스트레스 + 2\\n");

            } else if (Ed == 3) {
                System.out.println("선택하신 메뉴는 도덕 입니다");
                System.out.println("돈 - 3\\n\" + \"도덕성 + 3\\n\" + \"스트레스 + 3\\n");

            } else {
                System.out.println("잘못 선택 하셨습니다. 다시 선택 하세요.");
            }
        }
    }
}

