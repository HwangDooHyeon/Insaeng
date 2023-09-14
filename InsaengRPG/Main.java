import MainUpdate.MainUpdate;

public class Main {
    public static void main(String[] args) {

        MainUpdate main = new MainUpdate();
        main.initialize();

        while(true)
        {
            main.update();
            main.render();
        }
    }
}
