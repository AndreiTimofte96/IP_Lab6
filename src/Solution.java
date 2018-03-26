public class Solution {
    private int nrPreferencesFulfilled;
    Map <User, String> timetable;

    Solution(){
        nrPreferencesFulfilled = 0;
        timetable = new HashMap<>();
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
