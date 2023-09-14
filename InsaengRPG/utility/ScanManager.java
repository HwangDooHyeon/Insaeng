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

        while(input < 1 || 5 < input){
            try {
                System.out.print("입력 : ");
                input = scanner.nextInt();
                scanner.nextLine();

                if(!(0 < input && input < 6))
                    System.out.println("1 ~ 5 사이의 값을 입력해 주세요.");
            }
            catch (InputMismatchException e ) {
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

                if(!(0 < input && input < 6))
                    System.out.println("1 ~ 5 사이의 값을 입력해 주세요.");
            }
            catch (InputMismatchException e ) {
                scanner.nextLine();
                System.out.println("숫자를 입력해주세요.");
            }
        }

        return input;
    }
}
