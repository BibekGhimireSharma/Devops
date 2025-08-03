public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        char[] input = { 'h', 'e', 'l', 'l', 'o' };
        obj.reverseString(input);
        System.out.print("Output: ");
        for (char c : input) {
            System.out.print(c);
        }
        System.out.println();
    }
}
