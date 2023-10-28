import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GreeterTest {

    private Greeter greeter;
    private final String expectedOutput = "Hello Dale";
    private TimeService timeService;

    @BeforeEach
    public void setUp() {
        timeService = mock(TimeService.class);
        greeter = new Greeter(timeService);
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

        when(timeService.getHourOfDay()).thenReturn(10);

        String output = greeter.greet("Dale");

        assertEquals("Good morning Dale", output);
    }

    @Test
    public void testEveningGreeting() {

        when(timeService.getHourOfDay()).thenReturn(19);

        String output = greeter.greet("Dale");

        assertEquals("Good evening Dale", output);
    }
}