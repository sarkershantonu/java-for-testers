import org.junit.Test;

public class SolutionTest {

    @Test
    public void testOne(){
        Solution solutionOne =  new Solution("The way user experience and clues work will be" +
                " re-used from previous code. Parts leading up to that will be redone for this release - Landing " +
                "page for online test (more than an hour before start of test it shows “please come back” - if they " +
                "come within the hour they can log in for the test. Can wait there until 10 minutes before test starts. Can then bring up test window.");
        System.out.println("Total Word = " + solutionOne.howManyWords());
        System.out.println("Total Verbs = " + solutionOne.howManyVerbs());
        System.out.println("The Word \"The\" = " + solutionOne.howManyWords("The"));


    }
}
