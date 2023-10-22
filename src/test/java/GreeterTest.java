import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    @Test
    public void greetReturnsHelloName(){
        Greeter greeter = new Greeter();
        String name = "Dale";
        String expectedOutput = "Hello Dale";
        String notExpectedOutput ="Hello ";

        String greeting = greeter.greet(name);

        assertNotNull(greeting);
        assertEquals(expectedOutput,greeting);
        assertNotEquals(notExpectedOutput,greeting);
    }
}

