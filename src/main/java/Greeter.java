public class Greeter {

    public String greet(String name){
        final String hello = "Hello ";
        name = name.trim();
        String output = hello + name;
        return output;
    }
}
