package TodoList;

public class MainClass {
	public static void main(String[] args) {
		Task task = new Task("Estudar Querys SQL", "Focar em filtrar dados");
		
		System.out.println(task.getTitle());
	}
}
