
import java.util.Scanner;

public class FactorialTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long result = 1;
        int left = 1, right = n;

        // Two pointers: left from 1 up, right from n down
        while (left <= right) {
            if (left == right) {
                result *= left; // Multiply only once when pointers meet
            } else {
                result *= left * right; // Multiply both pointers
            }
            left++;
            right--;
        }

        System.out.println("Factorial of " + n + " is: " + result);
    }
}
