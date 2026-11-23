class Solution {
public:
    int maxArea(vector<int>& height) {
        int rightP = height.size() - 1;
        int leftP = 0;
        int max = 0;
        int currentArea = 0;
        
        while (leftP < rightP)
        {
            // Calculate area
            currentArea = min(height[leftP], height[rightP]) * (rightP - leftP);
            if (currentArea >= max)
            {
                max = currentArea;
            }
            
            // Increment either left or right pointer
            if (min(height[leftP], height[rightP]) == height[leftP])
            {
                leftP++;
            }
            else
            {
                rightP--;
            }
        }
        
        return max;

    }
};