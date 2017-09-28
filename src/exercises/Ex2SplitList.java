package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * Partition a List into a number of List's
 *
 * NOTE: All references may be shared
 *
 * HINT: Try to use existing methods
 */
public class Ex2SplitList {

    // Collection of utilities to use in dice wars lab
    public static void main(String[] args) {
        new Ex2SplitList().program();
    }

    void program() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        List<Integer> ints2 = new ArrayList(ints);
        Integer[] iii = ints.toArray(new Integer[]{});

        /*
        List<List<Integer>> ps = partition(ints, 2);
        out.println(ps.get(0).toString().equals("[1, 2]"));
        out.println(ps.get(1).toString().equals("[3, 4]"));

        ints = Arrays.asList(1, 2, 3, 4, 5);
        ps = partition(ints, 2);
        out.println(ps.get(0).toString().equals("[1, 2]"));
        out.println(ps.get(1).toString().equals("[3, 4, 5]"));

        ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        ps = partition(ints, 3);
        out.println(ps.get(0).toString().equals("[1, 2]"));
        out.println(ps.get(1).toString().equals("[3, 4]"));
        out.println(ps.get(2).toString().equals("[5, 6, 7]"));
        */
        out.println();

    }

}
