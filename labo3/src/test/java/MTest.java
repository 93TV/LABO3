import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LABO3-RECURSIE : MTest
 *
 * @author viaen
 * @version 12/10/2023
 */
class MTest {

    @ParameterizedTest
    @CsvSource({
            "4 5 3 8 2 9,true, 15",
            "12 10 2 7 4,true,11",
            "15 12 3 8 7,false,9",
            "15 12 3 7 7,true,12",
            "4 7 1 8 17 1 8,true,10",
            "3 7 21 21 41 18 9 22 32 8 17 24 34, true, 37",

    })
    public void testM(String lijst, boolean expected, int controleGetal) {

        String[] getallenString = (lijst.split(" "));
        int[] getallen = new int[getallenString.length];
        int i = 0;
        for (String str : getallenString){
            getallen[i] = Integer.parseInt(str);
            i++;
        }
        boolean result = M.m(controleGetal, getallen,  new ArrayList<>(), 0);
        assertEquals(result, expected);
    }

}