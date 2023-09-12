package Main;

import Menu.Scene;
import Menu.Status;
import OBJ.Item;
import OBJ.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScanManager.Initialize();

        MainUpdate main = new MainUpdate();
        main.initialize();

//        while(true)
//        {
//            main.update();
//            main.render();
//        }

        Status status = new Status();
        status.update();
        status.render();


    }
}

