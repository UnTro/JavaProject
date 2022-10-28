//import java.util.Objects;
import java.util.Scanner;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        System.out.println("you decided to execute "+input);
        switch (input) {
            case "wrapper" -> Depend.wrapper();
            case "foreachloop" -> Depend.foreachloop();
            case "overloadedmethod" -> Depend.overloaded();

            default -> System.out.println("Something went wrong or you entered an invalid command");
        }

    }
}