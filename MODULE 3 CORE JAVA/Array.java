import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
        sc.close(); 
    }
}

