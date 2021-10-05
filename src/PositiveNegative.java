import java.util.concurrent.ThreadLocalRandom;

public class PositiveNegative {
    static int number;
    public static void main(String[] argv){
        do {
            number = ThreadLocalRandom.current().nextInt(-4,4);
            System.out.println(number);
        } while(number !=0);
    }

}
