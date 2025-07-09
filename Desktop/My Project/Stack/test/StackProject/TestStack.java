package StackProject;
import StackProject.StackMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    private StackMethods newstack;


    @BeforeEach
    public void StartWithThis(){

        newstack = new StackMethods(4);
    }

    @Test
    public void newStack_isEmptyTest(){
        assertTrue(newstack.isEmpty());;
    }
    @Test
    public void pushNewStackElement_StackisNotEmpty(){
        assertTrue(newstack.isEmpty());
        newstack.push("G-String");
        assertFalse(newstack.isEmpty());
    }
    @Test
    public void pushOne_popOne_stackIsEmptyTest(){
        assertTrue(newstack.isEmpty());
        newstack.push("G-String");
        assertFalse(newstack.isEmpty());
        newstack.pop();
        assertTrue(newstack.isEmpty());
    }
    @Test
    public void PushTwice_PopTwo_StackisEmpty(){
        assertTrue(newstack.isEmpty());
        newstack.push("G-String");
        newstack.push("G-String");
        assertFalse(newstack.isEmpty());
        newstack.pop();
        assertFalse(newstack.isEmpty());
    }
    @Test
    public void pushX_PopDhouldReturnXTest(){
        newstack.push("G-String");
        assertEquals("G-String", newstack.pop());
    }
    @Test
    public void pushXAndY_popShouldReturnXAndYTest(){
        newstack.push("D-String");
        newstack.push("G-String");
        assertEquals("G-String", newstack.pop());
    }
    @Test
    public void ShouldThrowUnderFlowException_WhenEmptyStackIsPopped(){
        newstack.isEmpty();
        assertTrue(newstack.isEmpty());
        assertThrows(StackUnderFlowException.class, () -> newstack.pop());
    }
    @Test
    public void pushXYZ_popShouldReturnXYZTest(){
        newstack.push("G-String");
        newstack.push("A-String");
        newstack.push("D-String");
        assertEquals("D-String", newstack.pop());
        assertEquals("A-String", newstack.pop());
        assertEquals("G-String", newstack.pop());
    }
}
