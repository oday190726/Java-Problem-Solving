import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;


public class StackClass<E> implements Stackble<E> {

  private  Deque<E> deque =new ArrayDeque<>();

    @Override
    public E pop() {
        if(isEmpty()){

            throw new EmptyStackException();
        }
       return deque.pop();
    }

    @Override
    public void push(E e) {
        deque.push(e);;
    }

    @Override
    public E peek() {
        if(isEmpty())
        throw new EmptyStackException();
        return deque.peek();
    }

    @Override
    public boolean isEmpty() {
       return deque.isEmpty();
    }

    @Override
    public int search(E e) {
        int index = 1; // Index from the bottom
        int size = deque.size(); // Total number of elements in the stack
        
        for (E element : deque) {
            if (element.equals(e)) {
                return size - index; // Position from the top
            }
            index++;
        }
        
        return -1; // Element not found
    }
    
    

}
