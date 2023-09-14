package Scene;

import Manager.GameManager;

public class Ending extends Scene{

    @Override
    public void initialize() {this.user = GameManager.getInstance().getUser();}

    @Override
    public void update() {}

    @Override
    public void render() {
        Scene sceneState = new Status();
        sceneState.render();
        if (user.getIntel() > 90 && user.getSociability() > 90 && user.getMorality() > 90 && user.getArtistry() > 90) {
            System.out.println("***********************************");
            System.out.println("           왕이 되었습니다.");
            System.out.println("***********************************");
        } else if (user.getWealth() > 90 && user.getMorality() > 20) {
            System.out.println("***********************************");
            System.out.println("         재력가가 되었습니다.");
            System.out.println("***********************************");
        } else if (user.getArtistry() > 70) {
            System.out.println("***********************************");
            System.out.println("         예술가가 되었습니다.");
            System.out.println("***********************************");
        } else if (user.getPTSD() > 80 && user.getMorality() < 20) {
            System.out.println("***********************************");
            System.out.println("          마왕이 되었습니다.");
            System.out.println("***********************************");
        } else {
            System.out.println("***********************************");
            System.out.println("       돼지농장주인이 되었습니다.");
            System.out.println("***********************************");
        }
    }

}
