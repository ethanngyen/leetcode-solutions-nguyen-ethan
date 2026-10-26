from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        # Create dictionary and result array
        anagram_map = defaultdict(list)
        result = []

        # Traverse through the strs list and create a hashmap via sort
        for word in strs:
            sorted_words = tuple(sorted(word))
            anagram_map[sorted_words].append(word)

            #print(sorted_words)
        
        #print(anagram_map)

        # For all the values in the anagram_map, append to result
        for value in anagram_map.values():
            result.append(value)
        
        return result