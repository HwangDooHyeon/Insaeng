package Menu;

public class AR {
    private Scanner scanner = null;
    private int input(){
        int num = 0;
        menuTxt();
        System.out.print("입력 : ");
        num = scanner.nextInt();

        return num;
    }

    public AR(){
        scanner = new Scanner(System.in);
    }

    public void menuTxt(){
        System.out.println("====== 알바 종류를 선택해 주세요 ======");
        System.out.println("1. 농장");
        System.out.println("2. 양로원");
        System.out.println("3. 뒷골목");
        System.out.println("===================================");
    }

    public void printAR(){

        int i = input();

        while(true) {
            if(0 < i && i < 4)
                break;
            else {
                System.out.println("잘못입력하셨습니다");
                i = input();
            }
        }

        User user = new User();

        switch (i) {
            case 1:
                System.out.println("농장을 선택하셨습니다.");
                System.out.println("돈 + 10\n" + "스트레스 + 7\n");


                user.setWealth(user.getWealth() + 10);
                user.setPTSD(user.getPTSD() + 7);
                break;

            case 2:
                System.out.println("양로원을 선택하셨습니다.");
                System.out.println("돈 + 3\n" + "스트레스 + 3\n" + "도덕성 + 5\n");


                user.setWealth(user.getWealth() + 3);
                user.setPTSD(user.getPTSD() + 3);
                user.setMorality(user.getMorality() + 5);
                break;

            case 3:
                System.out.println("뒷골목을 선택하셨습니다.");
                System.out.println("돈 + 30\n" + "스트레스 + 5\n" + "도덕성 - 10\n");

                user.setWealth(user.getWealth() + 30);
                user.setPTSD(user.getPTSD() + 5);
                user.setMorality(user.getMorality() - 10);
                break;
        }
    }
}