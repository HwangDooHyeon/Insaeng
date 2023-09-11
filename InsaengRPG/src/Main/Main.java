package src.Main;

public class Main {
    public static void main(String[] args) {
        MainUpdate main = new MainUpdate();
        main.initialize();

        User user = new User();
        user.initialize();

        System.out.println(user.HP);

        while(true)
        {
            main.update();
            main.render();
        }
    }
}