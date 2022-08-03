
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeque {
			
				public static void main(String[] args)
				{
					
					Deque<Integer> de_que = new ArrayDeque<Integer>(10);
					de_que.add(8);
					de_que.add(99);
					de_que.add(31);
					de_que.add(79);
					de_que.add(18);

					
					for (Integer element : de_que) {
						
						System.out.println("Element : " + element);
					}

					
					de_que.clear();

				
					// addFirst() method
					de_que.addFirst(500);
					de_que.addFirst(300);

					// addLast() method
					de_que.addLast(1000);
					de_que.addLast(2000);

				
					System.out.println("Above elements are deleted");

					
					System.out.println("Elements of deque using Iterator :");
		 for (Iterator itr = de_que.iterator();
					itr.hasNext();) {
					System.out.println(itr.next());
				}

				// To reverse the deque order
				System.out.println("Elements of deque in reverse order :");

				for (Iterator dItr = de_que.descendingIterator();
					dItr.hasNext();) {
					System.out.println(dItr.next());
				}

				}
				
		}
