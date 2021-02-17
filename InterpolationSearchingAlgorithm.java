package Day1;

import java.util.Arrays;

public class InterpolationSearchingAlgorithm {

	public static void main(String[] args) {
		int []arr=new int [] {21,43,22,31,1,33,121,31,54,536};
		int x=1;
		Arrays.sort(arr);
		int index=interpolation(arr,0,arr.length-1,x);
		
		if(index!=-1)
			System.out.println("index is found at "+index);
		else
			System.out.println("No element is there");

	}
	
	static int interpolation(int [] arr,int low,int high,int data)
	{
		int pos;
		
		if(low<=high&& data>=arr[low] && data<=arr[high])
		{
			pos=low+ (((high-low)/(arr[high]-arr[low]))*(data-arr[low]));
			
			if(arr[pos]==data)
				return pos;
			
			if(arr[pos]<data)
				return interpolation(arr,pos+1,high,data);
			
			else if(arr[pos]>data)
				return interpolation(arr,low,pos-1,data);
		}	
		
		return -1;
		
	}

}
