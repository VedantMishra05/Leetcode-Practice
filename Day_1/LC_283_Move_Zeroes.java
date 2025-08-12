package Day_1;

public class LC_283_Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);
    }

    static void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if(i != k) {
                    nums[k] = nums[i];
                    nums[i] = 0;
                }
                k++;
            }
        }

        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
