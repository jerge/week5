package exercises;

import java.util.*;

import static java.lang.System.out;

/*

   Using Steinhaus–Johnson–Trotter permutation algorithm iteratively
   See https://en.wikipedia.org/wiki/Steinhaus%E2%80%93Johnson%E2%80%93Trotter_algorithm
 */
public class Ex4Permutations {
    Random rand = new Random();
    public static void main(String[] args) {
        new Ex4Permutations().program();
    }

    void program() {
//         Imperative permutation
         List<String> perms = permutationSJT("12345");
         out.println(perms.size() == 120);
         out.println(sampleCheck(perms));
    }

    // Some sampling to check there's only one of each (should only be one)
    boolean sampleCheck(List<String> perms) {
        // Remove some
        perms.removeAll(Arrays.asList(new String[]{"12345", "32415", "52431", "35142"}));
        // Shouldn't find them
        return perms.indexOf("12345") < 0 && perms.indexOf("32415") < 0
                && perms.indexOf("32415") < 0 && perms.indexOf("35142") < 0;
    }

    // -------------- Methods  ------------------------

    List<String> permutationSJT(String expr){
        List<String> uniques = new ArrayList<>();
        String current = expr;
        while (uniques.contains(current) && )
    }
}