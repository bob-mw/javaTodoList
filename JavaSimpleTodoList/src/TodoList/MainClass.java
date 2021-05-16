package TodoList;

public class MainClass {
	public static void main(String[] args) {
		Task task1 = new Task("Estudar Querys SQL", "Focar em filtrar dados");
		Task task2 = new Task("Estudar como conectar mysql com Java", "Fazer projeto durante o aprendizado");
		Task task3 = new Task("Praticar Array em java", "Editar elemento de um array");
		TskList list = new TskList();
		
		list.add(task1);
		list.add(task2);
		list.add(task3);
		
		list.getList();
	}
}
