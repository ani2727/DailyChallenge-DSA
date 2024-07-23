//Problem Link: https://rb.gy/o8jox3

//code
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        Integer[] numsArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        
        Arrays.sort(numsArray, (a, b) -> {
            if (!freqMap.get(a).equals(freqMap.get(b))) {
                return freqMap.get(a) - freqMap.get(b);
            } else {
                return b - a; 
            }
        });
        
        return Arrays.stream(numsArray).mapToInt(Integer::intValue).toArray();
    }
}
