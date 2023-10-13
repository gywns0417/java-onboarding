package onboarding.problem1;

public class WinnerDecider {
    public int decideWinner(int pobiResult, int crongResult){
        //System.out.println("포비 : " + pobiResult);
        //System.out.println("크롱 : " + crongResult);
        try {
            if (pobiResult > crongResult) return 1;
            else if (pobiResult < crongResult) return 2;
            return 0;

        } catch (Exception e){
            return -1;
        }
    }
}
