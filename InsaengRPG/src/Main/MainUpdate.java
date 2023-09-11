package src.Main;

import java.util.Scanner;

public class MainUpdate {
    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        ObjectManager.getInstance().initialize();
        SceneManager.getInstance().setScene(0);
    }

    public void update() {
        SceneManager.getInstance().update();
    }

    public void render() {
        SceneManager.getInstance().render();
    }
}