class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Return 1-based index as per problem requirement
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Return dummy value if no solution found
        return new int[] { -1, -1 };
    }

    // For testing the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = sol.twoSum(numbers, target);

        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}
