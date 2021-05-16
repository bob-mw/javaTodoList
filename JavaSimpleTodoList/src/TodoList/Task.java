package TodoList;

public class Task {
	private String title;
	private String describe;
	
	public Task(String title, String describe) {
		this.title = title;
		this.describe = describe;
	}

	public String getTitle() {
		return title;
	}
	
	public String getDescribe() {
		return describe;
	}
	
	@Override
	public String toString() {
		return title + ": " + describe;
	}
	
}
