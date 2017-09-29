package exercises;

import java.util.*;
import java.util.List;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * Using a Map to group Positions into rows so
 * that we easily, given a row (int), can find all Positions for that row
 *
 * See:
 * - UseAMap
 */
public class Ex3Grouping {

    public static void main(String[] args) {
        new Ex3Grouping().program();
    }

    private void program() {
        List<Position> ps = generatePositions();
        out.println(ps);

        // Method will group all Positions into list depending on row values
        // I.e. all Positions with row = 2 in same list, etc.
        // Row is the key and the list containing all pair with row = 2 is the value
        Map<Integer, List<Position>> rowPositions = groupByRowValue(ps);

        // Checking
        boolean b = true;
        for( Position p : rowPositions.get(0)){  // Get all with row 0
            b = b && (p.row == 0);   // Testing
        }

//        out.println(rowPositions);

        out.println(b);
        b = true;
        for( Position p : rowPositions.get(2)){ // Get all with row 2
            b = b && (p.row == 2);
        }
        out.println(b);

    }

    class Position {
        int row;
        int col;
        public String toString(){   // More on this when using classes
            return "(" + row + "," + col + ")";   // Get a nice printout (method called by println(ps)).
        }
    }

    // -------- Methods --------------------
    Map<Integer, List<Position>> groupByRowValue(List<Position> list){
        List<Integer> usedKeys = new ArrayList<>();
        Map<Integer, List<Position>> karta = new HashMap<>();
        for (int base = 0; base < list.size(); base++) {
            if(usedKeys.contains(list.get(base).row)) {
                continue;
            }
            List<Position> currentKey = new ArrayList<>();
            currentKey.add(list.get(base));
            for (int top = base+1; top < list.size(); top++) {
                if (list.get(base).row == list.get(top).row && list.get(base) != list.get(top)) {
                    currentKey.add(list.get(top));
                }
            }
            out.println(currentKey);
            karta.put(list.get(base).row,currentKey);
            usedKeys.add(list.get(base).row);
        }
        return karta;
    }

    private boolean isUsed(Position key, List<Integer> list) {
        return list.contains(key.row);
    }





    // Utility method, some "random" Points
    // (0,-3), (0, -2) ... (0, 2)
    // (1,-3), (1, -2) ... (1, 2)
    // ...
    List<Position> generatePositions() {
        List<Position> ps = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = -3; j < 2; j++) {
                Position p = new Position();
                p.row = i;
                p.col = j;
                ps.add(p);
            }
        }
        return ps;
    }

}
