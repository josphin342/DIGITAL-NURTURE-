import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details (ID Name). Type 'done' to finish:");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            String[] parts = input.split(" ");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            studentMap.put(id, name);
        }

        System.out.print("Enter student ID to retrieve name: ");
        int id = sc.nextInt();
        String name = studentMap.get(id);

        if (name != null) {
            System.out.println("Student Name: " + name);
        } else {
            System.out.println("No student found with ID " + id);
        }

        sc.close();
    }
}

