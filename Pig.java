public class Pig extends Character {
    private State state;

    Pig(String name, Place localPlace, State state) {
        super(name, localPlace);
        this.state = state;
        System.out.println(this.getName() + " " + this.getState());
    }

    public void say(String message) {
        System.out.println(this.getName() + " кричит: \"" + message + "\"");
    }

    public String getState() {
        return this.state.toString();
    }

    public void jump() {
        System.out.println(this.getName() + " прыгает на месте");
    }
}
