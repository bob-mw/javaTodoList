package TodoList;

public class MainClass {
	public static void main(String[] args) {
		
		TskList list = new TskList("Tarefas de casa:");
		
		list.createTask("Lavar louça", "Lave pela manhã o excedemte do dia anterior,"
				+ " depois mantenha a louça sempre limpa se puder :)");
		
		list.createTask("Limpar o quintal", " Ao limpar o quintal aproveite e regue as plantas)");
		
		list.createTask("Dar ração ao cachorros", "Cozinhar ossos e carne para fazer caldo para ração");
		
		
		list.getList();
	}
}
