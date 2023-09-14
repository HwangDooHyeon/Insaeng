import MainUpdate.MainUpdate;
import Manager.*;
import Scene.*;
import Utility.ScanManager;

public class Main {
    public static void main(String[] args) {
        Intro i = new Intro();
        i.intro();

        ScanManager.Initialize();

        MainUpdate main = new MainUpdate();
        main.initialize();

        while(SceneManager.getInstance().getTurn() > 0)
        {
            if(SceneManager.getInstance().getTurn() != SceneManager.getInstance().firstTurn)
                SceneManager.getInstance().setScene();


            int mainTurn = SceneManager.getInstance().getTurn();
            mainTurn = --mainTurn;
            SceneManager.getInstance().setTurn(mainTurn);
            main.update();
            main.render();
        }

        Ending e = new Ending();
        e.render();

    }
}
