class Solution {
    public int[] findArray(int[] pref) {
        int[] output = new int[pref.length];

        output[0] = pref[0];

        for (int i = 1; i < output.length; i++)
        {
            if (pref[i-1] == pref[i])
            {
                output[i] = pref[i];
            }
            else
            {
                output[i] = pref[i-1] ^ pref[i];
            }
        }

        return output;
    }
}