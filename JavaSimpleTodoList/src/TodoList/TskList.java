package TodoList;

import java.util.*;

public class TskList {
	
	private ArrayList<Task> list = new ArrayList<>();
	
	public void getList() {
		 for(int key = 0; key < list.size(); key++) {
				System.out.println(key + "| " +list.get(key) + ",");
		}
	}
	
	public void add(Task task) {
		list.add(task);
	}
	
		
}
