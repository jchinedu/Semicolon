package Class_Task;

public class ClassTask {
    private boolean isOn = false;

    public boolean toggle() {
        isOn = !isOn; // flips the value
        return isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}


