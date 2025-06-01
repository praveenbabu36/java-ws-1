import java.util.stream.IntStream;

public class ImperativeVsDeclarative_Ex_1 {

    public static void main(String[] args) {

        /*
            Imperative vs Declarative
         */

        // Imperative
        int sum1 = 0;
        for(int i=0; i<=100; i++) {
            sum1 += i;
        }
        System.out.println("Imperative -> Sum: " + sum1);

        // Declarative
        int sum2 = IntStream.rangeClosed(0,100)
                    .parallel()
                    .sum();

        System.out.println("Declarative -> Sum: " + sum2);





    }


}