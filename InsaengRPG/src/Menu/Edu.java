package src.Menu;

import java.util.Scanner;

public class Edu{
    public static void printEd() {System.out.print("수업을 선택해주세요.>");

        Scanner scanner = new Scanner(System.in);

        int ed = scanner.nextInt();              // 화면을 총해 입력받은 숫자를 e에 저장

        switch (ed) {
            case 1:
                System.out.println("선택하신 수업은 수학수업 입니다");
                break;
            case 2:
                System.out.println("선택하신 수업은 미술수업 입니다");
                break;
            case 3:
                System.out.println("선택하신 수업은 도덕수업 입니다");
            default:
                System.out.println("잘못선택하셨습니다");
        }
    }
}
