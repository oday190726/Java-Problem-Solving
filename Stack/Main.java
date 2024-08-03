

public class Main {
    public static void main(String[] args) {

        StackClass<Integer> cars = new StackClass<Integer>();
        cars.push(1);
        cars.push(2);
        cars.push(3);
        cars.push(4);
        cars.push(5);
        
      // System.out.println( cars.peek());
       System.out.println(cars.search(5));

        
       
    }
}
