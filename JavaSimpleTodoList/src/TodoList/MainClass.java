package TodoList;

public class MainClass {
	public static void main(String[] args) {
		
		TskList list = new TskList("Tarefas de casa:");
		
		list.createTask("Lavar lou�a", "Lave pela manh� o excedemte do dia anterior,"
				+ " depois mantenha a lou�a sempre limpa se puder :)");
		
		list.createTask("Limpar o quintal", " Ao limpar o quintal aproveite e regue as plantas)");
		
		list.createTask("Dar ra��o ao cachorros", "Cozinhar ossos e carne para fazer caldo para ra��o");
		
		
		list.getList();
	}
}
