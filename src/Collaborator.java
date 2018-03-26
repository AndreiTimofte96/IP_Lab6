
public class Collaborator extends User implements ICanTeach{
	public Collaborator(String name) {
		super(name);
	}

	@Override
	public void addPreference(String preference) {
		System.out.println("Collab preference");
		preferences.add(preference);
	}
}
