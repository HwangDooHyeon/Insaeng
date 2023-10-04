package Scene;

import Manager.GameManager;
import Manager.SceneManager;
import Utility.ScanManager;

public class Menu extends Scene {

    @Override
    public void initialize() {}

    @Override
    public int update() {
        int id = ScanManager.Scan();
        //GameManager.getInstance().getUser().turnUp();
        SceneManager.getInstance().setScene(id);
        return 0;
    }

    @Override
    public void render() {
        System.out.println("                                           메뉴를 선택해주세요!");
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
        System.out.println("                                              1. 학교");
        System.out.println("                                              2. 알바");
        System.out.println("                                              3. 파티");
        System.out.println("                                              4. 외출");
        System.out.println("                                              5. 상태");
    }
}