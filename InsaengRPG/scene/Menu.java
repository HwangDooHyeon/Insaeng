package scene;

public class Menu extends Scene{

    @Override
    public void initialize() {
        System.out.println("Menu.initialize");
    }

    @Override
    public int update() {
        System.out.println("Menu.update");
        return 0;
    }

    @Override
    public void render() {
        System.out.println("Menu.render");
    }
}
