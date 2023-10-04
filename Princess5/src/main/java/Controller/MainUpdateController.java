package Controller;

import Utility.ScanManager;
import java.util.Scanner;

public class MainUpdateController {
    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        ScanManager.Initialize();
        GameController.getInstance().initialize();
        SceneController.getInstance().setScene(
                GameController.getInstance().intro );
    }

    public void update() {
        SceneController.getInstance().update();
    }

    public void render() {
        SceneController.getInstance().render();
    }
}