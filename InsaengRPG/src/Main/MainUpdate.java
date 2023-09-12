package Main;

import Main.ObjectManager;
import Menu.SceneManager;

import java.util.Scanner;

public class MainUpdate {
    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        ObjectManager.getInstance().initialize();
        SceneManager.getInstance().setScene();
    }

    public void update() {
        SceneManager.getInstance().update();
    }

    public void render() {
        SceneManager.getInstance().render();
    }
}