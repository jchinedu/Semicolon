package testClassTask;
import Class_Task.ClassTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassTaskTest {

    private ClassTask task;

    @BeforeEach
    void setUp() {
        task = new ClassTask();
    }

    @Test
    public void newTask_isOffByDefault() {
        assertFalse(task.isOn(), "Task should be off by default");
    }

    @Test
    public void toggle_turnsOn_whenInitiallyOff() {
        boolean result = task.toggle();
        assertTrue(result, "Toggling when off should turn it on");
        assertTrue(task.isOn(), "isOn should return true after first toggle");
    }

    @Test
    public void toggle_turnsOff_whenInitiallyOn() {
        task.toggle();
        boolean result = task.toggle();
        assertFalse(result, "Toggling when on should turn it off");
        assertFalse(task.isOn(), "isOn should return false after second toggle");
    }

    @Test
    public void toggle_multipleTimes_flipsStateEachTime() {
        assertFalse(task.isOn());

        task.toggle();
        assertTrue(task.isOn());

        task.toggle();
        assertFalse(task.isOn());

        task.toggle();
        assertTrue(task.isOn());
    }
}
