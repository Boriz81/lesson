import java.util.Scanner;

public class Main {
    public static void exit() {
      System.out.println("goodby!");
    };
    public static void main(String[] args) {
        String[] zoo = {"camel", "lion", "bear", "bat"};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(true) {
            if (input.equals("exit")) {
                exit();
                break;
            } else {
                //println == print
                System.out.println(zoo[Integer.parseInt(input)]);
                input = scanner.nextLine();
            }
        }
    }
}