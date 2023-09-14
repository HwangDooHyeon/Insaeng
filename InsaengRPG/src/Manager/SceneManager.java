package Manager;
import Scene.*;

import Utility.ScanManager;

public class SceneManager {
    private static SceneManager instance = null;

    public static SceneManager getInstance()
    {
        if(instance == null)
            instance = new SceneManager();

        return instance;
    }

    private Scene sceneState = null;
    public int firstTurn = 3;
    public int turn = firstTurn;

    public int getTurn() {return turn; }

    public void setTurn(int turn) { this.turn = turn; }

    public void setScene() {
        int i = ScanManager.Scan();

        switch (i) {
            case 1:
                System.out.println("선택하신 메뉴는 교육 입니다");
                this.sceneState = new EducationCenter();
                break;
            case 2:
                System.out.println("선택하신 메뉴는 알바 입니다");
                this.sceneState = new ParttimeJob();
                break;
            case 3:
                System.out.println("선택하신 메뉴는 파티 입니다");
                this.sceneState = new Party();
                break;
            case 4:
                System.out.println("선택하신 메뉴는 외출 입니다");
                this.sceneState = new Out();
                break;
            case 5:
                System.out.println("선택하신 메뉴는 상태 입니다");
                this.sceneState = new Status();
                break;

        }
        this.sceneState.initialize();
    }

    public void update() {
        sceneState.update();
    }

    public void render(){
        sceneState.render();
        System.out.println("현재" + turn+"턴 남았습니다.");
        System.out.println("===================================");
        System.out.println("\n");
        System.out.println("===================================");
    }
}