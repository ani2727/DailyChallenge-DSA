//Problem Link: https://rb.gy/ww91nx

//code 
public class Solution 
{
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  
	{
			ArrayList<ArrayList<Integer>> list = new ArrayList<>();
			Arrays.sort(arr);
			for(int i = 0 ; i < n ; i ++)
			{
				if(i > 0 && arr[i] == arr[i-1]) continue;

				int j = i+1;
				int k = n-1;

				while(j < k) {
					long sum = arr[i]+arr[j]+arr[k];

					if(sum < K) {
						j ++;
						while(j < k && arr[j] == arr[j-1]) j ++;
					} 
					else if(sum > K) {
						k --;
						while(j < k && arr[k] == arr[k+1]) k --;
					}
					else {
						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						list.add(new ArrayList<>(temp));
						j ++;
						k --;
						while(j < k && arr[j] == arr[j-1]) j ++;
						while(j < k && arr[k] == arr[k+1]) k --;
					}
				}
			}

		return list;
	}
}
