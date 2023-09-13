package Main;
import Main.ObjectManager;
import Menu.Scene;
import Menu.SceneManager;

import java.util.Scanner;

public class Out extends Scene {
    private String bookStore = "서점";
    private String goldBar = "금거래소";
    private String artMuseum = "미술관";
    private String generalStore = "잡화점";


    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.println("외출 장소 입력 : ");
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("에러");
        }

        return num;
    }



    public void menuTxt(){
        System.out.println("====== 가고싶은곳을 선택해주세요! ======");
        System.out.println("1. "+bookStore);
        System.out.println("2. "+goldBar);
        System.out.println("3. "+artMuseum);
        System.out.println("4. "+generalStore);
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
            if(0 < i && i < 5)
                break;
            else {
                System.out.println("잘못입력하셨습니다");
                i = input();
            }
        }

        switch (i) {
            case 1:
                printName =  bookStore;  //서점
                //user.setIntel(user.getIntel() + intel);
                break;

            case 2:
                printName =  goldBar; //금거래소
                //user.setArtistry(user.getArtistry() + art);
                break;

            case 3:
                printName =  artMuseum; //미술관
                //user.setMorality(user.getMorality() + moral);
                break;
            case 4:
                printName =  generalStore; //잡화점
                //user.setMorality(user.getMorality() + moral);
                break;
        }

        user.setPTSD(user.getPTSD() - 1); //외출시 공통 스트레스 -1
        //user.setPTSD(user.getPTSD() + stress);

    }

    @Override
    public void render() {
        System.out.println("===================================");
        System.out.println(printName+"를 선택하셨습니다.");
        //System.out.print("돈 -"+money + " 스트레스 +"+stress);
        System.out.println("===================================");

        SceneManager.getInstance().setScene();
    }
}

