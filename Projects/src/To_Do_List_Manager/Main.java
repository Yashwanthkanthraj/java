package To_Do_List_Manager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		Scanner scanner = new Scanner(System.in);
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("-------To Do List Menu -------");
			System.out.println("1. add task");
			System.out.println("2. delete task");
			System.out.println("3. mark task as complete");
			System.out.println("4. list all tasks");
			System.out.println("5. Exiting");
			System.out.println("enter your choice");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println(" add a task descripition.");
				String descripition = scanner.nextLine().trim();
				if (!descripition.isEmpty()) {
					toDoList.addTask(descripition);
					
				} else {
					System.out.println(" descripition cannot be empty");
				}
				break;

			case 2:
				toDoList.listAllTasks();
				System.out.println("enter a task number to delete. ");
				int taskNumber = scanner.nextInt();
				scanner.nextLine();
				toDoList.deleteTask(taskNumber);
				break;

			case 3:
				toDoList.listAllTasks();
				System.out.println("enter a task number to complete.");
				int markTask = scanner.nextInt();
				scanner.nextLine();
				toDoList.markTaskCompleted(markTask);
				break;
				
			case 4:
				toDoList.listAllTasks();
				break;
			case 5:
				isRunning = false;
				System.out.println("Exiting To Do List");
				break;
				
			default:
				System.out.println("invalid choice. try again.");
				break;
				
			}
		}
	scanner.close();
	}
}
