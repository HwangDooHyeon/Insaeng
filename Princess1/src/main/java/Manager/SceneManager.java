package Manager;

import Scene.*;
import Scene.Menu;
import domain.User;
import dto.UserDto;
import service.UserService;

public class SceneManager {
    private static SceneManager instance = null;

    public static SceneManager getInstance()
    {
        if(instance == null)
            instance = new SceneManager();

        return instance;
    }

    private Scene sceneState = null;

    private UserService userService = null;
    private SceneManager() {
        userService = new UserService();
        UserDto userDTO = new UserDto();
        userService.create(userDTO);
        userDTO.setWealth(100);
        userService.updateuser(userDTO);
    }
    public int firstTurn = 24;
    public int turn = firstTurn;

    public int getTurn() {return turn; }

    public void setTurn(int turn) { this.turn = turn; }

    public void setScene(int Id) {
        switch (Id) {
            case 0:
                sceneState = new Menu();
                break;

            case 1:
                System.out.println("                                            학교에 갑니다.");
                this.sceneState = new EducationCenter();
                break;

            case 2:
                System.out.println("                                          아르바이트를 갑니다.");
//                this.sceneState = new ParttimeJob();
                break;

            case 3:
                System.out.println("                                           파티에 참석합니다.");
                //this.sceneState = new Party();
                break;

            case 4:
                System.out.println("                                             외출을 합니다.");
                //this.sceneState = new Out();
                break;

            case 5:
                System.out.println("                                           상태확인을 합니다.");
//                GameManager.getInstance().getUser().render();
                for (User user : userService.findAll()) {
                    user.render();
                    /*
                    System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                    System.out.println(
                            "                                              골드 : " + user.getWealth() + "\n" +
                                    "                                              ID : " + user.getID() + "\n" +
                                    "                                              지성 : " + user.getIntel() + "\n" +
                                    "                                              스트레스 : " + user.getPTSD() + "\n" +
                                    "                                              도덕성 : " + user.getMorality() + "\n" +
                                    "                                              사교성 : "+ user.getSociability() + "\n" +
                                    "                                              예술성 : " + user.getArtistry() + "\n");
                    System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
                    */
                }
                //GameManager.getInstance().getUser().turnRender();
                break;

            case 6:
                sceneState = new Intro();
                //GameManager.getInstance().getUser().turnUp();
                break;

        }
        this.sceneState.initialize();
    }

    public void update() {
        int result = sceneState.update();

        if(result == -1)
            turn++;
    }

    public void render(){
        sceneState.render();
    }
}