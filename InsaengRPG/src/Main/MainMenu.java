//package src.Main;
//
//import src.Menu.AR;
//import src.Menu.Edu;
//import src.Menu.Out;
//import src.Menu.PT;
//
//
//import java.util.Scanner;
//
//class MainMenu {
//    public static void main(String[] args) {
//        int ed = 0;
//        int num = 0;
//
//
//        System.out.print("메뉴를 선택해주세요.>");
//
//        Scanner scanner = new Scanner(System.in);
//        int e = scanner.nextInt();              // 화면을 총해 입력받은 숫자를 e에 저장
//
//        switch (e) {
//            case 1:
//                System.out.println("선택하신 메뉴는 교육 입니다");
//                Edu.printEd();
//                break;
//            case 2:
//                System.out.println("선택하신 메뉴는 알바 입니다");
//                AR.printAR();
//                break;
//            case 3:
//                System.out.println("선택하신 메뉴는 파티 입니다");
//                PT.printPT();
//                break;
//            case 4:
//                System.out.println("선택하신 메뉴는 외출 입니다");
//                Out.printOut();
//                break;
//            default:
//                System.out.println("선택하신 메뉴는 상태 입니다");
//        }
//    }
//}