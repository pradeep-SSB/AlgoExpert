// Remove Duplicates where values are already sorted.
// O(N) && S(1)

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
		LinkedList CurrentNode = linkedList;
			while(CurrentNode != null){
				LinkedList NextDistinctNode =  CurrentNode;
					while(NextDistinctNode != null && NextDistinctNode.value == CurrentNode.value){
						NextDistinctNode = NextDistinctNode.next;
					}
				CurrentNode.next = NextDistinctNode;
				CurrentNode = NextDistinctNode;
			}
    return linkedList;
  }
