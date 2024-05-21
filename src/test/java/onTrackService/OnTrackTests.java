package onTrackService;
import org.junit.jupiter.api.Test;

import onTrackService.OnTrackService;
import onTrackService.OnTrackService.Task;
import onTrackService.OnTrackService.TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class OnTrackTests {
	private OnTrackService.TaskService taskService;


	@BeforeEach
	public void setup() {
		taskService = new OnTrackService.TaskService();
		
	}
	
	@Test
	public void testStudentIdentity() {
	String studentId = "s223561446";
	assertNotNull("Student ID is null", studentId);
	}
	@Test
	public void testStudentName() {
	String studentName = "Sandriya";
	assertNotNull("Student name is null", studentName);
	}

	 // Task Collaboration Test Cases
	  
	  @Test
	  public void testCreateTask() { 
		  Task task = taskService.createTask("Collaborative Task", "This is a collaborative task.", "student1"); 
		  assertNotNull(task); assertEquals("Collaborative Task", task.getTitle()); 
		  assertEquals("This is a collaborative task.",task.getDescription()); }

	@Test
	public void testAddCollaborator() {
		Task task = taskService.createTask("Collaborative Task", "This is a collaborative task.", "student1");
		int taskId = task.getId();
		boolean success = taskService.addCollaborator(taskId, null);
		assertTrue(success);
		assertTrue(task.getCollaborators().contains("student2"));
	}
	@Test
	public void testCreateTaskWithEmptyTitleAndDescription() {
	    Task task = taskService.createTask("", "", "student1");
	    assertNotNull(task);
	    assertEquals("", task.getTitle());
	    assertEquals("", task.getDescription());
	}
}



