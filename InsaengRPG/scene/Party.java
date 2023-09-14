package scene;

import utility.ScanManager;

public class Party extends Scene{

    private String homeParty = "홈파티";
    private String villageParty = "마을잔치";
    private String kingdomParty = "왕궁파티";

    @Override
    public void initialize() {}

    public void menuTxt(){
        System.out.println("====== 파티 종류를 선택해 주세요 ======");
        System.out.println("1. "+homeParty);
        System.out.println("2. "+villageParty);
        System.out.println("3. "+kingdomParty);
        System.out.println("===================================");
    }

    @Override
    public int update() {

        menuTxt();

        switch (ScanManager.scanInt("입력 : "))
        {
            case 1:
                sceneName =  homeParty;
                sceneWealth = 5;
                sceneSociability = 3;
                scenePTSD = 2;
                break;

            case 2:
                sceneName =  villageParty;
                sceneWealth = 10;
                sceneSociability = 5;
                scenePTSD = 2;
                break;

            case 3:
                sceneName =  kingdomParty;
                sceneWealth = 15;
                sceneSociability = 7;
                scenePTSD = 2;
                break;
        }

        user.setWealth(user.getWealth() - sceneWealth);
        user.setSociability(user.getSociability() + sceneSociability);
        user.setPTSD(user.getPTSD() + scenePTSD);

        return 0;
    }

    @Override
    public void render() {
        System.out.println("===================================");
        System.out.println(sceneName+"를 선택하셨습니다.");
        System.out.println("돈 -" + sceneWealth + " 사교성 +" + sceneSociability + "스트레스 +" + scenePTSD);
        System.out.println("===================================");
    }
}