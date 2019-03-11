package rocks.zipcode.io.quiz3.arrays;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {


        Stream<Integer> squared = Stream.of(squaredValues);

        Arrays.stream(input).map(e->e*e);

//        boolean[] accumulator = new boolean[s.length];
//        IntStream.range(0, a.length)
//                .forEachOrdered(i -> accumulator[i] = a[i] == b[i]);
//
        return null;
    }
}
