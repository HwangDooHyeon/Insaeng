package Main;
import Main.ObjectManager;
import src.Menu.Scene;
import src.OBJ.MyObject;

import java.util.Scanner;

public class PT extends Scene {
    private Scanner scanner = null;
    private int input(){
        int num = 0;

        menuTxt();
        System.out.println("입력 : ");
        num = scanner.nextInt();

        return num;
    }



    public void menuTxt(){
        System.out.println("====== 파티 종류를 선택해 주세요 ======");
        System.out.println("1. 홈파티");
        System.out.println("2. 마을잔치");
        System.out.println("3. 왕국파티");
        System.out.println("===================================");
    }

    @Override
    public void initialize() {
        this.user = ObjectManager.getInstance().getUser();
        scanner = new Scanner(System.in);
    }

    @Override
    public void update() {
        int i = input();

        while(true) {
            if(0 < i && i < 4)
                break;
            else {
                System.out.println("잘못입력하셨습니다");
                i = input();
            }
        }


        switch (i) {
            case 1:
                System.out.println("홈파티를 선택하셨습니다.");
                System.out.println("돈 - 5\n" + "사교성 + 3\n" + "스트레스 + 2\n");
                user.setSociability(user.getSociability() + 3);
                user.setPTSD(user.getPTSD() + 2);
                break;

            case 2:
                System.out.println("마을잔치를 선택하셨습니다.");
                System.out.println("돈 - 10\n" + "사교성 + 5\n" + "스트레스 + 2\n");
                user.setSociability(user.getSociability() + 5);
                user.setPTSD(user.getPTSD() + 2);
                break;

            case 3:
                System.out.println("왕국파티를 선택하셨습니다.");
                System.out.println("돈 - 15\n" + "사교성 + 7\n" + "스트레스 + 2\n");
                user.setSociability(user.getSociability() + 7);
                user.setPTSD(user.getPTSD() + 2);
                break;
        }
    }

    @Override
    public void render() {
        menuTxt();
    }
}

