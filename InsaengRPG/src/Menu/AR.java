package Main;
import Main.ObjectManager;
import Menu.Scene;
import Menu.SceneManager;

import java.util.Scanner;

public class AR extends Scene {
    private String farm = "농장";
    private String silverTown = "양로원";
    private String background = "뒷골목";



    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.println("알바 종류 입력 : ");
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("에러");
        }

        return num;
    }



    public void menuTxt(){
        System.out.println("====== 알바 장소를 선택해 주세요 ======");
        System.out.println("1. "+farm);
        System.out.println("2. "+silverTown);
        System.out.println("3. "+background);
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
            if(0 < i && i < 4){
                break;
            }else {
                System.out.println("잘못입력하셨습니다");
                i = input();
            }
        }

        switch (i) {
            case 1:
                printName =  farm;
                money = 10;
                stress = 7;
                break;

            case 2:
                printName =  silverTown;
                money = 3;
                stress = 3;
                moral = 5;
                user.setMorality(user.getMorality() + moral);
                break;

            case 3:
                printName =  background;
                money = 30;
                stress = 5;
                moral = 10;
                user.setMorality(user.getMorality() - moral);
                break;
        }

        user.setWealth(user.getWealth() + money);
        user.setPTSD(user.getPTSD() + stress);
    }

    @Override
    public void render() {
        System.out.println("===================================");
        System.out.println(printName+"를 선택하셨습니다.");
        System.out.print("돈 +"+money+ " 스트레스 +"+stress);

        if(printName ==  silverTown){
            System.out.println(" 도덕성 +"+moral);
        }else if(printName ==  background){
            System.out.println(" 도덕성 -"+moral);
        }else{
            System.out.print("\n");
        }
        System.out.println("===================================");
    }
}

