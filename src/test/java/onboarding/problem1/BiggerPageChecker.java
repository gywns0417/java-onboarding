package onboarding.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiggerPageChecker {
    private final List<Integer> pobi;
    private final List<Integer> crong;
    private final List<Integer> seperatedPobiLeft = new ArrayList<>();
    private final List<Integer> seperatedPobiLight = new ArrayList<>();
    private final List<Integer> seperatedCrongLeft = new ArrayList<>();
    private final List<Integer> seperatedCrongLight = new ArrayList<>();
    private int pobiResult;
    private int crongResult;

    Separate separate = new Separate();

    Calculator cal = new Calculator();


    public BiggerPageChecker(List<Integer> pobi, List<Integer> crong){
        this.pobi = pobi;
        this.crong = crong;
        checkBigger();
    }

    public void checkBigger(){
        separate.separate(pobi, crong, seperatedPobiLeft, seperatedPobiLight, seperatedCrongLeft, seperatedCrongLight);

        int[] pobiResultArr = {plusOrMulti((seperatedPobiLeft),Operator.PLUS),
                plusOrMulti((seperatedPobiLight),Operator.PLUS),
                plusOrMulti((seperatedPobiLeft), Operator.MULTI),
                plusOrMulti((seperatedPobiLight), Operator.MULTI)};

        int[] crongResultArr = {plusOrMulti((seperatedCrongLeft),Operator.PLUS),
                plusOrMulti((seperatedCrongLight),Operator.PLUS),
                plusOrMulti((seperatedCrongLeft), Operator.MULTI),
                plusOrMulti((seperatedCrongLight), Operator.MULTI)};

        pobiResult = Arrays.stream(pobiResultArr).max().getAsInt();
        crongResult = Arrays.stream(crongResultArr).max().getAsInt();

    }

    private int plusOrMulti(List<Integer> givenList, Operator operator){
        if(operator.equals(Operator.PLUS)){
            return cal.plus(givenList);
        }
        else if(operator.equals(Operator.MULTI)){
            return cal.multi(givenList);
        }
        return -1;
    }

    public int getPobiResult() {
        return pobiResult;
    }

    public int getCrongResult() {
        return crongResult;
    }
}
