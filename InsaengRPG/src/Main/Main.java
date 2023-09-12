<<<<<<< Updated upstream
package src.Main;
=======
package Main;

import Menu.Scene;
import Menu.Status;
import OBJ.Item;
import OBJ.User;
>>>>>>> Stashed changes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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


        System.out.println(user.HP);

    }
}