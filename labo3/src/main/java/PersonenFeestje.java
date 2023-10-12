import java.util.ArrayList;

/**
 * LABO3:personenFeestje
 *
 * @author thibe
 * @version 12/10/2023
 */
public class PersonenFeestje {
    public String[] personen = {"Marie", "anne", "jan"};

    public ArrayList<ArrayList<String>> aanwezigen(int lengte, ArrayList<String> personen,ArrayList<ArrayList<String>> aanwezigenOpFeest) {
        if (lengte == 0) {
            System.out.println(personen);
            aanwezigenOpFeest.add(personen);
        } else {
            ArrayList<String> ar = (ArrayList) personen.clone();
            ar.remove(lengte - 1);

            aanwezigen(lengte - 1, ar,aanwezigenOpFeest);
            aanwezigen(lengte - 1, personen,aanwezigenOpFeest);
        }
        return aanwezigenOpFeest;
    }
//    public ArrayList<String> aanwezigen(int lengte, ArrayList<String> personen){
//        if(lengte < 1){
//            return personen;
//        }else {
//            ArrayList<String> ar = (ArrayList) personen.clone();
//            ar.remove(lengte-1);
//            return aanwezigen(lengte-1, ar);
//
//        }
//    }
}
