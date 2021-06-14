public static void removeKthNodeFromEnd(LinkedList head, int k) {
    // Write your code here.
		LinkedList First = head;
		LinkedList Second = head;
		int Counter = 1;			// counter = 1 not counter 1 != 0, In linkedList
		while(Counter <= k){
			Second = Second.next;
			Counter++;			
		}
		if(Second == null){
			head.value = head.next.value;
			head.next = head.next.next;
			return;
		}
		while(Second.next != null){
			Second = Second.next;
			First = First.next;
		}
		First.next = First.next.next;
		return;
  }
