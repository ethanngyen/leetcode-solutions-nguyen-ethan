class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // Int j is used to track indices in nums2 array
        int j = 0;

        if (m >= 0 && n > 0)
        {
            // For loop to iterate through the whole nums1 array
            for (int i = 0; i < m + n - 1; i++)
            {
                // If nums1[i] <= nums2[j], do nothing and increment i
                if (j < n && nums1[i] > nums2[j]) // Move all the elements down one index
                {
                    for (int k = m + n - 1; k > i; k--)
                    {
                        // Move each of the indices to the indices afterwards
                        nums1[k] = nums1[k - 1];
                    }
                    // Insert the value into the correct slot
                    nums1[i] = nums2[j];
                    // Update pointer for nums2
                    j++;
                }
                // Print statements to debug
                System.out.println("Nums1 Iteration " + i + ":" + Arrays.toString(nums1));
                System.out.println("Nums2 Iteration " + i + ":" + Arrays.toString(nums2));
            }

            // Start at the index j + 1 index from the end
            if (j < n)
            {
                for (int i = m + j; i < nums1.length; i++)
                {
                    // Add the remaining elements
                    nums1[i] = nums2[j];
                    j++;
                }
            }
        }
    }
}