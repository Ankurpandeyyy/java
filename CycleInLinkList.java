package LinkedList;

public class CycleInLinkList
{
	public static class Node
	{
		int data;
		Node next ;
		Node(int data)
		{
			this.data = data ;
		}
	}
	public static boolean cycleFind(Node head) //Q = To determine it is a cycleList or not
	{
		Node slow = head;
		Node fast = head;
		if(head.next ==null)
			return false;
		while(fast!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
	}
	public static int cycleFindndReturn(Node head)  // to find where cycle starts to repeat
	{
		Node slow = head;
		Node fast = head;
		
		if(head.next ==null)
			return -1;
		while(fast!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow == fast)
				break;
		}
		Node tmp = head;
		while(slow!=tmp)
		{
			tmp=tmp.next;
			slow=slow.next;
		}
		return slow.data;
	}

	public static void main(String[] args)
	{
		Node a = new Node(5);
		Node b = new Node(6);
		Node c = new Node(7);
		Node d = new Node(8);
		
		a.next = b ;
		b.next = c ;
		c.next = d ;
		d.next = b ;
		
		CycleInLinkList q = new CycleInLinkList();
		//System.out.println(q.cycleFind(a));
		System.out.println(cycleFindndReturn(a));
	}

}
