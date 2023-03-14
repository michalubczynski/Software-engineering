package QuadricEquation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SolverNoResultTest {

        @Test
    public void correctFor0x() {
        Solver solver = new Solver(1,2,3);
        double[] result = solver.solve();
        assertEquals(null,result);

    }



}//Done by Michael L