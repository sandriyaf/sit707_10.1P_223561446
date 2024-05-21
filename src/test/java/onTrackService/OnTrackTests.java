package onTrackService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OnTrackTests {
	@Test
    public void testCreateTask() {
        OnTrackService.TaskService taskService = new OnTrackService.TaskService();
        OnTrackService.Task task = taskService.createTask("Math Homework", "Solve problems 1-10", "student1");

        assertNotNull(task, "Task should not be null");
        assertEquals(1, task.getId(), "Task ID should be 1");
        assertEquals("Math Homework", task.getTitle(), "Task title should match");
        assertEquals("Solve problems 1-10", task.getDescription(), "Task description should match");
        assertEquals("student1", task.getCreator(), "Task creator should match");
    }
}



