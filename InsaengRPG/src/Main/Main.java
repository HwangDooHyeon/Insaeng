package Main;

import OBJ.User;

public class Main {
    public static void main(String[] args) {
        MainUpdate main = new MainUpdate();
        main.initialize();

        User user = new User();
        user.initialize();


        while(true)
        {
            main.update();
            main.render();
        }
    }
}