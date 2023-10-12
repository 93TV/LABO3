import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LABO3:test
 *
 * @author thibe
 * @version 12/10/2023
 */
public class test {
    public personenFeestje feestje ;

    public String[] personen = {"Marie", "anne", "jan"};
    @BeforeEach
    public void init(){
        feestje = new personenFeestje();
    }

    @Test
    public void niemandKomt(){

        assertEquals(0,personen.length);
    }
    @Test
    public void marieKomt(){
        assertEquals("Marie",personen[0]);
    }

}
