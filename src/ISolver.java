import java.util.*;

public abstract class ISolver {
    protected Solution solution;
    public abstract void solve(List<Constraint> constraints);

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