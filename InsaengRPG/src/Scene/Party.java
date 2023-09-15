package Scene;
import Manager.*;
import Scene.Scene;

import java.util.Scanner;

public class Party extends Scene {
    private String homeParty = "홈파티";
    private String villageParty = "마을잔치";
    private String kingdomParty = "왕궁파티";



    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.print("                                          파티 종류 입력 : ");
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("                                              에러");
        }

        return num;
    }

    public void renderTxt() {
        System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
        System.out.println("                                      "+sceneName + "를 선택하셨습니다.");
        System.out.println("                                      돈 -" + sceneWealth + " 사교성 +" + sceneSociability + "스트레스 +" + scenePTSD);
        System.out.println("                            ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
    }

    public void menuTxt(){
        System.out.println("                                ༻✦༺ 　༻파티 종류를 선택해 주세요༺　༻✦༺");
        System.out.println("                                          1. "+homeParty);
        System.out.println("                                          2. "+villageParty);
        System.out.println("                                          3. "+kingdomParty);
        System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
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
            if(0 < i && i < 4)
                break;
            else {
                System.out.println("                                         잘 못 입력하셨습니다");
                i = input();
            }
        }

        switch (i) {
            case 1:
                if(user.getWealth()-5>0){
                    sceneName =  homeParty;
                    sceneWealth = 5;
                    sceneSociability = 3;
                    scenePTSD = 2;
                    renderTxt();
                }
                else{
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp();
                }
                break;

            case 2:
                if(user.getWealth()-10>0){
                    sceneName =  villageParty;
                    sceneWealth = 10;
                    sceneSociability = 5;
                    scenePTSD = 2;
                    renderTxt();
                }
                else{
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp();
                }
                break;

            case 3:
                if(user.getWealth()-15>0){
                    sceneName =  kingdomParty;
                    sceneWealth = 15;
                    sceneSociability = 7;
                    scenePTSD = 2;
                    renderTxt();
                }
                else{
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp();
                }
                break;
        }

        user.setWealth(user.getWealth() - sceneWealth);
        user.setSociability(user.getSociability() + sceneSociability);
        user.setPTSD(user.getPTSD() + scenePTSD);
        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        GameManager.getInstance().getUser().turnRender();

        return 0;
    }

    @Override
    public void render() {


    }
}
