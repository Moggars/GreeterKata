public class Greeter {

    private final String HELLO = "Hello ";

    private final TimeService timeService;

    public Greeter(TimeService timeService) {
        this.timeService = timeService;
    }


    public String greet(String name){

        name = name.trim();
        name = capitaliseFirstLetter(name);

        String greeting = getGreetingBasedOnTime();

        String output = greeting + name;
        return output;
    }

    public String capitaliseFirstLetter(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public String getGreetingBasedOnTime() {

        int hour = timeService.getHourOfDay();

        if (hour >= 6 && hour <= 12) {
            return "Good morning ";
        } else {
            return HELLO;
        }
    }
}
