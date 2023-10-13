package onboarding.problem1;

import java.util.Random;

public class PageNumberGenerator {

    Random random = new Random();

    public int getPage() {
        return random.nextInt(pageMaxMin.MAX) + pageMaxMin.MIN;
    }

    enum pageMaxMin {
        VALUES;
        private static final int MAX = 399;
        private static final int MIN = 1;
    }
}
