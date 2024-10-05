//This Java program generates all possible subsets of a given set of integers. 
//It uses a simple iterative approach to build the power set, which is the set of all subsets including the empty set.
package resources;
import java.util.*;
public class Subsets {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int nums[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	nums[i]=sc.nextInt();
	    }
		//int nums[]= {1,2,3};
		List<List<Integer>> input= subsets(nums);
		System.out.println(input);

	}
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> res=new ArrayList<>();
		res.add(new ArrayList<>());
		for(int num : nums) {
			int n=res.size();
			for(int i=0;i<n;i++) {
				List<Integer> newset=new ArrayList<>(res.get(i));
				newset.add(num);
				res.add(newset);
			}
		}
		return res;
	}

}
// If the input is 3 followed by 1 2 3, the output will be:
// [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
