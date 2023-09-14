package MainUpdate;

import Manager.GameManager;
import Manager.SceneManager;
import Utility.ScanManager;

import java.util.Scanner;

public class MainUpdate {
    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        ScanManager.Initialize();
        GameManager.getInstance().initialize();
        SceneManager.getInstance().setScene(
                GameManager.getInstance().intro );
    }

    public void update() {
        SceneManager.getInstance().update();
    }

    public void render() {
        SceneManager.getInstance().render();
    }
}