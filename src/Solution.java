public class Solution {
    private int nrPreferencesFulfilled;
    Timetable timetable;

    Solution() {
        nrPreferencesFulfilled = 0;
        timetable = new Timetable();
    }

    public int getNrPreferencesFulfilled() {
        return nrPreferencesFulfilled;
    }

    public void setNrPreferencesFulfilled(int nrPreferencesFulfilled) {
        this.nrPreferencesFulfilled = nrPreferencesFulfilled;
    }

    public Map<User, String> getTimetable() {
        return timetable;
    }

    public void setTimetable(Map<User, String> timetable) {
        this.timetable = timetable;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Solution{" +
                "nrPreferencesFulfilled=" + nrPreferencesFulfilled +
                ", timetable=" + timetable +
                '}';
    }
}
