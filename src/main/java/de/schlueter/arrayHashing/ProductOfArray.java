package de.schlueter.arrayHashing;

/**
 * ProductOfArray
 */
public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        int rightProduct = 1, num = 0;
        for (int j = nums.length - 1; j >= 0; j--) {
            num = nums[j];
            nums[j] = leftProduct[j] * rightProduct;
            rightProduct = num * rightProduct;
        }
        return nums;
    }
}
