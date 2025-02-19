package Model;
import java.util.ArrayList;
import java.util.List;

public class CowDatabase {
    private List<Cow> cows;

    public CowDatabase() {
        cows = new ArrayList<>();
        loadSampleData();
    }

    private void loadSampleData() {
        cows.add(new Cow("10000506", "white", 5, 6));
        cows.add(new Cow("10000304", "white", 3, 4));
        cows.add(new Cow("10000208", "white", 2, 8));

        cows.add(new Cow("20000408", "pink", 4, 8));
        cows.add(new Cow("20000703", "pink", 7, 3));
        cows.add(new Cow("20000209", "pink", 2, 9));

        cows.add(new Cow("30000601", "brown", 6, 1));
        cows.add(new Cow("30000202", "brown", 2, 2));
        cows.add(new Cow("30000101", "brown", 1, 1));

        cows.add(new Cow("30000208", "brown", 2, 8));
        cows.add(new Cow("30000503", "brown", 5, 3));
        cows.add(new Cow("30000207", "brown", 2, 7));

        cows.add(new Cow("20000908", "pink", 9, 8));
        cows.add(new Cow("20000103", "pink", 1, 3));
        cows.add(new Cow("20000809", "pink", 8, 9));
        
    }

    public Cow getCowById(String id) {
        for (Cow cow : cows) {
            if (cow.getId().equals(id)) {
                return cow;
            }
        }
        return null;
    }
}
