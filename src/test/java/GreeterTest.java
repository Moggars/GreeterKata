import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;


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

    @Test
    public void testGreetFirstLetterOfNameCapitalised(){
        String nameWithLowerCase = "dale";

        String greeting = greeter.greet(nameWithLowerCase);

        assertEquals(expectedOutput,greeting);
    }

    @Test
    public void testMorningGreeting() {
       //Will have to mockTime
        String output = greeter.greet("Dale");

        assertEquals("Good morning Dale", output);
    }
}