 class TwoSum_P_1{
    public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
        }
    }
    // If no solution is found, return an empty array or throw an exception.
    return new int[0];
}
}