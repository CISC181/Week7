package CISC181.Week7.ObservableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;
import javafx.fxml.*;
import javax.swing.event.MenuListener;

public class CollectionsDemo {

	public static void main(String[] args) {

		// Use Java Collections to create the List.
		Map<String, String> map = new HashMap<String, String>();

		// Now add observability by wrapping it with ObservableList.
		Observable observableMap = (Observable) FXCollections.observableMap(map);
		((ObservableMap<String, String>) observableMap).addListener(new MapChangeListener() {


			@Override
			public void onChanged(Change change) {
				System.out.println("Detected a change! ");
				
			}
		});

		// Changes to the observableMap WILL be reported.
		((Map<String, String>) observableMap).put("key 1", "value 1");
		System.out.println("Size: " + ((Map<String, String>) observableMap).size());

		// Changes to the underlying map will NOT be reported.
		map.put("key 2", "value 2");
		System.out.println("Size: " + ((Map<String, String>) observableMap).size());

	}
}
