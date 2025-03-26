package To_Do_List_Manager;

import java.util.ArrayList;

public class ToDoList {
	private ArrayList<Task> tasks;
	
	public ToDoList() {
		tasks = new ArrayList<>();
	}

	
	public void addTask(String descripition) {

		tasks.add(new Task(descripition));
		System.out.println("task added :" + descripition);
	}
	
	public void deleteTask(int taskNumber) {
		int index = taskNumber - 1;

		if (index < 0 || index >= tasks.size()) {
			System.out.println("invalid task number.");
			return;
		}
		String descripition = tasks.get(index).getDescription();
		tasks.remove(index);
		System.out.println("task deleted :" + descripition);
	}
	
	public void markTaskCompleted(int taskNumber) {
		int index = taskNumber-1;
		if (index < 0 || index >= tasks.size()) {
			System.out.println("invalid task number.");
			return;
		}
		tasks.get(index).markAsCompleted();
		System.out.println("task marked as complete :" + tasks.get(index).getDescription());
	}
	
	public void listAllTasks() {
		if (tasks.isEmpty()) {
			System.out.println(" no tasks added in the list. add task first.");
			return;
		}
		
		System.out.println("\n-----list of all tasks -----");
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + ". " + tasks.get(i).toString());
			
		}
	}
}
