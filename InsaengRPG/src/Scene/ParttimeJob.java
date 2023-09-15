package Scene;
import Manager.GameManager;
import Manager.SceneManager;
import Scene.Scene;

import java.util.Scanner;

public class ParttimeJob extends Scene {
    private String farm = "농장";
    private String silverTown = "양로원";
    private String background = "뒷골목";



    private int input(){
        int num = 0;
        menuTxt();

        try {
            System.out.print("알바 종류 입력 : ");
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("에러");
        }

        return num;
    }



    public void menuTxt(){
        System.out.println("====== 알바 장소를 선택해 주세요 ======");
        System.out.println("1. "+farm);
        System.out.println("2. "+silverTown);
        System.out.println("3. "+background);
        System.out.println("===================================");
    }

    public void renderTxt(){
        System.out.println("===================================");
        System.out.println(sceneName+"를 선택하셨습니다.");
        System.out.print("돈 +"+sceneWealth+ " 스트레스 +"+scenePTSD);

        if(sceneName ==  silverTown){
            System.out.println(" 도덕성 +"+sceneMorality);
        }else if(sceneName ==  background){
            System.out.println(" 도덕성 -"+sceneMorality);
        }else{
            System.out.print("\n");
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
            if(0 < i && i < 4){
                break;
            }else {
                System.out.println("잘못입력하셨습니다");
                i = input();
            }
        }

        switch (i) {
            case 1:
                sceneName =  farm;
                sceneWealth = 10;
                scenePTSD = 7;
                break;

            case 2:
                sceneName =  silverTown;
                sceneWealth = 3;
                scenePTSD = 3;
                sceneMorality = 5;
                user.setMorality(user.getMorality() + sceneMorality);
                break;

            case 3:
                sceneName =  background;
                sceneWealth = 30;
                scenePTSD = 5;
                sceneMorality = 10;
                user.setMorality(user.getMorality() - sceneMorality);
                break;
        }

        user.setWealth(user.getWealth() + sceneWealth);
        user.setPTSD(user.getPTSD() + scenePTSD);
        renderTxt();
        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        GameManager.getInstance().getUser().turnRender();
        return 0;
    }

    @Override
    public void render() {

    }
}

