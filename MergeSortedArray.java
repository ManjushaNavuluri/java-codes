package examplesPrograms;
import java.util.*;
public class MergeSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		int m = 0,n=0;
		for(int i=0;i<n1;i++) {
			a[i]=sc.nextInt();
			if (a[i] != 0) {
                m++;
            }
		}
		for(int i=0;i<n2;i++) {
			b[i]=sc.nextInt();
			if (b[i] != 0) {
                n++;
            }
		}
		Arrays.sort(a);
		Arrays.sort(b);
		merge(a,m,b,n);
		for (int num : a) {
            System.out.print(num + " ");
        }
		
	}
	public static void merge(int[] a,int m,int b[],int n) {
		int p1=m-1;
		int p2=n-1;
		int pMerge=m+n-1;
		while(p2>=0) {
			if(p1>=0 && a[p1]>b[p2]){
				a[pMerge--]=a[p1--];
			}
			else {
				a[pMerge--]=b[p2--];
			}
		}
	}

}
