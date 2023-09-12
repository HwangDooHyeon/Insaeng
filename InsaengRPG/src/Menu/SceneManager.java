package Menu;

import java.util.Scanner;

public class SceneManager {
    private static SceneManager instance = null;

    public static SceneManager getInstance()
    {
        if(instance == null)
            instance = new SceneManager();

        return instance;
    }

    private Scene sceneState = null;

<<<<<<< Updated upstream
    public void setScene(int i) {
=======
    public void setScene() {
        int i = ScanManager.Scan();
>>>>>>> Stashed changes

        switch (i) {
            case 1:
                System.out.println("선택하신 메뉴는 교육 입니다");
                this.sceneState = new Edu();
                break;
            case 2:
                System.out.println("선택하신 메뉴는 알바 입니다");
                this.sceneState = new AR();
                break;
            case 3:
                System.out.println("선택하신 메뉴는 파티 입니다");
                this.sceneState = new PT();
                break;
            case 4:
                System.out.println("선택하신 메뉴는 외출 입니다");
                this.sceneState = new Out();
                break;
            default:
                System.out.println("선택하신 메뉴는 상태 입니다");
                this.sceneState = new Status();
        }
        this.sceneState. initialize();
    }

    public void update() {
        sceneState.update();
    }

    public void render(){
        sceneState.render();
    }
}
