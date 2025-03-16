package mission;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Todo: 프로그램 구현
        Scanner scanner = new Scanner(System.in);

        System.out.print("별찍기 단계(1~9)를 입력해주세요.");
        int Stage = scanner.nextInt(); //Stage 입력

        System.out.print("별찍기 크기를 입력해주세요.");
        int Size = scanner.nextInt(); //Size 입력

        if (Stage == 1) {
            for (int i = 1; i <= Size; i++){
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Stage == 2) {
            for (int i = Size; i > 0; i--){
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Stage == 3) {
            for (int i = Size; i > 0; i--){
                for (int k = Size; k > i; k--){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Stage == 4) {
            for (int i = 1; i < Size; i++){
                for (int k = Size; k >= i; k--){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = Size; i >= 1; i--){
                for (int k = Size; k >= i; k--){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
