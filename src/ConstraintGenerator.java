public class ConstraintGenerator {
    private List <Constraint> constraints;

    //method injection
    void generateConstraints(List <String> preferences){
        for (String preference: preferences){
            constraints.add(new Constraint(preference));
        }
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ConstraintGenerator{" +
                "constraints=" + constraints +
                '}';
    }
}
