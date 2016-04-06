class ListNode{
	int val;
	ListNode next;
	public ListNode(int x){
		this.val=x;
	}
}
public class Solution{
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode pt1=l1;
		ListNode pt2=l2;
		ListNode dummyHead=new ListNode(0);
		ListNode curr=dummyHead;
		int carry=0;
		
		while(pt1!=null||pt2!=null){
			int digit=0;
			if(pt1!=null){
				digit+=pt1.val;
				pt1=pt1.next;
			}
			if(pt2!=null){
				digit+=pt2.val;
				pt2=pt2.next;
			}
			curr.next=new ListNode((digit+carry)%10);
			curr=curr.next;
			carry=(digit+carry)/10;
		}		
		if(carry!=0){
			curr.next=new ListNode(carry);
		}
		
		return dummyHead.next;
	}
}
