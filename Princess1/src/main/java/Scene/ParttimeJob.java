//package Scene;
//
//import Manager.*;
//import dto.UserDto;
//import service.UserService;
//
//import java.util.Scanner;
//
//public class ParttimeJob extends Scene {
//    private String farm = "농장";
//    private String silverTown = "양로원";
//    private String background = "뒷골목";
//    private String mainMenu = "메인";
//
//    private int input() {
//        int num = 0;
//        menuTxt();
//
//        try {
//            System.out.print("                                            알바 종류 입력 : ");
//            num = scanner.nextInt();
//        } catch (Exception e) {
//            System.out.println("                                      에러");
//        }
//        return num;
//    }
//
//    public void menuTxt() {
//        System.out.println("                                   ༻✦༺ 　༻알바 장소를 선택해 주세요༺　༻✦༺");
//        System.out.println("                                     ༻✦༺ 　༺༻ 보유 골드: " + user.getWealth() + "༺༻ 　༻✦༺");
//        System.out.println("                                              1. " + farm);
//        System.out.println("                                              2. " + silverTown);
//        System.out.println("                                              3. " + background);
//        System.out.println("                                              4. " + mainMenu);
//        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
//    }
//
//    public void renderTxt(){
//        if(sceneName != mainMenu) {
//            try {
//                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
//                System.out.println("                                        " + sceneName + " 을(를) 선택하셨습니다.");
//                Thread.sleep(1000);
//                System.out.print("                                        돈 +" + sceneWealth + " 스트레스 +" + scenePTSD);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }else{
//            try {
//                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
//                System.out.println("                                        " + sceneName + " 을(를) 선택하셨습니다.");
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        if(sceneName ==  silverTown){
//            System.out.println(" 도덕성 +"+sceneMorality);
//        }else if(sceneName ==  background){
//            System.out.println(" 도덕성 -"+sceneMorality);
//        }else if(sceneName == farm) {
//            System.out.print("\n");
//        }else{}
//        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
//    }
//
//
//    @Override
//    public void initialize() {
//        this.user = GameManager.getInstance().getUser();
//        scanner = new Scanner(System.in);
//    }
//
//    @Override
//    public int update() {
//        int i = input();
//
//        while(true) {
//            if(0 < i && i < 5) {
//                break;
//            } else {
//                System.out.println("                                         잘 못 입력하셨습니다");
//                i = input();
//            }
//        }
//        UserDto userDTO = new UserDto();
//        UserService userService = new UserService();
//
//
//        switch (i) {
//            case 1:
//                sceneName =  farm;
//                sceneWealth = 10;
//                scenePTSD = 7;
//                break;
//
//            case 2:
//                sceneName =  silverTown;
//                sceneWealth = 3;
//                scenePTSD = 3;
//                sceneMorality = 5;
//                userDTO.setMorality(user.getMorality() + sceneMorality);
//                break;
//
//            case 3:
//                sceneName =  background;
//                sceneWealth = 30;
//                scenePTSD = 5;
//                sceneMorality = 10;
//                userDTO.setMorality(user.getMorality() - sceneMorality);
//                break;
//
//            case 4:
//                sceneName = mainMenu;
//                GameManager.getInstance().getUser().turnUp();
//                break;
//
//        }
//
//        userDTO.setWealth(user.getWealth() + sceneWealth);
//        userDTO.setPTSD(user.getPTSD() + scenePTSD);
//        userService.save(userDTO);
//        renderTxt();
//        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
//        GameManager.getInstance().getUser().turnRender();
//        return 0;
//    }
//
//    @Override
//    public void render() {}
//}