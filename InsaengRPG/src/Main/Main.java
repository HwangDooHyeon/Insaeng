package Main;

import src.Menu.Status;
public class Main {
    public static void main(String[] args) {
        ScanManager.Initialize();

        MainUpdate main = new MainUpdate();
        main.initialize();


        while(true)
        {
            main.update();
            main.render();
        }
    }
}

