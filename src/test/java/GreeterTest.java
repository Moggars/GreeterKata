import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    private Greeter greeter;
    private final String expectedOutput = "Hello Dale";
    @BeforeEach
    public void setUp() {
        greeter = new Greeter();
    }

    @Test
    public void testGreetReturnsHelloName() {
        String name = "Dale";
        String notExpectedOutput = "Hello ";

        String greeting = greeter.greet(name);

        assertNotNull(greeting);
        assertEquals(this.expectedOutput, greeting);
        assertNotEquals(notExpectedOutput, greeting);
    }

    @Test
    public void testGreetReturnsHelloNameTrimmed() {
        String name = " Dale ";
        String notExpectedOutput = "Hello  Dale ";

        String greeting = greeter.greet(name);

        assertNotNull(greeting);
        assertNotEquals(notExpectedOutput, greeting);
        assertEquals(expectedOutput, greeting);
    }
}