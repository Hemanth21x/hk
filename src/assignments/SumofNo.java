package assignments;

public class SumofNo {

	public static void main(String[] args) {
		int [] arr= {2,8,6,5,4,6};
		int target=10;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+","+arr[j]);
				}
				if(j == arr.length-1) {
					break;
				}
			}
		}

  }
}
