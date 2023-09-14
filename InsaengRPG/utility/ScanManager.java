package utility;

import java.util.Scanner;

public class ScanManager {
    private static Scanner scanner = null;

    public static void initialize(){
        scanner = new Scanner(System.in);
    }

    public static int scanInt(){
        int input = 0;

        while(input < 1 || 5 < input){
            try {
                System.out.print("입력 : ");
                input = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            catch (Exception e ) {
                scanner.nextLine();
                System.out.println("숫자를 입력해주세요.");
            }
        }

        return input;
    }

    public static int scanInt(String str){
        int input = 0;

        while(input < 1 || 5 < input){
            try {
                System.out.print(str);
                input = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            catch (Exception e ) {
                scanner.nextLine();
                System.out.println("숫자를 입력해주세요.");
            }
        }

        return input;
    }
}
