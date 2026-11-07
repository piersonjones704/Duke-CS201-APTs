import java.util.*;

public class MedalTable {
    public String[] generate(String[] results) {
        HashMap<String, List<Integer>> map = new HashMap<>(); 
        for (String s : results) {
            String[] countries = s.split("\\s+");
            for (int ind = 0; ind < countries.length; ind++) {
                String country = countries[ind];
                List<Integer> medals = map.computeIfAbsent(country, k -> new ArrayList<>(Arrays.asList(0,0,0)));
                medals.set(ind, medals.get(ind) + 1);
            }
        }
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b)-> {List<Integer> ma = map.get(a); 
            List<Integer> mb = map.get(b);
            if (!ma.get(0).equals(mb.get(0))) {
                return Integer.compare(mb.get(0), ma.get(0));
            }
            else if (!ma.get(1).equals(mb.get(1))) {
                return Integer.compare(mb.get(1), ma.get(1));
            }
            else if (!ma.get(2).equals(mb.get(2))) {
                return Integer.compare(mb.get(2), ma.get(2));
            }
            else {
                return a.compareTo(b);
            }
        });
        String[] ret = new String[keys.size()];
        for (int z = 0; z < keys.size(); z++) {
            String key = keys.get(z);
            int numGolds = map.get(key).get(0);
            int numSilvers = map.get(key).get(1);
            int numBronzes = map.get(key).get(2);
            ret[z] = (key + " " + numGolds + " " + numSilvers + " " + numBronzes);
        }
        return ret;
    }
}