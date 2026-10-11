import java.util.Arrays;

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        //Sort the array in ascending order using the Arrays library
        Arrays.sort(arr);
        
        //Check each adjacent window
        if (arr[0] != 1)
        {
            arr[0] = 1;
        }

        for (int i = 1; i < arr.length; i++)
        {
            if (Math.abs(arr[i] - arr[i - 1]) > 1)
            {
                arr[i] = arr[i - 1] + 1;
            }
        }

        return arr[arr.length - 1];
        
        
    }

    
}
