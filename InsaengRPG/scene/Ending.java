package scene;

public class Ending extends Scene{

    @Override
    public void initialize() { }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public void render() {
        if (user.getIntel() > 90 && user.getSociability() > 90 && user.getMorality() > 90 && user.getArtistry() > 90) {
            System.out.println("왕이 되었습니다.");
        } else if (user.getWealth() > 90 && user.getMorality() > 20) {
            System.out.println("재력가가 되었습니다.");
        } else if (user.getArtistry() > 70) {
            System.out.println("예술가가 되었습니다.");
        } else if (user.getPTSD() > 80 && user.getMorality() < 20) {
            System.out.println("마왕이 되었습니다.");
        } else {
            System.out.println("돼지농장주인이 되었습니다.");
        }

    }
}
