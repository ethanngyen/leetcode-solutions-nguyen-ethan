class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Check if the string length is 0, return empty
        if (strs == null || strs.length == 0)
        {
            return "";
        }

        String first = strs[0];

        // Given an array of strings, iterate through all at once
        // Iterate through the first string
        for (int i = 0; i < first.length(); i++)
        {
            char c = first.charAt(i);

            for (int j = 1; j < strs.length; j++)
            {
                // If string index out of bounds or chars differ
                if (i >= strs[j].length() || strs[j].charAt(i) != c)
                {
                    return first.substring(0, i);
                }
            }
        }

        return first;
        
    }
}