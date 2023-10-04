package Scene;

import Manager.*;
import domain.User;
import dto.UserDto;
import service.UserService;

import java.util.Scanner;

public class EducationCenter extends Scene {
    private String mathSt = "수학수업";
    private String artSt = "미술수업";
    private String morSt = "도덕수업";
    private String mainMenu = "메인";

    private int needMoneyMathSt = -5;
    private int needMoneyArtSt = -7;
    private int needMoneyMorSt = -3;
    UserService userService = null;
    //UserDto userDTO = new UserDto();

    public void menuTxt(){
        System.out.println("                                 ༻✦༺ 　༺༻수업 종류를 선택해 주세요༺༻　༻✦༺");
        System.out.println("                                    ༻✦༺ 　༺༻ 보유 골드: " + user.getWealth() + "༺༻　༻✦༺");
        System.out.println("                                        1. " + mathSt + " (필요 골드: " + -needMoneyMathSt + ")");
        System.out.println("                                        2. " + artSt + " (필요 골드: " + -needMoneyArtSt + ")");
        System.out.println("                                        3. " + morSt + " (필요 골드: " + -needMoneyMorSt + ")");
        System.out.println("                                        4. " + mainMenu);
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
    }

    private int input() {
        int num = 0;
        menuTxt();

        try {
            System.out.print("                                          수업 종류 입력 : ");
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("                                              에러");
        }
        return num;
    }

    public void renderTxt() {
        try {
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
            System.out.println("                                        "+sceneName+" 을(를) 선택하셨습니다.");
            Thread.sleep(1000);
            System.out.print("                                        돈 -"+sceneWealth + " 스트레스 +"+scenePTSD);

        } catch (InterruptedException e) {e.printStackTrace();}



        if(sceneName ==  mathSt) {
            System.out.println(" 지성 +"+sceneIntel);
        }else if(sceneName ==  artSt) {
            System.out.println(" 예술성 +"+sceneArtistry);
        }else if(sceneName ==  morSt) {
            System.out.println(" 도덕성 +"+sceneMorality);
        } else {
            System.out.print("\n");
        }
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
    }



    @Override
    public void initialize() {
        //this.user = GameManager.getInstance().getUser();
        scanner = new Scanner(System.in);
        userService = new UserService();
    }

    @Override
    public int update() {
        SceneManager.getInstance().setScene(0);

        int i = input();

        while(true) {
            if(0 < i && i < 5)
                break;
            else {
                System.out.println("                                           잘 못 입력하셨습니다");
                i = input();
            }
        }

        UserDto userDTO = new UserDto();
        User user = userService.findById(1L);
        switch (i) {
            case 1:
                if(user.getWealth() + needMoneyMathSt > -1) {
                    sceneName =  mathSt;
                    sceneIntel = 5;
                    sceneWealth = 5;
                    scenePTSD = 5;

                    userDTO.setWealth(user.getWealth() - sceneWealth);
                    userDTO.setPTSD(user.getPTSD() + scenePTSD);
                    userDTO.setIntel(user.getIntel() + sceneIntel);
                    userService.save(userDTO);
                    renderTxt();
                    return 0;
                } else {
                    System.out.println("                                          소지 골드가 부족합니다.");
                    //GameManager.getInstance().getUser().turnUp();
                    return -1;
                }

            case 2:
                if(user.getWealth() + needMoneyArtSt > -1) {

                    sceneName =  artSt;
                    sceneArtistry = 3;
                    sceneWealth = 7;
                    scenePTSD = 2;

                    userDTO.setWealth(user.getWealth() - sceneWealth);
                    userDTO.setPTSD(user.getPTSD() + scenePTSD);
                    userDTO.setArtistry(user.getArtistry() + sceneArtistry);
                    userService.save(userDTO);
                    renderTxt();
                    return 0;
                } else {
                    System.out.println("                                          소지 골드가 부족합니다.");
                    //GameManager.getInstance().getUser().turnUp();
                    return -1;
                }

            case 3:
                if(user.getWealth() + needMoneyMorSt > -1) {
                    sceneName =  morSt;
                    sceneMorality = 3;
                    sceneWealth = 3;
                    scenePTSD = 3;

                    userDTO.setWealth(user.getWealth() - sceneWealth);
                    userDTO.setPTSD(user.getPTSD() + scenePTSD);
                    userDTO.setMorality(user.getMorality() + sceneMorality);
                    userService.save(userDTO);
                    renderTxt();
                    return 0;
                } else {
                    System.out.println("                                          소지 골드가 부족합니다.");
                    //GameManager.getInstance().getUser().turnUp();
                    return -1;
                }

            case 4:
                sceneName = mainMenu;
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                System.out.println("                                         "+sceneName + "를 선택하셨습니다.");
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                //GameManager.getInstance().getUser().turnUp();
                return -1;
        }

        //SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        //GameManager.getInstance().getUser().turnRender();
        return 0;
    }

    @Override
    public void render() {}
}