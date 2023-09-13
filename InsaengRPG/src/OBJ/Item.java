package OBJ;

import Main.ObjectManager;

public class Item extends Object {

    protected Object user = null;

    public void initialize(){
        this.user = ObjectManager.getInstance().getUser();
    }
    public void update(){}
    public void render(){}
    private void erasePTSD() {
        user.setPTSD(user.getPTSD() - 1);
    }
    private void eraseWealth() {
        user.setWealth(user.getWealth() - 5);
    }

    private void getGoomonBook() {
        user.setIntel(user.getIntel() + 3);
        erasePTSD();
        eraseWealth();
    }

    private void getSsenBook() {
        user.setIntel(user.getIntel() + 5);
        erasePTSD();
        eraseWealth();
    }

    private void getMajorBook() {
        user.setIntel(user.getIntel() + 7);
        erasePTSD();
        eraseWealth();
    }

    private void getSilver() {
        user.setSociability(user.getSociability() + 3);
        erasePTSD();
        eraseWealth();
    }

    private void getGold() {
        user.setSociability(user.getSociability() + 5);
        erasePTSD();
        eraseWealth();
    }

    private void getDiamond() {
        user.setSociability(user.getSociability() + 7);
        erasePTSD();
        eraseWealth();
    }

    private void getArtMuseum_1() {
        user.setArtistry(user.getArtistry() + 3);
        erasePTSD();
        eraseWealth();
    }

    private void getArtMuseum_2() {
        user.setArtistry(user.getArtistry() + 5);
        erasePTSD();
        eraseWealth();
    }

    private void getArtMuseum_3() {
        user.setArtistry(user.getArtistry() + 7);
        erasePTSD();
        eraseWealth();
    }

    private void getEclipse() {
        user.setPTSD(user.getPTSD() - 3);
        erasePTSD();
        eraseWealth();
    }

    private void getPureMilkyMacaroon() {
        user.setPTSD(user.getPTSD() - 5);
        erasePTSD();
        eraseWealth();
    }

    private void getMakGookSu() {
        user.setPTSD(user.getPTSD() - 7);
        erasePTSD();
        eraseWealth();
    }

    public void randomBookStoreItem() {
        int randomI;
        int randomItem = 0;
        for (randomI = 0; randomI < 1; randomI++) {
            randomItem = (int) (Math.random() * 3 + 1 - 1) + 1;    // 1 ~ 3 의 무작위 수
        }

        switch (randomItem) {
            case 1:
                getGoomonBook();
                System.out.println("서점에서 구몬책을 구매하셨습니다.");
                break;
            case 2:
                getSsenBook();
                System.out.println("서점에서 쎈수학을 구매하셨습니다.");
                break;
            case 3:
                getMajorBook();
                System.out.println("서점에서 전공 서적을 구매하셨습니다.");
                break;
        }
    }

    public void randomGoldBarItem() {
        int randomI;
        int randomItem = 0;
        for (randomI = 0; randomI < 1; randomI++) {
            randomItem = (int) (Math.random() * 3 + 1 - 1) + 1;    // 1 ~ 3 의 무작위 수
        }

        switch (randomItem) {
            case 1:
                getSilver();
                System.out.println("금거래소에서 은을 구매하셨습니다.");
                break;
            case 2:
                getGold();
                System.out.println("금거래소에서 금을 구매하셨습니다.");
                break;
            case 3:
                getDiamond();
                System.out.println("금거래소에서 다이아몬드를 구매하셨습니다.");
                break;
        }
    }

    public void randomArtMuseumItem() {
        int randomI;
        int randomItem = 0;
        for (randomI = 0; randomI < 1; randomI++) {
            randomItem = (int) (Math.random() * 3 + 1 - 1) + 1;    // 1 ~ 3 의 무작위 수
        }

        switch (randomItem) {
            case 1:
                getArtMuseum_1();
                System.out.println("미술관 을 합니다.");
                break;
            case 2:
                getArtMuseum_2();
                System.out.println("미술관 구경을 합니다.");
                break;
            case 3:
                getArtMuseum_3();
                System.out.println("미술관 구경을 합니다.");
                break;
        }
    }

    public void randomGeneralStoreItem() {
        int randomI;
        int randomItem = 0;
        for (randomI = 0; randomI < 1; randomI++) {
            randomItem = (int) (Math.random() * 3 + 1 - 1) + 1;    // 1 ~ 3 의 무작위 수
        }

        switch (randomItem) {
            case 1:
                getEclipse();
                System.out.println("잡화점에서 이클립스를 구매하셨습니다.");
                break;
            case 2:
                getPureMilkyMacaroon();
                System.out.println("잡화점에서 순수우유마카롱을 구매하셨습니다.");
                break;
            case 3:
                getMakGookSu();
                System.out.println("잡화점에서 막국수를 구매하셨습니다.");
                break;
        }
    }

}
