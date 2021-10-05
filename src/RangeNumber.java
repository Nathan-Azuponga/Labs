import java.util.concurrent.ThreadLocalRandom;

public class RangeNumber {

    public static void main(String[] args){
        RangeNumber generate = new RangeNumber();
        generate.number((int) (Math.random() * 100) + 1);

    }
    public void number(int n){
       int b= ThreadLocalRandom.current().nextInt(1,n);

        System.out.println("the random integer generated is " + n);
        System.out.println("The integer returned between 1 and " + n + " is " + b);
    }

}
