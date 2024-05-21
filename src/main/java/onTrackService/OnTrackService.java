package onTrackService;

import java.util.*;

public class OnTrackService {
	
	
    // Task Service
    public static class TaskService {
        private Map<Integer, Task> tasks = new HashMap<>();
        private int taskIdCounter = 1;

        public Task createTask(String title, String description, String creator) {
            Task task = new Task(taskIdCounter++, title, description, creator);
            tasks.put(task.getId(), task);
            return task;
        }

        public boolean addCollaborator(int taskId, String collaborator) {
            Task task = tasks.get(taskId);
            if (task != null) {
                return task.addCollaborator(collaborator);
            }
            return false;
        }
    }

    public static class Task {
        private int id;
        private String title;
        private String description;
        private String creator;
        private List<String> collaborators = new ArrayList<>();

        public Task(int id, String title, String description, String creator) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.creator = creator;
        }

        public int getId() {
            return id;
        }

        public boolean addCollaborator(String collaborator) {
            if (!collaborators.contains(collaborator)) {
                collaborators.add(collaborator);
                return true;
            }
            return false;
        }

        public List<String> getCollaborators() {
            return collaborators;
        }

		public String getTitle() {
			// TODO Auto-generated method stub
			return title;
			
		}

		public String getDescription() {
			// TODO Auto-generated method stub
			return description;
		}

		public String getCreator() {
			// TODO Auto-generated method stub
			return creator;
		}
    }

    

}
