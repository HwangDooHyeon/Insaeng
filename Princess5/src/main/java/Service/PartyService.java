package Service;
import Controller.Scene;
import Controller.SceneController;
import Controller.GameController;
import DTO.UserDTO;

import java.util.Scanner;

public class PartyService extends Scene {
    private String homeParty = "홈파티";
    private String villageParty = "마을잔치";
    private String kingdomParty = "왕궁파티";
    private String mainMenu = "메인";

    UserDTO userDTO = new UserDTO();

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

        try {
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
            System.out.println("                                       "+sceneName+" 을(를) 선택하셨습니다.");
            Thread.sleep(1000);
            System.out.println("                                       돈 -" + sceneWealth + " 사교성 +" + sceneSociability + " 스트레스 +" + scenePTSD);
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");

        } catch (InterruptedException e) {e.printStackTrace();}

    }

    public void menuTxt(){
        System.out.println("                                   ༻✦༺ 　༻파티 종류를 선택해 주세요༺　༻✦༺");
        System.out.println("                                              1. "+homeParty);
        System.out.println("                                              2. "+villageParty);
        System.out.println("                                              3. "+kingdomParty);
        System.out.println("                                              4. "+mainMenu);
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
    }

    @Override
    public void initialize() {
        this.user = GameController.getInstance().getUser();
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
                    GameController.getInstance().getUser().turnUp();
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
                    GameController.getInstance().getUser().turnUp();
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
                    GameController.getInstance().getUser().turnUp();
                }
                break;
            case 4:
                sceneName = mainMenu;
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                System.out.println("                                         "+sceneName + "를 선택하셨습니다.");
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                GameController.getInstance().getUser().turnUp();
                break;
        }
        userDTO.setWealth(user.getWealth() - sceneWealth);
        userDTO.setSociability(user.getSociability() + sceneSociability);
        userDTO.setPTSD(user.getPTSD() + scenePTSD);
        SceneController.getInstance().setScene(GameController.getInstance().menu);
        GameController.getInstance().getUser().turnRender();

        return 0;
    }

    @Override
    public void render() {


    }
}