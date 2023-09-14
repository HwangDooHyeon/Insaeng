package manager;

import scene.*;

public class SceneManager {

    private static SceneManager instance = null;

    public static SceneManager getInstance(){
        if(instance == null)
            instance = new SceneManager();
        return instance;
    }

    private Scene sceneState = null;


    public void setScene(int id) {
        switch (id)
        {
            case 0:
                sceneState = new Logo();
                break;

            case 1:
                sceneState = new Menu();
                break;

            case 2:
                sceneState = new EducationCenter();
                break;

            case 3:
                // sceneState = new 알바();
                break;

            case 4:
                // sceneState = new 파티장();
                break;

            case 5:
                // sceneState = new 외출();
                break;

            case 6:
                // sceneState = new 상태확인();
                break;
        }
        sceneState.initialize();
    }

    public void update() {
        sceneState.update();
    }

    public void render() {
        sceneState.render();
    }
}
