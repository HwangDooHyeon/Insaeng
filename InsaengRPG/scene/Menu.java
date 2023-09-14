package scene;

import manager.GameManager;
import manager.SceneManager;
import utility.ScanManager;

public class Menu extends Scene{

    @Override
    public void initialize() {
    }

    @Override
    public int update() {
        int id = ScanManager.scanInt();

        while(id < 1 || 5 < id ) {
            id = ScanManager.scanInt();
        }

        SceneManager.getInstance().setScene(id);

        return 0;
    }

    @Override
    public void render() {
        System.out.println("1. 교육");
        System.out.println("2. 알바");
        System.out.println("3. 파티");
        System.out.println("4. 외출");
        System.out.println("5. 상태");
    }
}
