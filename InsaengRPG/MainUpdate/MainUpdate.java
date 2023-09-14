package MainUpdate;

import manager.GameManager;
import manager.SceneManager;
import utility.ScanManager;

public class MainUpdate {
    public void initialize(){
        ScanManager.initialize();
        GameManager.getInstance().initialize();

        SceneManager.getInstance().setScene(
                GameManager.getInstance().로고 );
    }

    public void update(){
        SceneManager.getInstance().update();
    }

    public void render(){
        SceneManager.getInstance().render();
    }
}
