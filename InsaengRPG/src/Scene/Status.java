package Scene;

import Manager.SceneManager;

public class Status extends Scene {

    public Status() {}

    public void initialize(){}

    @Override
    public void update() {
        int turn = SceneManager.getInstance().getTurn();
        turn +=1;
        SceneManager.getInstance().setTurn(turn);
    }

    @Override
    public void render() {
        System.out.println("===================================");
        System.out.println("지성: " + user.getIntel());
        System.out.println("사교성: " + user.getSociability());
        System.out.println("도덕성: " + user.getMorality());
        System.out.println("예술성: " + user.getArtistry());
        System.out.println("스트레스: " + user.getPTSD());
        System.out.println("보유 골드: " + user.getWealth());
        System.out.println("===================================");



    }
}