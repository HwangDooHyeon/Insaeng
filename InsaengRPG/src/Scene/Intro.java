package Scene;

import Manager.GameManager;
import Manager.SceneManager;

import javax.swing.*;

public class Intro extends Scene{

    @Override
    public void initialize() {

    }

    @Override
    public int update() {
        SceneManager.getInstance().setScene(
                GameManager.getInstance().menu );
        return 0;
    }

    @Override
    public void render() {
        SwingUtilities.invokeLater(() -> {
            new ImageDisplay("InsaengRPG/src/images/start.jpg", 400, 536).setVisible(true);
        });
        System.out.println(
                "  ★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋\uD835\uDC77\uD835\uDC93\uD835\uDC8A\uD835\uDC8F\uD835\uDC84\uD835\uDC86\uD835\uDC94\uD835\uDC94 \uD835\uDC74\uD835\uDC82\uD835\uDC8C\uD835\uDC86\uD835\uDC93★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺֺ ๋ ̶̲★ ๋\n"
                +"  ★̶̲ .                                                                                                  ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖      공국력 1654년, 이웃 나라간의 전쟁에서 약세할 때 이름 모를 용사가 나타나 공국을 승리로 이끌어 주었다.      ⭑ ֺ ๋ ̶̲★\n"+
                "  ★̶̲ . ˖               공국은 감사의 의미로 용사에게 백작의 지위를 내리고 용사는 공국으로 정착하게 되었다.           ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★\n"+
                "   ★̶̲ . ˖                  그로부터 10년 뒤, 유난히 별이 밝던 밤 한 별이 용사에게로 다가온다.                    ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖                                                                                                ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖                            \"당신이 전쟁에서 활약한 날 부터 지켜봤습니다.                              ⭑ ֺ ๋ ̶̲★\n"+
                "    ★̶̲ . ˖                        저의 이름은 비너스, 천계의 아이를 부탁하고 싶습니다.\"                          ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★\n"+
                "★̶̲ . ˖                      별에서 부터 눈부신 빛이 나오더니 눈앞에 10세 정도의 아이가 나타난다.                  ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖               \"이 아이는 천계의 사람이라  2년 후 성인이 됩니다. 부디 올바른 길로 인도해 주세요.\"           ⭑ ֺ ๋ ̶̲★\n"+
                "★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖                                   용사는 아이를 안아 집으로 데려간다.                                  ⭑ ֺ ๋ ̶̲★\n"+
                "  ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★\n"+
                " ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★\n"+
                "★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋\uD835\uDC77\uD835\uDC93\uD835\uDC8A\uD835\uDC8F\uD835\uDC84\uD835\uDC86\uD835\uDC94\uD835\uDC94 \uD835\uDC74\uD835\uDC82\uD835\uDC8C\uD835\uDC86\uD835\uDC93★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ̶๋̲★\n"
                +" ★̶̲ .                                                                                                  ⭑ ֺ ๋ ̶̲★\n"
                +"★̶̲ .                 게임 설명 : 이 게임은 24턴제 입니다. 24턴이 끝나면 게임이 종료됩니다.                      ⭑ ֺ ๋ ̶̲★\n"
                +" ★̶̲ .                          마지막 턴이 끝나는 시점에 엔딩(직업)이 정해집니다.                              ⭑ ֺ ๋ ̶̲★\n"
                +"★̶̲ .                          24턴 안으로 활동을 통해 아이를 키워주세요!                                     ⭑ ֺ ๋ ̶̲★\n"
                +"   ★̶̲ .                                                                                                  ⭑ ֺ ๋ ̶̲★\n"
                +" ★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ˖  ๋  ๋★̶̲★̶̲ . ˖  ๋  ๋  ๋★̶̲. ˖ ͘   ̶̲★ . ˖ ͘ ⭑ֺ ̶̲★๋\n");

    }
}