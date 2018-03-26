import java.util.ArrayList;
import java.util.List;

public interface ICanTeach {
	List<String> preferences = new ArrayList<String>();
//	public void addPreference(String preference);
	public default void addPreference(String preference) {
		preferences.add(preference);
	}
	
	public default List<String> getPreferences() {
		return preferences;
	}
}
