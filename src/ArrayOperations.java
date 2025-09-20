import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Store 5 numbers
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print numbers
        System.out.println("Numbers: " + Arrays.toString(numbers));

        // Largest number
        int largest = numbers[0];
        for(int num : numbers) {
            if(num > largest) largest = num;
        }
        System.out.println("Largest number: " + largest);

        // Smallest number
        int smallest = numbers[0];
        for(int num : numbers) {
            if(num < smallest) smallest = num;
        }
        System.out.println("Smallest number: " + smallest);

        // Average
        int sum = 0;
        for(int num : numbers) sum += num;
        double avg = sum / 5.0;
        System.out.println("Average: " + avg);

        // Count even and odd
        int even = 0, odd = 0;
        for(int num : numbers) {
            if(num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even count: " + even + ", Odd count: " + odd);

        // Search for element
        System.out.print("Enter a number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int num : numbers) {
            if(num == search) found = true;
        }
        System.out.println(found ? "Found" : "Not Found");

        // Sort ascending
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
