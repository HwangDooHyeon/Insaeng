package Main;

import Menu.SceneManager;

public class Main {
    public static void main(String[] args) {
        ScanManager.Initialize();

        MainUpdate main = new MainUpdate();
        main.initialize();

        int mainTurn = SceneManager.getInstance().getTurn();
        while(mainTurn > 0)
        {
            mainTurn = --mainTurn;
            SceneManager.getInstance().setTurn(mainTurn);
            main.update();
            main.render();
            SceneManager.getInstance().setScene();
        }

    }
}

