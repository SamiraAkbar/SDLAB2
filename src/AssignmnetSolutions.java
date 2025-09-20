import java.util.Scanner;

public class AssignmnetSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu to select problem
        while (true) {
            System.out.println("\n--- EASY JAVA PROBLEMS ---");
            System.out.println("1. Print Hello, World!");
            System.out.println("2. Take user's name and greet them");
            System.out.println("3. Check if a number is even or odd");
            System.out.println("4. Find maximum of 3 numbers");
            System.out.println("5. Simple Calculator (Add, Sub, Mul, Div)");
            System.out.println("6. Print numbers from 1 to N");
            System.out.println("7. Print multiplication table of a number");
            System.out.println("8. Calculate factorial of a number");
            System.out.println("9. Sum of all numbers from 1 to N");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Hello, World!");
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.println("Hello, " + name + "!");
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    if (num % 2 == 0)
                        System.out.println(num + " is Even.");
                    else
                        System.out.println(num + " is Odd.");
                    break;

                case 4:
                    System.out.print("Enter 3 numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int max = a;
                    if (b > max) max = b;
                    if (c > max) max = c;
                    System.out.println("Maximum is: " + max);
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    double x = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double y = sc.nextDouble();
                    System.out.print("Enter operation (+ - * /): ");
                    char op = sc.next().charAt(0);
                    switch (op) {
                        case '+': System.out.println("Result = " + (x + y)); break;
                        case '-': System.out.println("Result = " + (x - y)); break;
                        case '*': System.out.println("Result = " + (x * y)); break;
                        case '/':
                            if (y != 0) System.out.println("Result = " + (x / y));
                            else System.out.println("Division by zero not allowed!");
                            break;
                        default: System.out.println("Invalid operator.");
                    }
                    break;

                case 6:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    int tableNum = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
                    }
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    int factNum = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= factNum; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial = " + fact);
                    break;

                case 9:
                    System.out.print("Enter N: ");
                    int sumN = sc.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= sumN; i++) {
                        sum += i;
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
