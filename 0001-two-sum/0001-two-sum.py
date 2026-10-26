class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # Hashmap for storing values
        combination = {} # value : index

        for i, num in enumerate(nums):
            # Calculate the difference between current number and target
            diff = target - num
            
            # If the difference value, return indices both values 
            if diff in combination:
                return [combination[diff], i]
            
            combination[num] = i