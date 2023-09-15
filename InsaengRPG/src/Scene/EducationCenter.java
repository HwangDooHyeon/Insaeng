package Scene;

import Manager.*;

import java.util.Scanner;

public class EducationCenter extends Scene {
    private String mathSt = "수학수업";
    private String artSt = "미술수업";
    private String morSt = "도덕수업";


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

    public void renderTxt(){
        System.out.println("===================================");
        System.out.println(sceneName+"를 선택하셨습니다.");
        System.out.print("돈 -"+sceneWealth + " 스트레스 +"+scenePTSD);

        if(sceneName ==  mathSt){
            System.out.println(" 지성 +"+sceneIntel);
        }else if(sceneName ==  artSt){
            System.out.println(" 예술성 +"+sceneArtistry);
        }else if(sceneName ==  morSt){
            System.out.println(" 도덕성 +"+sceneMorality);
        }
        System.out.println("===================================");
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
                System.out.println("잘못입력하셨습니다");
                i = input();
            }
        }

        switch (i) {
            case 1:
                if(user.getWealth()-5>0){

                    sceneName =  mathSt;
                    sceneIntel = 5;
                    sceneWealth = 5;
                    scenePTSD = 5;

                    user.setWealth(user.getWealth() - sceneWealth);
                    user.setPTSD(user.getPTSD() + scenePTSD);
                    user.setIntel(user.getIntel() + sceneIntel);
                    renderTxt();
                }
                else{
                    System.out.println("소지 골드가 부족합니다.");
//                    SceneManager.getInstance().setScene(GameManager.getInstance().menu);
                }

                break;

            case 2:
                if(user.getWealth()-5>0){
                    sceneName =  artSt;
                    sceneArtistry = 3;
                    sceneWealth = 7;
                    scenePTSD = 2;

                    user.setWealth(user.getWealth() - sceneWealth);
                    user.setPTSD(user.getPTSD() + scenePTSD);
                    user.setArtistry(user.getArtistry() + sceneArtistry);
                    renderTxt();
                }
                else{
                    System.out.println("소지 골드가 부족합니다.");
//                    SceneManager.getInstance().setScene(GameManager.getInstance().menu);
                }

                break;

            case 3:
                if(user.getWealth()-5>0){
                    sceneName =  morSt;
                    sceneMorality = 3;
                    sceneWealth = -3;
                    scenePTSD = 3;

                    user.setWealth(user.getWealth() - sceneWealth);
                    user.setPTSD(user.getPTSD() + scenePTSD);
                    user.setMorality(user.getMorality() + sceneMorality);
                    renderTxt();
                }
                else{
                    System.out.println("소지 골드가 부족합니다.");
//                    SceneManager.getInstance().setScene(GameManager.getInstance().menu);
                }

                break;
        }

        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        GameManager.getInstance().getUser().turnRender();
        return 0;
    }

    @Override
    public void render() {

    }
}
