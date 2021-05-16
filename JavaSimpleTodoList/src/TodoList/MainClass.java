package TodoList;

public class MainClass {
	public static void main(String[] args) {
		Task task1 = new Task("Estudar Querys SQL", "Focar em filtrar dados");
		Task task2 = new Task("Estudar como conectar mysql com Java", "Fazer projeto durante o aprendizado");
		TskList list = new TskList();
		
		list.add(task1);
		list.add(task2);
		
		System.out.println(list.getList());
	}
}
