package Day1;

public class SearchingUnsortedArray {

	public static void main(String[] args) {
		int arr[]=new int[] {21,54,98,33,56,23};
		int key=23;
		linearSearch(arr,key);
	}
	
	static void linearSearch(int[] arr,int data)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
			{
				System.out.println(" data is found at index "+i);
			}
		}
		
		return;
	}

}
