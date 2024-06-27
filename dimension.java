import java.util.Scanner;

public class dimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimension number:");
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        System.out.println("Enter values for the 1D array:");
        for (int i = 0; i < num; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate average value
        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += numbers[i];
        }
        double average = sum / num;
        System.out.println("Average value: " + average);

        // Print elements in reverse order
        System.out.println("Elements in reverse order:");
        for (int i = num - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
