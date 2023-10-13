package onboarding.problem1;

import java.util.ArrayList;
import java.util.List;

public class PobiCrongGenerator {

    PageNumberToOdd pageNumberToOdd = new PageNumberToOdd();


    public List<Integer> getPobi() {
        int page = pageNumberToOdd.getPage();
        List<Integer> pobi = new ArrayList<>();
        pobi.add(page);
        pobi.add(page + 1);
        return pobi;
    }

    public List<Integer> getCrong() {
        int page = pageNumberToOdd.getPage();
        List<Integer> crong = new ArrayList<>();
        crong.add(page);
        crong.add(page + 1);
        return crong;
    }
}
