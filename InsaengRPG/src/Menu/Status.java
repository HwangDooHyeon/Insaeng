package Menu;

import Main.ObjectManager;
import Menu.Scene;
import OBJ.Item;
import OBJ.Object;

public class Status extends Scene {

    public Status() {}

    public void initialize(){}

    @Override
    public void update() {}

    @Override
    public void render() {
        System.out.println("지성: " + user.getIntel());
        System.out.println("사교성: " + user.getSociability());
        System.out.println("도덕성: " + user.getMorality());
        System.out.println("예술성: " + user.getArtistry());
        System.out.println("스트레스: " + user.getPTSD());
        System.out.println("보유 골드: " + user.getWealth());

        SceneManager.getInstance().setScene();

    }
}