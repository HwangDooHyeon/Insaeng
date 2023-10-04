package User;


import Controller.SceneController;
import DTO.UserDTO;
import lombok.Builder;
import lombok.Getter;

@Getter
public class User {
    private Long ID;
    private final int MAX = 100;
    private final int MIN = 0;
    private  int Intel = 0;
    private int Wealth = 100;
    private  int Sociability = 0;
    private  int Morality = 0;
    private  int Artistry = 0;
    private  int PTSD = 0;

    public User() { }

    @Builder
    public User(long ID, int Intel, int Wealth, int Sociability, int Morality, int Artistry, int PTSD) {
        this.ID = ID;
        this.Intel = Intel;
        this.Wealth = Wealth;
        this.Sociability = Sociability;
        this.Morality = Morality;
        this.Artistry = Artistry;
        this.PTSD = PTSD;
    }

    public int turnUp(){
        int turn = SceneController.getInstance().getTurn();
        turn +=1;
        SceneController.getInstance().setTurn(turn);
        return 0;
    }
    public  void turnRender(){
        try {
            Thread.sleep(1000);
            System.out.println("                                    ༻✦༺ 　༺༻현재" + SceneController.getInstance().getTurn() +"턴 남았습니다.༺༻　༻✦༺");
            Thread.sleep(1000);
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
            System.out.println("\n");
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");

        } catch (InterruptedException e) {e.printStackTrace();}
    }

    public void render(){
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
        System.out.println("                                              골드 : " + getWealth());
        System.out.println("                                              지성 : " +getIntel());
        System.out.println("                                              스트레스 : " + getPTSD());
        System.out.println("                                              도덕성 : " + getMorality());
        System.out.println("                                              사교성 : "+ getSociability());
        System.out.println("                                              예술성 : " + getArtistry());
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
    }

}