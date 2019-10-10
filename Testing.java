import cse360assign2.AddingMachine;
import jdk.internal.jline.internal.TestAccessible;

public class Testing
{
    @Test
    public void addingTest()
    {
        AddingMachine tester = new AddingMachine();
        assertEquals(1, tester.add(1), "Adding 1 to the init should equal 1");
        assertEquals(2, tester.add(1), "Adding 1 to current total should equal 2");
    }

    @Test
    public void subtractingTest()
    {
        AddingMachine tester = new AddingMachine();
        assertEquals(-1, tester.subtract(1), "Subtracting 1 from the init should equal -1");
        assertEquals(-2, tester.subtract(1), "Subtracting 1 from the init should equal -2");
    }


}