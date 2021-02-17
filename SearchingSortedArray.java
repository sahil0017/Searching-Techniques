package Day1;

import java.util.Arrays;

public class SearchingSortedArray {

	public static void main(String[] args) {
		int arr[]=new int[] {21,54,98,33,56,23};
		int key=33;
		Arrays.sort(arr);      // 21,23,33,54,56,98
		search(arr,key);

	}
	static void search(int [] arr,int data)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
			{
				System.out.print(" Array is found at index "+ i);
			}
			else if(arr[i]>data)
				return;
		}
		
		return;
	}


}
