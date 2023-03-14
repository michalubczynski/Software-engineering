package QuadricEquation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SolverExceptionTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test (expected = IllegalArgumentException.class) //.class is a singleton which identify the same scheme as one of ours instation
    public void correctForExceptionOfA() {
        Solver solver = new Solver(0,4,3);
        double[] result = solver.solve();
    }
    @Test
    public void correctForThrowException() {
        expectedException.expectMessage("kwadratowe");
        Solver solver = new Solver(0,4,3);
        double[] result = solver.solve();
    }
    @Test
    public void correctForThrowExceptionSimpleFunction() {
        expectedException.expectMessage("simpleFunction"); // message in argument exception must contains string simpleFunction
        Solver solver = new Solver(-1,4,3);
        double result = solver.simpleFunction();
    }
}//Done by Michael L