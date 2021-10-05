import java.util.concurrent.ThreadLocalRandom;

public class PositiveNegative2 {
        static int number;
        public static void main(String[] argv){
            number = ThreadLocalRandom.current().nextInt(-4,4);
            while(number !=0) {

                number = ThreadLocalRandom.current().nextInt(-4,4);
                System.out.println(number);


            }
        }

    }
