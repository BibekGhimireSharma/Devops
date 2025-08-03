public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = obj.isPalindrome(s);
        System.out.println("Output: " + result);
    }
}
