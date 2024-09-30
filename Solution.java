package examplesPrograms;
import java.util.Scanner;

class Solution {
    int getNumTowers(int[] A) {
        int count = 0;
        int maxHeight = 0;
        
        for (int height : A) {
            if (height <= maxHeight) {
                count++;
            }
            maxHeight = Math.max(maxHeight, height);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int[] towers = new int[n];
            
            for (int j = 0; j < n; j++) {
                towers[j] = scanner.nextInt();
            }
            
            Solution solution = new Solution();
            int result = solution.getNumTowers(towers);
            System.out.println(result);
        }
        
        scanner.close();
    }
}
