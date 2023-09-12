package Main;
import Main.ObjectManager;
import Menu.Scene;
import Menu.SceneManager;

import java.util.Scanner;

public class PT extends Scene {
    private String homeParty = "홈파티";
    private String villageParty = "마을잔치";
    private String kingdomParty = "왕궁파티";

    private String printName;
    private int money ,social, stress ;


    private Scanner scanner = null;
    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.println("파티 종류 입력 : ");
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("에러");
        }

        return num;
    }



    public void menuTxt(){
        System.out.println("====== 파티 종류를 선택해 주세요 ======");
        System.out.println("1. "+homeParty);
        System.out.println("2. "+villageParty);
        System.out.println("3. "+kingdomParty);
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
                printName =  homeParty;
                money = 5;
                social = 3;
                stress = 2;
                break;

            case 2:
                printName =  villageParty;
                money = 10;
                social = 5;
                stress = 2;
                break;

            case 3:
                printName =  kingdomParty;
                money = 15;
                social = 7;
                stress = 2;
                break;
        }

        user.setWealth(user.getWealth() - money);
        user.setSociability(user.getSociability() + social);
        user.setPTSD(user.getPTSD() + stress);

    }

    @Override
    public void render() {
        System.out.println(printName+"를 선택하셨습니다.");
        System.out.println("돈 -"+money+ " 사교성 +"+social + "스트레스 +"+stress);
        SceneManager.getInstance().setScene();
    }
}

