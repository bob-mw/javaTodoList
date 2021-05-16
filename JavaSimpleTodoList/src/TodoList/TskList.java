package TodoList;

import java.util.*;

public class TskList {
	
	private ArrayList<Task> list = new ArrayList<>();
	
	public ArrayList<Task> getList() {
		return list;
	}
	
	public void add(Task task) {
		list.add(task);
	}
		
}
