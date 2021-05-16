package TodoList;

import java.util.*;

public class TskList {
	
	private ArrayList<Task> list = new ArrayList<>();
	private String name;
	
	public TskList(String name) {
		this.name = name;
	}
	
	public void getList() {
		System.out.println(name);
		 for(int key = 0; key < list.size(); key++) {
				System.out.println(key + "| " +list.get(key) + ",");
		}
	}
	
	public void createTask(String title, String describe) {
		Task task = new Task(title, describe);
		list.add(task);
	}
	
		
}
