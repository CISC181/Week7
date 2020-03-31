package CISC181.Week7.ObserableList;

import java.util.List;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;

public class CollectionsDemo {

	public static void main(String[] args) {

		/**
		 * Difference between List<> and ObservableList<>
		 * 
		 * You can implement a 'listener' to fire other events when the list is
		 * altered
		 * 
		 * Override this method: onChanged(ListChangeListener.Change change)
		 */

		// Use Java Collections to create the List.
		List<String> list = new ArrayList<String>();

		// Now add observability by wrapping it with ObservableList.
		ObservableList<String> observableList = FXCollections.observableList(list);
		observableList.addListener(new ListChangeListener() {

			@Override
			public void onChanged(ListChangeListener.Change change) {
				while (change.next()) {
					if (change.wasPermutated()) {
						System.out.println("wasPermutated");
					} else if (change.wasAdded()) {
						System.out.println("wasAdded " + change.getAddedSubList());
					} else if (change.wasRemoved()) {
						System.out.println("wasRemoved " + change.getRemoved());
					} else if (change.wasUpdated()) {
						System.out.println("wasUpdated");
					}
				}

			}
		});

		// Changes to the observableList WILL be reported.
		// This line will print out "Detected a change!"
		observableList.add("item one");

		// This will fire a change
		observableList.set(0, "test");

		// This will NOT fire a change
		System.out.println(observableList.get(0));

		// This will fire a change
		observableList.remove(0);

		// Changes to the underlying list will NOT be reported
		// Nothing will be printed as a result of the next line.
		list.add("item two");

		System.out.println("Size: " + observableList.size());

	}
}