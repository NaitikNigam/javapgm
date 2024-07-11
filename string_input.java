import java.util.Scanner;

public class string_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
         scanner.nextLine();

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        

        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}
