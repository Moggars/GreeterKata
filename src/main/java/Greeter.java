public class Greeter {

    public String greet(String name){
        final String hello = "Hello ";
        name = name.trim();
        name = capitaliseFirstLetter(name);
        String output = hello + name;
        return output;
    }

    public String capitaliseFirstLetter(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}
