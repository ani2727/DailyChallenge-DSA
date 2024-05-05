//Problem Link: https://rb.gy/4on4xa

//code
  class Solution
{
    public ArrayList <Integer> verticalSum(Node root) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) 
        {
            return result;
        }
        
        TreeMap<Integer, Integer> verticalSumMap = new TreeMap<>();
        verticalSumUtil(root, 0, verticalSumMap);
        
        for (Map.Entry<Integer, Integer> entry : verticalSumMap.entrySet()) 
        {
            result.add(entry.getValue());
        }
        
        return result;
    }
    
    private void verticalSumUtil(Node root, int verticalLine, TreeMap<Integer, Integer> verticalSumMap) {
        if (root == null) 
        {
            return;
        }
        
        verticalSumMap.put(verticalLine, verticalSumMap.getOrDefault(verticalLine, 0) + root.data);
        
        verticalSumUtil(root.left, verticalLine - 1, verticalSumMap);
        verticalSumUtil(root.right, verticalLine + 1, verticalSumMap);
    }
}
