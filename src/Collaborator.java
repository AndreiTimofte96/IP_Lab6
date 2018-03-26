
public class Collaborator extends User implements ICanTeach {
    public Collaborator(String name) {
        super(name);
    }

    @Override
    public void addPreference(String preference) {
        preferences.add(preference);
    }
}
