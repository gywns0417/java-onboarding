package onboarding.problem1;

import java.util.List;

public class Calculator {
    int plus(List<Integer> separated){
        int sum = 0;
        for(int num : separated){
            sum += num;
        }
        return sum;
    }

    int multi(List<Integer> separated){
        int sum = 1;
        for(int num : separated){
            sum *= num;
        }
        return sum;
    }
}
