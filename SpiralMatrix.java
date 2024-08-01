//Problem Link: https://rb.gy/6vn8wj

//code
class Solution {
    
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        
        int top = 0, left = 0 , bottom = m-1 , right = n-1;
        
        while(top <= bottom && left <= right) {
            
            for(int i = left ; i <= right ; i ++) {
                
                list.add(mat[top][i]);
            }
            top ++;
            
            for(int i = top ; i <= bottom; i ++) {
                
                list.add(mat[i][right]);
            }
            right --;
            
            if(top <= bottom ) {
                
                for(int i = right ; i >= left ; i --) {
                
                    list.add(mat[bottom][i]);
                }
                bottom --;
            }
            
            if(left <= right) {
                
                for(int i = bottom ; i >= top ; i --) {
                
                    list.add(mat[i][left]);
                }
                left ++;
            }
            
        }
        
        return list;
    }
}
