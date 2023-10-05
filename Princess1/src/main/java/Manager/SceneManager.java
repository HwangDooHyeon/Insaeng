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
        userDTO.setIntel(100);
        userDTO.setWealth(100);
        userDTO.setSociability(100);
        userDTO.setMorality(100);
        userDTO.setArtistry(100);
        userDTO.setPTSD(100);
        userService.updateuser(userDTO);
    }
    public int turn = 5;

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
                this.sceneState = new ParttimeJob();
                break;

            case 3:
                System.out.println("                                           파티에 참석합니다.");
                this.sceneState = new Party();
                break;

            case 4:
                System.out.println("                                             외출을 합니다.");
                this.sceneState = new Out();
                break;

            case 5:

                System.out.println("                                           상태확인을 합니다.");
                this.sceneState = new Status();
                break;

            case 6:
                sceneState = new Intro();
                break;

        }
        this.sceneState.initialize();
    }
    public  void turnRender(){
        try {
            Thread.sleep(1000);
            System.out.println("                                    ༻✦༺ 　༺༻현재" + SceneManager.getInstance().getTurn() +"턴 남았습니다.༺༻　༻✦༺");
            Thread.sleep(1000);
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
            System.out.println("\n");
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");

        } catch (InterruptedException e) {e.printStackTrace();}
    }

    public void update() {
        int result = sceneState.update();
        if(result == -1) {
            turn++;
            turnRender();
        }else if(result == 1){
            turn++;
        }else if(result == 0){
            turnRender();
        }
    }

    public void render(){
        sceneState.render();
    }
}