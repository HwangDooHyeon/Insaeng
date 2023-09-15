package Scene;

import Manager.*;
import java.util.Scanner;

public class Out extends Scene {

    private String bookStore = "서점";
    private String goldBar = "금거래소";
    private String artMuseum = "미술관";
    private String generalStore = "잡화점";

    private int goomonBook = 3;
    private int ssenBook = 5;
    private int majorBook = 7;
    private int silver = 3;
    private int gold = 5;
    private int diamond = 7;
    private int artMuseum_1 = 3;
    private int artMuseum_2 = 5;
    private int artMuseum_3 = 7;
    private int eclipse = -3;
    private int puremilkyMacaroon = -5;
    private int makGookSu = -7;

    private int erasePTSD = -1;
    private int eraseWealth = -5;

    int[][] intArray =new int[][]
            {
                    {1,2,3},
                    {1,2,3},
                    {1,2,3},
                    {1,2,3},
            };

    public void menuTxt(){
        System.out.println("                                 ༻✦༺ 　༺༻매장을 선택해 주세요༺༻　༻✦༺");
        System.out.println("                              ༻✦༺ 　༺༻ 보유 골드: " + user.getWealth() + " 필요 골드: " + eraseWealth + " ༺༻　༻✦༺");
        System.out.println("                                              1. "+bookStore);
        System.out.println("                                              2. "+goldBar);
        System.out.println("                                              3. "+artMuseum);
        System.out.println("                                              4. "+generalStore);
        System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
    }

    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.print("                                          외출 장소 입력 : ");
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("                                              에러");
        }
        return num;
    }

    public int randItem(int id) {
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
                System.out.println("                                         잘 못 입력하셨습니다");
                i = input();
            }
        }

        if(user.getWealth() > 4 ) {
            switch (i) {
                case 1:
                    sceneName = bookStore;
                    System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                    System.out.println("                                      "+sceneName + "를 선택하셨습니다.");
                    switch (randItem(i)) {
                        case 1:
                            getGoomonBook();
                            System.out.println("                                  서점에서 구몬책을 구매하셨습니다.");
                            System.out.println("                                     지성 +" + goomonBook + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 2:
                            getSsenBook();
                            System.out.println("                                  서점에서 쎈수학을 구매하셨습니다.");
                            System.out.println("                                        지성 +" + ssenBook + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 3:
                            getMajorBook();
                            System.out.println("                                 서점에서 전공 서적을 구매하셨습니다.");
                            System.out.println("                                     지성 +" + majorBook + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                    }
                    break;

                case 2:
                    sceneName = goldBar;
                    System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                    System.out.println("                                      "+sceneName + "를 선택하셨습니다.");
                    switch (randItem(i)) {
                        case 1:
                            getSilver();
                            System.out.println("                              금거래소에서 은을 구매하셨습니다.");
                            System.out.println("                                    사교성 +" + silver + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                           ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 2:
                            getGold();
                            System.out.println("                                 금거래소에서 금을 구매하셨습니다.");
                            System.out.println("                                    사교성 +" + gold + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 3:
                            getDiamond();
                            System.out.println("                                금거래소에서 다이아몬드를 구매하셨습니다.");
                            System.out.println("                                    사교성 +" + diamond + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                    }
                    break;

                case 3:
                    sceneName = artMuseum;
                    System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                    System.out.println("                                      "+sceneName + "를 선택하셨습니다.");
                    switch (randItem(i)) {
                        case 1:
                            getArtMuseum_1();
                            System.out.println("                                    미술관 주위를 구경합니다.");
                            System.out.println("                                    예술성 +" + artMuseum_1 + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 2:
                            getArtMuseum_2();
                            System.out.println("                                    미술관 내부를 구경합니다.");
                            System.out.println("                                    예술성 +" + artMuseum_2 + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 3:
                            getArtMuseum_3();
                            System.out.println("                                    미술품을 관람합니다.");
                            System.out.println("                                      예술성 +" + artMuseum_3 + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                    }
                    break;

                case 4:
                    sceneName = generalStore;
                    System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                    System.out.println("                                      "+sceneName + "를 선택하셨습니다.");
                    switch (randItem(i)) {
                        case 1:
                            getEclipse();
                            System.out.println("                               잡화점에서 이클립스를 구매하셨습니다.");
                            System.out.println("                                      스트레스 " + (eclipse+erasePTSD) + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 2:
                            getPureMilkyMacaroon();
                            System.out.println("                              잡화점에서 순수우유마카롱을 구매하셨습니다.");
                            System.out.println("                                      스트레스 " + (puremilkyMacaroon+erasePTSD) + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                        case 3:
                            getMakGookSu();
                            System.out.println("                                잡화점에서 막국수를 구매하셨습니다.");
                            System.out.println("                                      스트레스 " + (makGookSu+erasePTSD) + " 돈 " + eraseWealth);
                            System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                            break;
                    }
                    break;
            }

        } else {
            System.out.println("                                          소지 골드가 부족합니다.");
            GameManager.getInstance().getUser().turnUp();
        }
        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        GameManager.getInstance().getUser().turnRender();
        return 0;
    }

    @Override
    public void render() {}

    private void erasePTSD() {
        user.setPTSD(user.getPTSD() + erasePTSD);
    }

    private void eraseWealth() {
        if(user.getWealth()-5>-1){
            user.setWealth(user.getWealth() + eraseWealth);
        } else {
            System.out.println("                                          소지 골드가 부족합니다.");
        }
    }

    public void getGoomonBook() {
        user.setIntel(user.getIntel() + goomonBook);
        erasePTSD();
        eraseWealth();
    }

    public void getSsenBook() {
        user.setIntel(user.getIntel() + ssenBook);
        erasePTSD();
        eraseWealth();
    }

    public void getMajorBook() {
        user.setIntel(user.getIntel() + majorBook);
        erasePTSD();
        eraseWealth();
    }

    public void getSilver() {
        user.setSociability(user.getSociability() + silver);
        erasePTSD();
        eraseWealth();
    }

    public void getGold() {
        user.setSociability(user.getSociability() + gold);
        erasePTSD();
        eraseWealth();
    }

    public void getDiamond() {
        user.setSociability(user.getSociability() + diamond);
        erasePTSD();
        eraseWealth();
    }

    public void getArtMuseum_1() {
        user.setArtistry(user.getArtistry() + artMuseum_1);
        erasePTSD();
        eraseWealth();
    }

    public void getArtMuseum_2() {
        user.setArtistry(user.getArtistry() + artMuseum_2);
        erasePTSD();
        eraseWealth();
    }

    public void getArtMuseum_3() {
        user.setArtistry(user.getArtistry() + artMuseum_3);
        erasePTSD();
        eraseWealth();
    }

    public void getEclipse() {
        user.setPTSD(user.getPTSD() - eclipse);
        erasePTSD();
        eraseWealth();
    }

    public void getPureMilkyMacaroon() {
        user.setPTSD(user.getPTSD() - puremilkyMacaroon);
        erasePTSD();
        eraseWealth();
    }

    public void getMakGookSu() {
        user.setPTSD(user.getPTSD() - makGookSu);
        erasePTSD();
        eraseWealth();
    }
}