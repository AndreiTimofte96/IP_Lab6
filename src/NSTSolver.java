public class NSTSolver implements ISolver {
    private static NSTSolver nstSolver = new NSTSolver();

    private NSTSolver(){

    }

    @Override
    public void solve(List<Constraint> constraints) {
        this.solution = new Solution();
    }
}
