public class Owl extends Character {
    Owl(String name, Place localPlace) {
        super(name, localPlace);
    }

    public void say(String message) {
        System.out.println(this.getName() + " объясняет: \"" + message + "\"");
    }
}
