import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter student details (ID Name). Type 'done' to finish:");
        while (true) {
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(name);
        }

        System.out.println("Student Names:");
        for (String student : studentNames) {
            System.out.println(student);
        }

        scanner.close();
    }
}

