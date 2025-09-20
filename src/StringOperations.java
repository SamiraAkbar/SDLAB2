import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Check palindrome
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome");

        // Count vowels and consonants
        int vowels = 0, consonants = 0;
        for(char c : str.toLowerCase().toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                if("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}

