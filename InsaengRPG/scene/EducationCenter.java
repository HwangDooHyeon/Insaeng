package scene;

import manager.GameManager;
import object.User;
import utility.ScanManager;

public class EducationCenter extends Scene{
    public User user = null;

    public String printName;
    public int money ,social, stress, moral, intel, art;

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
        this.user = GameManager.getInstance().getUser();
    }

    @Override
    public int update() {
        menuTxt();
        switch (ScanManager.scanInt("입력 : "))
        {
            case 1:
                printName =  mathSt;
                intel = 5;
                money = 5;
                stress = 5;
                user.setIntel(user.getIntel() + intel);
                break;

            case 2:
                printName =  artSt;
                art = 3;
                money = 7;
                stress = 2;
                user.setArtistry(user.getArtistry() + art);
                break;

            case 3:
                printName =  morSt;
                moral = 3;
                money = -3;
                stress = 3;
                user.setMorality(user.getMorality() + moral);
                break;
        }
        user.setWealth(user.getWealth() - money);
        user.setPTSD(user.getPTSD() + stress);

        return 0;
    }

    @Override
    public void render() {
        System.out.println("===================================");
        System.out.println(printName+"를 선택하셨습니다.");
        System.out.print("돈 -"+money + " 스트레스 +"+stress);

        if(printName ==  mathSt){
            System.out.println(" 사교성 +"+social);
        }else if(printName ==  artSt){
            System.out.println(" 예술성 +"+art);
        }else if(printName ==  morSt){
            System.out.println(" 도덕성 +"+moral);
        }
        System.out.println("===================================");

    }
}










