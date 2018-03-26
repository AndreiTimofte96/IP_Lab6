public interface ISolver {
    Solution solution;
    void solve(List<Constraint> constraints);
}