import java.util.ArrayList;

/**
 * LABO3:personenFeestje
 *
 * @author thibe
 * @version 12/10/2023
 */
public class PersonenFeestje implements IPartyPlanner{
    public String[] personen = {"Marie", "anne", "jan"};

    public ArrayList<ArrayList<String>> aanwezigen(int lengte, ArrayList<String> personen,ArrayList<ArrayList<String>> aanwezigenOpFeest) {
        if (lengte == 0) {
//            System.out.println(personen);
            System.out.println("combinatie gevonden: " + personen + "\n");
            aanwezigenOpFeest.add(personen);
        } else {
            System.out.println("beschikbare personen: " + personen);
            ArrayList<String> ar = (ArrayList) personen.clone();
            ar.remove(lengte - 1);
            System.out.println("genodigden " + personen.get(lengte-1) + " komt niet");

            aanwezigen(lengte - 1, ar,aanwezigenOpFeest);
            System.out.println("genodigden " + personen.get(lengte-1) + " komt");

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
