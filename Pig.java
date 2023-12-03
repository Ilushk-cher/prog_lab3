public class Pig extends Character {
    private State state;

    Pig(String name, Place localPlace, State state) {
        super(name, localPlace);
        this.state = state;
    }

    public void say(String message) {
        System.out.println(this.getName() + " кричит: " + message);
    }

}
