
/*
Priority Queue
add() O(log n)
remove() O(log n)
peek O(1)
*/
import java.util.Comparator;
import java.util.PriorityQueue;

class Main {
  public static void main(String[] args) {
    // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    // PriorityQueue<Integer> pq = new
    // PriorityQueue<Integer>(Comparator.reverseOrder());
    PriorityQueue<Compare.Student> pq = new PriorityQueue<Compare.Student>();
    pq.add(new Compare.Student("Alice", 90));
    pq.add(new Compare.Student("Bob", 80));
    pq.add(new Compare.Student("Charlie", 70));
    pq.add(new Compare.Student("Dave", 60));
    pq.add(new Compare.Student("Eve", 50));
    /*
     * pq.add(4);
     * pq.add(3);
     * pq.add(1);
     * pq.add(2);
     */
    while (!pq.isEmpty()) {
      System.out.println(pq.peek().name + " - " + pq.peek().rank);
      pq.remove();
    }

  }

}