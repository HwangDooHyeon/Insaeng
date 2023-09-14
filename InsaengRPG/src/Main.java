import Scene.Ending;
import Scene.Intro;
import MainUpdate.MainUpdate;
import Manager.*;
import Scene.Scene;
import Utility.ScanManager;

public class Main {
    public static void main(String[] args) {
//        Intro i = new Intro();
//        i.intro();

//        ScanManager.Initialize();

        MainUpdate main = new MainUpdate();
        main.initialize();

        while(true)
        {
//            if(SceneManager.getInstance().getTurn() != SceneManager.getInstance().firstTurn)


            int mainTurn = SceneManager.getInstance().getTurn();
            mainTurn = --mainTurn;
            SceneManager.getInstance().setTurn(mainTurn);
            main.render();
            main.update();
            System.out.println("현재" + SceneManager.getInstance().getTurn() +"턴 남았습니다.");
            System.out.println("===================================");
            System.out.println("\n");
            System.out.println("===================================");

//            SceneManager.getInstance().setScene(GameManager.getInstance().menu);
//
//            }

        }

//        Scene e  = new Ending();
//        e.render();

    }
}
