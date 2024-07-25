//Problem Link: https://rb.gy/om8gqa

//code
class Solution {
    public void merge(int low,int mid,int high,int nums[]) {
        int temp[] = new int[high+1];
        int left = low,right = mid+1;
        int i = 0;
        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                temp[i ++] = nums[left ++];
            }
            else temp[i ++] = nums[right ++];
        }
        while(left <= mid) temp[i ++] = nums[left ++];
        while(right <= high) temp[i ++] = nums[right ++];

        for(i = low ; i <= high ; i ++) {
            nums[i] = temp[i-low];
        } 
    }
    public void mergeSort(int low, int high, int[] nums) {
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(low,mid,nums);
        mergeSort(mid+1,high,nums);
        merge(low,mid,high,nums);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(0,nums.length-1,nums);
        return nums;
    }
}
