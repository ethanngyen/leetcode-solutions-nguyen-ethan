class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int possiblePlant = 0;

        if (flowerbed.size() == 1)
        {
            if (flowerbed[0] == 0)
            {
                possiblePlant++;
            }
        }
        else 
        {
            for (int i = 0; i < flowerbed.size(); i++)
            {
                // cout << "Checking index: " << i << endl;
                // Don't check the plot if there is already a flower
                if (flowerbed[i] != 1)
                {
                    // Check if adjacent squares
                    if (i > 0 && i < flowerbed.size() - 1)
                    {
                        if (flowerbed[i+1] == 0 && flowerbed[i-1] == 0)
                        {
                            possiblePlant++;
                            flowerbed[i] = 1;
                        }
                    }
                    else // Edge cases on either of the left or right
                    {
                        // LEFT
                        if (i == 0 && flowerbed[i+1] == 0)
                        {
                            possiblePlant++;
                            flowerbed[i] = 1;
                        }
                        // RIGHT
                        else if (i == flowerbed.size() - 1 && flowerbed[i-1] == 0)
                        {
                            possiblePlant++;
                            flowerbed[i] = 1;
                        }
                        else
                        {
                            continue;
                        }
                    }
                    // cout << "possiblePlant count: " << possiblePlant << endl;
                }
            }
        }
        
        if (possiblePlant >= n)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
};