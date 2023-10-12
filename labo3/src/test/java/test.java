import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LABO3:test
 *
 * @author thibe
 * @version 12/10/2023
 */
public class test {
    public PersonenFeestje feestje;
    public ArrayList<String> personen = new ArrayList<>();

    @BeforeEach
    public void init() {
        feestje = new PersonenFeestje();
        personen.add("Marie");
        personen.add("anne");
        personen.add("jan");
    }

    @Test
    public void aantalKomt() {
        ArrayList<ArrayList<String>> aanwezigenOpFeest = new ArrayList<>();
        feestje.aanwezigen(personen.size(), personen, aanwezigenOpFeest);
        assertAll(
                () -> assertEquals(0, aanwezigenOpFeest.get(0).size()),
                () -> assertEquals(1, aanwezigenOpFeest.get(1).size()),
                () -> assertEquals(2, aanwezigenOpFeest.get(3).size()),
                () -> assertEquals(3, aanwezigenOpFeest.get(7).size())

        );
    }

    @Test
    public void wieKomt() {
        ArrayList<ArrayList<String>> aanwezigenOpFeest = new ArrayList<>();
        feestje.aanwezigen(personen.size(), personen, aanwezigenOpFeest);

        ArrayList<String> marie = new ArrayList<>();
        marie.add(personen.get(0));

        ArrayList<String> anne = new ArrayList<>();
        anne.add(personen.get(1));

        ArrayList<String> jan = new ArrayList<>();
        jan.add(personen.get(2));

        ArrayList<String> marieanne = new ArrayList<>();
        marieanne.add(personen.get(0));
        marieanne.add(personen.get(1));

        ArrayList<String> mariejan = new ArrayList<>();
        mariejan.add(personen.get(0));
        mariejan.add(personen.get(2));

        ArrayList<String> annejan = new ArrayList<>();
        annejan.add(personen.get(1));
        annejan.add(personen.get(2));


        assertAll(
                () -> assertEquals(new ArrayList<String>() , aanwezigenOpFeest.get(0)),
                () -> assertEquals(marie, aanwezigenOpFeest.get(1)),
                () -> assertEquals(anne, aanwezigenOpFeest.get(2)),
                () -> assertEquals(jan, aanwezigenOpFeest.get(4)),
                () -> assertEquals(marieanne, aanwezigenOpFeest.get(3)),
                () -> assertEquals(mariejan, aanwezigenOpFeest.get(5)),
                () -> assertEquals(annejan, aanwezigenOpFeest.get(6)),
                () -> assertEquals(personen, aanwezigenOpFeest.get(7))
        );
    }
}
