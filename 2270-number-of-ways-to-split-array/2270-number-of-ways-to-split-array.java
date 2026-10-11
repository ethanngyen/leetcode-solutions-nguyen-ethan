class Solution {
    public int waysToSplitArray(int[] nums) {
        // Initialize sum variables to keep track of left and right arrays
        // leftSum is always going to be less than rightSum so that conditional doesn't fail if there are no valid splits
        long rightSum = 0;
        long leftSum = 0;
        int validSplits = 0;

        // Get the rightSum by looping through the array
        for (int s : nums)
        {
            rightSum += s;
        } 

        // While there are valid splits
        // Loop through the whole array

        // Print length of array for debugging
        // System.out.println("Array length: " + nums.length);

        for (int i = 0; i < nums.length - 1; i++)
        {
            // Track iteration for debugging
            // System.out.println("Iteration: " + i);

            // For the leftSum, add by the index values
            // For the rightSum, we will subtract the by the left indices
            leftSum += nums[i];
            rightSum -= nums[i];

            // Print out left and right sum for debugging
            // System.out.println("Left Sum: " + leftSum);
            // System.out.println("Right Sum: " + rightSum);

            // Valid split if sum of left array is greater than or equal to right array
            if (leftSum >= rightSum)
            {
                validSplits++;
            }
            // System.out.println("Valid Splits: " + validSplits);

        }

        return validSplits;
    }
}