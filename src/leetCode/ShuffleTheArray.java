package leetCode;

import java.util.Arrays;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn], return the array in the form [x1,y1,x2,y2,...,xn,yn].
//Input:
//nums = [2,5,1,3,4,7], n = 3
//Output:
//[2,3,5,4,1,7]

public class ShuffleTheArray {

	public static void main(String[] args) {
		int [] nums= {2,5,1,3,4,7};
		int n=3;
		
		int []ans=new int[2*n];
		for(int i=0;i<n;i++) {
			ans[2*i]=nums[i];
			ans[2*i+1]=nums[i+n];
		}
		System.out.println("Shuffled array"+Arrays.toString(ans));
	}

}
