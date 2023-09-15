package Manager;
import Scene.*;

import Utility.ScanManager;
import scene.Menu;

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

    public void setScene(int Id) {
//        int i = ScanManager.Scan();

        switch (Id) {
            case 0:
                sceneState = new Menu();
                GameManager.getInstance().getUser().turnUp();
                break;
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
//                this.sceneState = new Status();
                GameManager.getInstance().getUser().render();
                GameManager.getInstance().getUser().turnUp();
                GameManager.getInstance().getUser().turnRender();
                break;
            case 6:
                sceneState = new Intro();
                GameManager.getInstance().getUser().turnUp();
                break;

        }
        this.sceneState.initialize();
    }

    public void update() {
        sceneState.update();
    }

    public void render(){sceneState.render();}
}