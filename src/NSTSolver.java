import java.util.*;

public class NSTSolver extends ISolver {
    private static NSTSolver nstSolver = new NSTSolver();

    private NSTSolver(){

    }

    @Override
    public void solve(List<Constraint> constraints) {
        solution = new Solution();
    }
}
