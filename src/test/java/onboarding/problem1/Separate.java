package onboarding.problem1;

import java.util.List;

public class Separate {

    void separate(List<Integer> pobi, List<Integer> crong, List<Integer> separatedPobiLeft,
                  List<Integer> separatedPobiLight, List<Integer> separatedCrongLeft, List<Integer> separatedCrongLight){
        procedureForSeparate(pobi.get(0), separatedPobiLeft);
        procedureForSeparate(pobi.get(1), separatedPobiLight);
        procedureForSeparate(crong.get(0), separatedCrongLeft);
        procedureForSeparate(crong.get(1), separatedCrongLight);
    }

    private void procedureForSeparate(int num, List<Integer> pobiOrCrong){
        while(num > 0){
            pobiOrCrong.add(num % 10);
            num /= 10;
        }
    }
}
