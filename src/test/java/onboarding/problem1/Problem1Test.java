package onboarding.problem1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Problem1Test {

    // 공통 코드 분리 필요
    @Test
    void pobiWins(){

        PobiCrongGenerator pobiCrongGenerator = new PobiCrongGenerator();

        BiggerPageChecker checker = new BiggerPageChecker(pobiCrongGenerator.getPobi(), pobiCrongGenerator.getCrong());
        WinnerDecider decider = new WinnerDecider();

        int result = 1;
        assertThat(decider.decideWinner(checker.getPobiResult(), checker.getCrongResult())).isEqualTo(result);
    }

    @Test
    void tie(){
        List<Integer> pobi = List.of(10, 11);
        List<Integer> crong = List.of(1, 2);
        BiggerPageChecker checker = new BiggerPageChecker(pobi, crong);
        WinnerDecider decider = new WinnerDecider();

        int result = 0;
        assertThat(decider.decideWinner(checker.getPobiResult(), checker.getCrongResult())).isEqualTo(result);
    }

    @Test
    void CrongWins(){
        List<Integer> pobi = List.of(34, 35);
        List<Integer> crong = List.of(67, 68);
        BiggerPageChecker checker = new BiggerPageChecker(pobi, crong);
        WinnerDecider decider = new WinnerDecider();

        int result = 2;
        assertThat(decider.decideWinner(checker.getPobiResult(), checker.getCrongResult())).isEqualTo(result);
    }
}
