package MainUpdate;

import Manager.SceneManager;
import Utility.ScanManager;
import java.util.Scanner;

public class MainUpdate {
    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        ScanManager.Initialize();
        SceneManager.getInstance().setScene(6);
    }

    public void render() {
        SceneManager.getInstance().render();
    }

    public void update() {
        SceneManager.getInstance().update();
    }

}