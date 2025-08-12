package Day_1;

public class LC_53_Maximum_Subarray {
    public static void main(String[] args) {
        // Basically kadane's algorithm

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSum(nums));
    }

    static int maximumSum(int nums[]) {
        int currentSum = nums[0], maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
