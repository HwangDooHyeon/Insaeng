package scene;

import manager.*;

public class Logo extends Scene{
    @Override
    public void initialize() {
    }

    @Override
    public int update() {
        SceneManager.getInstance().setScene(
                GameManager.getInstance().매뉴 );

        return 0;
    }

    @Override
    public void render() {
        System.out.println("Logo : 인생걸작 인생갓겜");
    }
}
