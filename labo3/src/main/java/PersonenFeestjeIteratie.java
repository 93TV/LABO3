import java.util.ArrayList;

/**
 * LABO3:PersonenFeestjeIteratie
 *
 * @author thibe
 * @version 12/10/2023
 */
public class PersonenFeestjeIteratie implements IPartyPlanner{

    @Override
    public ArrayList<ArrayList<String>> aanwezigen(int lengte, ArrayList<String> personen, ArrayList<ArrayList<String>> aanwezigenOpFeest) {
        boolean verwijderen = true;
        ArrayList<String> combo;
        for (int i = 0; i< Math.pow(2,lengte);i++) {
            combo = new ArrayList<String>();
            for (String persoon: personen) {
                combo.add(persoon);
            }
            aanwezigenOpFeest.add(combo);
        }
        return aanwezigenOpFeest;
    }
}
