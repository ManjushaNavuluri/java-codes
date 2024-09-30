package examplesPrograms;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        //int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
    	int[] arr = {12,2,90,100,89,200,30,250};
        System.out.println("Length of LIS: " + findLIS(arr));
    }

    public static int findLIS(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
            if (max < lis[i]) {
                max = lis[i];
            }
        }
        for(int i=0;i<n;i++){
        	System.out.print(lis[i]+" ");
        }
        System.out.println();
        return max;
    }
}
