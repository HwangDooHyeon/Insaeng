package Scene;
import Manager.GameManager;
import Scene.Scene;

import java.util.Scanner;

public class Out extends Scene {

    private String bookStore = "서점";
    private String goldBar = "금거래소";
    private String artMuseum = "미술관";
    private String generalStore = "잡화점";


    int[][] intArray =new int[][]
            {
                    {1,2,3},
                    {1,2,3},
                    {1,2,3},
                    {1,2,3},
            };


    public void menuTxt(){
        System.out.println("====== 가고싶은곳을 선택해주세요! ======");
        System.out.println("1. "+bookStore);
        System.out.println("2. "+goldBar);
        System.out.println("3. "+artMuseum);
        System.out.println("4. "+generalStore);
        System.out.println("===================================");
    }


    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.print("외출 장소 입력 : ");
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("에러");
        }

        return num;
    }


    public int randItem(int id){
        double dl = Math.random();
        int ra = (int)(dl * 3);
        return intArray[id - 1][ra];
    }


    @Override
    public void initialize() {
        this.user = GameManager.getInstance().getUser();
        scanner = new Scanner(System.in);
    }


    @Override
    public int update() {
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
                sceneName =  bookStore;  //서점
                System.out.println("===================================");
                System.out.println(sceneName+"를 선택하셨습니다.\n");
                switch (randItem(i)) {
                    case 1:
                        render();
                        getGoomonBook();
                        System.out.println("서점에서 구몬책을 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                    case 2:
                        render();
                        getSsenBook();
                        System.out.println("서점에서 쎈수학을 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                    case 3:
                        render();
                        getMajorBook();
                        System.out.println("서점에서 전공 서적을 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                }
                break;

            case 2:
                sceneName =  goldBar; //금거래소
                System.out.println("===================================");
                System.out.println(sceneName+"를 선택하셨습니다.\n");
                switch (randItem(i)) {
                    case 1:
                        render();
                        getSilver();
                        System.out.println("금거래소에서 은을 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                    case 2:
                        render();
                        getGold();
                        System.out.println("금거래소에서 금을 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                    case 3:
                        render();
                        getDiamond();
                        System.out.println("금거래소에서 다이아몬드를 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                }
                break;

            case 3:
                sceneName =  artMuseum; //미술관
                System.out.println("===================================");
                System.out.println(sceneName+"를 선택하셨습니다.\n");
                switch (randItem(i)) {
                    case 1:
                        render();
                        getArtMuseum_1();
                        System.out.println("미술관 주위를 구경합니다.");
                        System.out.println("===================================");
                        break;
                    case 2:
                        render();
                        getArtMuseum_2();
                        System.out.println("미술관 내부를 구경합니다.");
                        System.out.println("===================================");
                        break;
                    case 3:
                        render();
                        getArtMuseum_3();
                        System.out.println("미술품을 관람합니다.");
                        System.out.println("===================================");
                        break;
                }
                break;

            case 4:
                sceneName =  generalStore; //잡화점
                System.out.println("===================================");
                System.out.println(sceneName+"를 선택하셨습니다.\n");
                switch (randItem(i)) {
                    case 1:
                        getEclipse();
                        System.out.println("잡화점에서 이클립스를 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                    case 2:
                        getPureMilkyMacaroon();
                        System.out.println("잡화점에서 순수우유마카롱을 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                    case 3:
                        getMakGookSu();
                        System.out.println("잡화점에서 막국수를 구매하셨습니다.");
                        System.out.println("===================================");
                        break;
                }
                    break;
        }
        return 0;

    }


    @Override
    public void render() {
//        System.out.println("===================================");
//        System.out.println(sceneName+"를 선택하셨습니다.");
//        //System.out.print("돈 -"+money + " 스트레스 +"+stress);
//        System.out.println("===================================");
    }


    private void erasePTSD() {
        user.setPTSD(user.getPTSD() - 1);
    }
    private void eraseWealth() {
        user.setWealth(user.getWealth() - 5);
    }

    public void getGoomonBook() {
        user.setIntel(user.getIntel() + 3);
        erasePTSD();
        eraseWealth();
    }

    public void getSsenBook() {
        user.setIntel(user.getIntel() + 5);
        erasePTSD();
        eraseWealth();
    }

    public void getMajorBook() {
        user.setIntel(user.getIntel() + 7);
        erasePTSD();
        eraseWealth();
    }

    public void getSilver() {
        user.setSociability(user.getSociability() + 3);
        erasePTSD();
        eraseWealth();
    }

    public void getGold() {
        user.setSociability(user.getSociability() + 5);
        erasePTSD();
        eraseWealth();
    }

    public void getDiamond() {
        user.setSociability(user.getSociability() + 7);
        erasePTSD();
        eraseWealth();
    }

    public void getArtMuseum_1() {
        user.setArtistry(user.getArtistry() + 3);
        erasePTSD();
        eraseWealth();
    }

    public void getArtMuseum_2() {
        user.setArtistry(user.getArtistry() + 5);
        erasePTSD();
        eraseWealth();
    }

    public void getArtMuseum_3() {
        user.setArtistry(user.getArtistry() + 7);
        erasePTSD();
        eraseWealth();
    }

    public void getEclipse() {
        user.setPTSD(user.getPTSD() - 3);
        erasePTSD();
        eraseWealth();
    }

    public void getPureMilkyMacaroon() {
        user.setPTSD(user.getPTSD() - 5);
        erasePTSD();
        eraseWealth();
    }

    public void getMakGookSu() {
        user.setPTSD(user.getPTSD() - 7);
        erasePTSD();
        eraseWealth();
    }

}
