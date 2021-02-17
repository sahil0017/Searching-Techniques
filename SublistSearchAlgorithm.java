package Day1;

public class SublistSearchAlgorithm {
	
	static class Node
	{
		int data;
		Node next;

	};
	
	static Node newNode(int data)
	{
		 Node temp=new Node();
		 temp.data=data;
		 temp.next=null;
		 
		 return temp;
	}
	
	static boolean findList(Node a,Node b)
	{
		Node ptr1=a;
		Node ptr2=b;
		if(a==null&&b==null)
			return true;
		
		if(a==null||a!=null&&b==null)
			return false;
		
		while(b!=null)
		{
			ptr2=b;
			
			while(ptr1!=null)
			{
				if(ptr2==null)
					return false;
				
				else if(ptr1.data==ptr2.data)
				{
					ptr1=ptr1.next;
					ptr2=ptr2.next;
				}
				
				else break;
			}
				
		    if(ptr1==null)
				return true;
				
			ptr1=a;
			
			b=b.next;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		Node first= newNode(2);
		first.next=newNode(3);
		first.next.next=newNode(4);
		first.next.next.next=newNode(5);
		
		Node second= newNode(2);
		second.next=newNode(3);
		second.next.next=newNode(4);
		second.next.next.next=newNode(5);
		second.next.next.next.next=newNode(7);
		
		if(findList(first,second))
			System.out.println("List found ");
		else
			System.out.println("List not found");

		

	}

}
