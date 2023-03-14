package QuadricEquation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SolverTwoResultsTest {

    @Test
    public void correctFor2x() {
        Solver solver = new Solver(1,4,3);
        double[] result = solver.solve();
        assertEquals(2,result.length);
        assertEquals(-3,result[0],0.000001);
        assertEquals(-1,result[1],0.000001);
    }

}//Done by Michael L