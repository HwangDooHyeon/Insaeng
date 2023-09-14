package scene;

import manager.GameManager;
import object.User;
import utility.ScanManager;

public class EducationCenter extends Scene{

    private String mathSt = "수학수업";
    private String artSt = "미술수업";
    private String morSt = "도덕수업";

    public void menuTxt(){
        System.out.println("====== 수업 종류를 선택해 주세요 ======");
        System.out.println("1. "+mathSt);
        System.out.println("2. "+artSt);
        System.out.println("3. "+morSt);
        System.out.println("===================================");
    }
    @Override
    public void initialize() {
       // this.user = GameManager.getInstance().getUser();
    }

    @Override
    public int update() {
        menuTxt();
        switch (ScanManager.scanInt("입력 : "))
        {
            case 1:
                sceneName =  mathSt;
                sceneIntel = 5;
                sceneWealth = 5;
                scenePTSD = 5;
                user.setIntel(user.getIntel() + sceneIntel);
                break;

            case 2:
                sceneName =  artSt;
                sceneArtistry = 3;
                sceneWealth = 7;
                scenePTSD = 2;
                user.setArtistry(user.getArtistry() + sceneArtistry);
                break;

            case 3:
                sceneName =  morSt;
                sceneMorality = 3;
                sceneWealth = -3;
                scenePTSD = 3;
                user.setMorality(user.getMorality() + sceneMorality);
                break;
        }
        user.setWealth(user.getWealth() - sceneWealth);
        user.setPTSD(user.getPTSD() + scenePTSD);

        return 0;
    }

    @Override
    public void render() {
        System.out.println("===================================");
        System.out.println(sceneName+"를 선택하셨습니다.");
        System.out.print("돈 -"+ sceneWealth + " 스트레스 +"+scenePTSD);

        if(sceneName ==  mathSt){
            System.out.println(" 사교성 +" + sceneSociability);
        }else if(sceneName ==  artSt){
            System.out.println(" 예술성 +" + sceneArtistry);
        }else if(sceneName ==  morSt){
            System.out.println(" 도덕성 +" + sceneMorality);
        }
        System.out.println("===================================");

    }
}










