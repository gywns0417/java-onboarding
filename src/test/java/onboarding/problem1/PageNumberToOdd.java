package onboarding.problem1;

public class PageNumberToOdd {

    PageNumberGenerator pageNumberGenerator = new PageNumberGenerator();

    int getPage(){
        int page = pageNumberGenerator.getPage();
        if(page % 2 == 0){
            return page - 1;
        }
        return page;
    }
}
