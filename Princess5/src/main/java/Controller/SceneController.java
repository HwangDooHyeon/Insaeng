package Controller;

import DAO.SceneDAOImplement;
import DTO.UserDTO;
import Service.EducationCenterService;
import Service.OutService;
import Service.ParttimeJobService;
import Service.PartyService;
import User.User;

import java.util.Scanner;

public class SceneController {
    private static SceneController instance = null;

    public static SceneController getInstance()
    {
        if(instance == null)
            instance = new SceneController();

        return instance;
    }

    SceneDAOImplement sceneDAOImplement = null;
    UserDTO userDTO = null;

    public SceneController() {
        userDTO = new UserDTO();
        sceneDAOImplement = new SceneDAOImplement();

        userDTO.setIntel(100);
        userDTO.setWealth(100);
        userDTO.setPTSD(0);
        userDTO.setMorality(0);
        userDTO.setSociability(0);
        userDTO.setArtistry(55);

        sceneDAOImplement.createTable();

        sceneDAOImplement.create(userDTO.toEntity());

    }

    private Scene sceneState = null;
    public int firstTurn = 24;
    public int turn = firstTurn;

    Scanner scanner = new Scanner(System.in);


    public int getTurn() {return turn; }

    public void setTurn(int turn) { this.turn = turn; }

    public void setScene(int Id) {
        switch (Id) {
            case 0:
                sceneState = new MenuController();
                break;

            case 1:
                System.out.println("                                            학교에 갑니다.");
                this.sceneState = new EducationCenterService();
                break;

            case 2:

                System.out.println("                                          아르바이트를 갑니다.");
                this.sceneState = new ParttimeJobService();


                break;

            case 3:
                System.out.println("                                           파티에 참석합니다.");
                this.sceneState = new PartyService();
                break;

            case 4:
                System.out.println("                                             외출을 합니다.");
                this.sceneState = new OutService();
                break;

            case 5:
                System.out.println("                                           상태확인을 합니다.");
               // GameController.getInstance().getUser().render();
                for (User user : sceneDAOImplement.findAll()) {
                    System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                    System.out.println(
                            "                                              골드 : " + user.getWealth() + "\n" +
                                    "                                              지성 : " + user.getIntel() + "\n" +
                                    "                                              스트레스 : " + user.getPTSD() + "\n" +
                                    "                                              도덕성 : " + user.getMorality() + "\n" +
                                    "                                              사교성 : "+ user.getSociability() + "\n" +
                                    "                                              예술성 : " + user.getArtistry() + "\n");
                    System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                }

                GameController.getInstance().getUser().turnRender();
                break;

            case 6:
                sceneState = new IntroController();
                GameController.getInstance().getUser().turnUp();
                break;

        }
        this.sceneState.initialize();

            //break;
        }

    public void update() {
        sceneState.update();
    }

    public void render(){
        sceneState.render();
    }
}