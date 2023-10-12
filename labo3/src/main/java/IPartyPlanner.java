import java.util.ArrayList;

/**
 * LABO3 : IPartyPlanner
 *
 * @author frede
 * @version 10/12/2023
 */
public interface IPartyPlanner {
    public ArrayList<ArrayList<String>> aanwezigen
            (int lengte, ArrayList<String> personen, ArrayList<ArrayList<String>> aanwezigenOpFeest);
}
