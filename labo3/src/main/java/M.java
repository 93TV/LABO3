import java.util.ArrayList;
import java.util.List;

/**
 * LABO3-RECURSIE : M
 *
 * @author viaen
 * @version 12/10/2023
 */
public class M {
    static int som = 0;
    public static boolean m(int M, int[] numbers, List<Integer> currentSubset, int currentIndex) {
        if (M == 0) {
            return true;
        } else if (M < 0 || currentIndex == numbers.length) {
            return false;
        } else {
            List<Integer> newSubset = new ArrayList<>(currentSubset);
            newSubset.add(numbers[currentIndex]);
            boolean withCurrent = m(M - numbers[currentIndex], numbers, newSubset, currentIndex + 1);
            boolean withoutCurrent = m(M, numbers, currentSubset, currentIndex + 1);
            return withCurrent || withoutCurrent;
        }
    }

    public static void main(String[] args) {

    }
}
