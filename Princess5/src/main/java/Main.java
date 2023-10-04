import Controller.MainUpdateController;
import Controller.SceneController;
import Controller.EndingController;
import Controller.Scene;

public class Main {
        public static void main(String[] args) {

            MainUpdateController main = new MainUpdateController();
            main.initialize();

            while(SceneController.getInstance().getTurn() > 0)
            {
                int mainTurn = SceneController.getInstance().getTurn();
                mainTurn = --mainTurn;
                SceneController.getInstance().setTurn(mainTurn);
                main.render();
                main.update();
            }

            Scene e  = new EndingController();
            e.render();

        }
    }
