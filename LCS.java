public class LCS {

    public int findLengthOfLCIS(int[] nums) {

        int l = 0;
        int maxlen = 1;

        for (int r = 1; r < nums.length; r++) {

            if (nums[r] <= nums[r - 1]) {
                l = r;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }

    public static void main(String[] args) {

        LCS obj = new LCS();

        int[] nums = {1, 3, 5, 4, 7};

        int result = obj.findLengthOfLCIS(nums);

        System.out.println("Longest Continuous Increasing Subsequence Length: " + result);
    }
}