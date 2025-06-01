import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative_Ex_2 {

    public static void main(String[] args) {

        /*
            Imperative Vs Declarative
            -------------------------

            Remove duplicates from a list
         */

        // Imperative Style

        List<Integer> inpList = Arrays.asList(1, 2, 2, 3, 5, 6, 7, 6, 10);
        List<Integer> outList = new ArrayList<Integer>();

        System.out.println("Input List: " + inpList);

        for(Integer elem:inpList) {
            if( !outList.contains(elem) )
                outList.add(elem);
        }

        System.out.println("Imperative  - Unique List: " + outList);


        // Declarative Style
        outList = inpList.stream()
                            .distinct()
                            .collect(Collectors.toList());

        System.out.println("Declarative - Unique List: " + outList);


    }

}