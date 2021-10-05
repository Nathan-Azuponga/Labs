public class random {
    public static void main(String[] argv) {
        double rand = (int) (Math.random() * 100) + 1;
        if (rand % 2 == 0 || rand == 1) {
            System.out.println("The number is even");
            System.out.println("0");
        } else {
            System.out.println("The number is Odd");
            if (rand == 0) {
                System.out.println("Frozen");

            } else if (rand >= 1 && rand <= 14) {
                System.out.println(rand);
                System.out.println("Cold");
            } else if (rand >= 15 && rand <= 24) {
                System.out.println(rand);
                System.out.println("Cool");
            } else if (rand >= 25 && rand <= 40) {
                System.out.println(rand);
                System.out.println("Warm");
            } else if (rand >= 41 && rand <= 60) {
                System.out.println(rand);
                System.out.println("Very hot");
            }else if (rand>=81 && rand<=99) {
                System.out.println(rand);
                System.out.println("Cool");
            }else{
                System.out.println(rand);
                System.out.println("Boiling");
            }
        }
    }
}