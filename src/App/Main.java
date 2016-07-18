package App;
import Model.*;
import Controller.*;
/**
 * Created by rares on 28.02.2016.
 */

/**
 * Main class where the Problem is created and then solved
 */
public class Main {
    public static void main(String args[]) {
        Problem problem = new Problem();
        System.out.println(problem.toString());
        RandomMatchingSolver randomMatchingSolver = new RandomMatchingSolver(problem);
        randomMatchingSolver.execute();
        problem.initialize();
        StableMatchingSolver stableMatchingSolver = new StableMatchingSolver(problem);
        stableMatchingSolver.execute();
    }
}
