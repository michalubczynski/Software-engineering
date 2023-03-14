package QuadricEquation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolverTest {

    @Test
    public void correctFor2x() {
        Solver solver = new Solver(1,4,3);
        double[] result = solver.solve();
        assertEquals(2,result.length);
        assertEquals(-3,result[0],0.000001);
        assertEquals(-1,result[1],0.000001);
    }
    @Test
    public void correctFor1x() {
        Solver solver = new Solver(1,2,1);
        double[] result = solver.solve();
        assertEquals(1,result.length);
        assertEquals(-1,result[0],0.000001);
    }
    @Test
    public void correctFor0x() {
        Solver solver = new Solver(1,2,3);
        double[] result = solver.solve();
        assertEquals(null,result);

    }
}