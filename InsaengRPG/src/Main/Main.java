package Main;

import Menu.Intro;
import Menu.SceneManager;

public class Main {
    public static void main(String[] args) {
        Intro i = new Intro();
        i.intro();

        ScanManager.Initialize();

        MainUpdate main = new MainUpdate();
        main.initialize();


        while(SceneManager.getInstance().getTurn() > 1)
        {
            int mainTurn = SceneManager.getInstance().getTurn();
            mainTurn = --mainTurn;
            SceneManager.getInstance().setTurn(mainTurn);
            main.update();
            main.render();
            SceneManager.getInstance().setScene();
        }

    }
}

