
package To_Do_List_Manager;

public class Task {

	private String descripition;
	private boolean isCompleted;

	public Task(String descripition) {
		this.descripition = descripition;
		this.isCompleted = false;
	}

	public void markAsCompleted() {

		isCompleted = true;

	}

	public String getDescription() {
		return descripition;
	}

	public boolean getStatus() {
		return isCompleted;
	}

	@Override
	public String toString() {
		return (isCompleted ? "[completed] " : "[not completed] ") + descripition;
	}

}
