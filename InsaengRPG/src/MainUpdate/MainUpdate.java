package MainUpdate;

import Manager.GameManager;
import Manager.SceneManager;

import java.util.Scanner;

public class MainUpdate {
    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        GameManager.getInstance().initialize();
        SceneManager.getInstance().setScene();
    }

    public void update() {
        SceneManager.getInstance().update();
    }

    public void render() {
        SceneManager.getInstance().render();
    }
}