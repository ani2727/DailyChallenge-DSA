//Problem Link: https://rb.gy/vyejbu

//code
class Solution {
    public Node solve(int start,int end, int[] nums) {
        if(start > end) return null;
        int mid = start+(end-start)/2;
        
        Node nn = new Node(nums[mid]);
        nn.left = solve(start,mid-1,nums);
        nn.right = solve(mid+1,end,nums);
        
        return nn;
    }
    public Node sortedArrayToBST(int[] nums) {
        return solve(0,nums.length-1,nums);
    }
}
