public class Fibonacci {
public int calculate (int index){
     if (index < 0) {
         throw new IllegalArgumentException("Fibonacci indexes are defined only on non-negative integers.");
    }

    if (index == 0 || index == 1){
        return 1;
    }
    return calculate(index-1)+ calculate(index -2);
        //add previous two numbers
}
}
