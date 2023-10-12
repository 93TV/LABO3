import java.util.ArrayList;
import java.util.List;

/**
 * LABO3-RECURSIE : M
 *
 * @author viaen
 * @version 12/10/2023
 */
public class Sommeren {
    static int som = 0;
    public static boolean vindSomSet(int controleGetal, int[] getallen, List<Integer> subset, int index) {
        if (controleGetal == 0) {
            System.out.println("Oplossing:" + subset);
            return true;
        } else if (controleGetal < 0 || index == getallen.length) {
            System.out.println("kéér e ké wére");
            return false;
        } else {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(getallen[index]);
            System.out.println(newSubset);
            return vindSomSet(controleGetal - getallen[index], getallen, newSubset, index + 1) ||
            vindSomSet(controleGetal, getallen, subset, index + 1);
        }
    }
}
