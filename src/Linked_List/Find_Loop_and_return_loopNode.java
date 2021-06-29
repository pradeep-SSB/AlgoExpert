import java.util.*;

class Program {
  public static LinkedList findLoop(LinkedList head) {
    // Write your code here.
		LinkedList tortoise = head.next;  //key : initilization
		LinkedList hare = head.next.next;
		while(tortoise != hare){          // detects loop
			tortoise = tortoise.next;
			hare = hare.next.next;
		}
		tortoise = head;
		while(tortoise != hare){	// mathematically returns the LoopNode 
			tortoise = tortoise.next;
			hare = hare.next;
		}
    return tortoise;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
