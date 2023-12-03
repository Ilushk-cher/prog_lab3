
public interface Talking {
    void say(String message);

    static void ask(Character fromWho, Character toWho, String message) {
        System.out.println(fromWho.getName() + " спрашивает " + toWho.getName() + ": \"" + message + "\"");
    }

    static void answer(Character fromWho, Character toWho, String message) {
        System.out.println(fromWho.getName() + " отвечает " + toWho.getName() + ": \"" + message + "\"");
    }
}
