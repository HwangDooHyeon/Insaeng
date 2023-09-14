package utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanManager {
    private static Scanner scanner = null;

    public static void initialize(){
        scanner = new Scanner(System.in);
    }

    public static int scanInt(){
        int input = 0;

        while(true){
            try {
                System.out.print("입력 : ");
                input = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e ) {
                scanner.nextLine();
                System.out.println("숫자를 입력해주세요.");
            }
        }

        return scanner.nextInt();
    }

    public static int scanInt(String str){
        int input = 0;

        while(true){
            try {
                System.out.print(str);
                input = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e ) {
                scanner.nextLine();
                System.out.println("숫자를 입력해주세요.");
            }
        }

        return scanner.nextInt();
    }


}
