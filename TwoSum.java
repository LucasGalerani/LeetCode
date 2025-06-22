class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] retorno = new int[2];
        boolean status = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    retorno[0] = i;
                    retorno[1] = j;
                    status = true;
                    break;
                }
            }
            if (status) break;
        }
        return retorno;
    }
}
