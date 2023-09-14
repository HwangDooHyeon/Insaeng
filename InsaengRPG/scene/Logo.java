package scene;

import manager.*;

public class Logo extends Scene{
    private int count;
    @Override
    public void initialize() {
        count = 1;
    }

    @Override
    public int update() {
        if(count <= 0)
            SceneManager.getInstance().setScene(
                    GameManager.getInstance().매뉴 );

        count--;
        return 0;
    }

    @Override
    public void render() {
        System.out.println("인생걸작");
    }
}
