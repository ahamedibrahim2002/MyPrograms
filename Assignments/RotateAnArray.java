import java.util.Arrays;
public class RotateAnArray{
	public static void main(String[] args) {
		
		int[] arr={4,5,6};
		int k=2;
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-k-1);
		reverse(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
 	}
 	static void reverse(int[] arr,int start,int end){

 		while(start < end){
 			int temp=arr[start];
 			arr[start]=arr[end];
 			arr[end]=temp;
 			start++;
 			end--;
 		}
 	}
}