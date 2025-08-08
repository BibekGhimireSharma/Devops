public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            //checks the condition whether it is equal or not
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
        int len = obj.removeDuplicates(nums);
        System.out.print("Output: [");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
            if (i != len - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
