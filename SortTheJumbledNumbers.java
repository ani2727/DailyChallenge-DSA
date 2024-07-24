//Problem Link: https://rb.gy/ks9e7y

//code
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums) {
            mp.put(num,translateInteger(num,mapping));
        }

        Integer[] result = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(result,(a,b) -> Integer.compare(mp.get(a),mp.get(b)));

        for(int i = 0 ; i < nums.length ; i ++) {
            nums[i] = result[i];
        }
        return nums;
    }
    public int translateInteger(int num, int[] mapping) {
        char digits[] = Integer.toString(num).toCharArray();

        for(int i = 0 ; i < digits.length ; i ++) {
            digits[i] = (char) ('0'+mapping[digits[i]-'0']);
        }

        return Integer.parseInt(new String(digits));
    }
}
