public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                insertPos++;
            }
        }
    }
//
    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = { 0, 1, 0, 3, 12 };
        obj.moveZeroes(nums);
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
