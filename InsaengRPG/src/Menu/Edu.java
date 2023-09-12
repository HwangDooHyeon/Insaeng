package Main;
import Main.ObjectManager;
import Menu.Scene;
import Menu.SceneManager;

import java.util.Scanner;

public class Edu extends Scene {
    private String mathSt = "수학수업";
    private String artSt = "미술수업";
    private String morSt = "도덕수업";

    private String printName;
    private int money ,social, stress, moral, intel, art ;


    private Scanner scanner = null;
    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.println("수업 종류 입력 : ");
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("에러");
        }

        return num;
    }



    public void menuTxt(){
        System.out.println("====== 수업 종류를 선택해 주세요 ======");
        System.out.println("1. "+mathSt);
        System.out.println("2. "+artSt);
        System.out.println("3. "+morSt);
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
                printName =  mathSt;
                intel = 5;
                money = 5;
                stress = 5;
                user.setIntel(user.getIntel() + intel);
                break;

            case 2:
                printName =  artSt;
                art = 3;
                money = 7;
                stress = 2;
                user.setArtistry(user.getArtistry() + art);
                break;

            case 3:
                printName =  morSt;
                moral = 3;
                money = -3;
                stress = 3;
                user.setMorality(user.getMorality() + moral);
                break;
        }

        user.setWealth(user.getWealth() - money);
        user.setPTSD(user.getPTSD() + stress);

    }

    @Override
    public void render() {
        System.out.println(printName+"를 선택하셨습니다.");
        System.out.print("돈 -"+money + " 스트레스 +"+stress);

        if(printName ==  mathSt){
            System.out.println(" 사교성 +"+social);
        }else if(printName ==  artSt){
            System.out.println(" 예술성 +"+art);
        }else if(printName ==  morSt){
            System.out.println(" 도덕성 +"+moral);
        }
        SceneManager.getInstance().setScene();
    }
}

