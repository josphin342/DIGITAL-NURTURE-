import java.util.Scanner;

public class Stringreversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse(); 
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}

