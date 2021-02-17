package Day1;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		int arr[]=new int[] {21,33,43,21,56,76,98,25};
		int n=arr.length;
		int x=21;
		Arrays.sort(arr);
		if(binarySearch(arr,0,n,x)==-1)
		{
			System.out.println(" Element is not found");
			
		}
		else
			System.out.println(" Element is found at "+binarySearch(arr,0,n,x));
		
	}
	
	static int binarySearch(int [] arr,int low,int high,int data)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			
			if(arr[mid]==data)
				return mid;
			
			if(arr[mid]>data)
				return binarySearch(arr,low,mid-1,data);
			
			else if(arr[mid]<data)
				return binarySearch(arr,mid+1,high,data);
		}
		
		return -1;
	}

}
