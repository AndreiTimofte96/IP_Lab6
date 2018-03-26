public abstract class ISolver {
    Solution solution;
    void abstract solve(List<Constraint> constraints);

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ISolver{" +
                "solution=" + solution +
                '}';
    }
}